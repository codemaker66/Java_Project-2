package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomDataIntoFile implements ISymptomWriter {

	/**
	 * This method order the map that we get and print the result in a new file.
	 * 
	 * @see com.hemebiotech.analytics.ISymptomWriter#writeFile(map)
	 */
	public void writeFile(Map<String, Integer> map) {

		FileWriter writer = null;

		try {

			TreeMap<String, Integer> data = new TreeMap<String, Integer>();

			data.putAll(map);

			writer = new FileWriter("result.out");

			for (Map.Entry<String, Integer> entry : data.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				writer.write(key + " : " + value + "\n");
			}

		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {

			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
