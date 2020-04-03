package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * @param filepath a full or partial path to file with symptom strings in it,
	 * one per line.
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @see com.hemebiotech.analytics.ISymptomReader#getSymptoms()
	 */
	public Map<String, Integer> getSymptoms() {

		Map<String, Integer> result = new HashMap<String, Integer>();

		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					line = line.trim().toLowerCase();
					if (result.containsKey(line)) {

						result.put(line, result.get(line) + 1);
					} else {
						result.put(line, 1);
					}

					line = reader.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return result;
	}
}