package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomDataIntoFile implements ISymptomWriter {

	/**
	 * @see com.hemebiotech.analytics.ISymptomWriter#writeFile(Map)
	 */
	public void writeFile(Map<String, Integer> map) {

		FileWriter writer = null;

		try {

			Map<String, Integer> data = new TreeMap<>(map);

			writer = new FileWriter("result.out");

			for (Map.Entry<String, Integer> entry : data.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				writer.write(key + " : " + value + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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