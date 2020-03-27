package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Will get a map that contain all the symptoms and there correct count.
 * 
 * This implementation will order the map alphabetically.
 */
public interface ISymptomWriter {

	/**
	 * If no data is available, return an empty map.
	 * 
	 * @param map contains all the symptoms with there correct count.
	 */
	void writeFile(Map<String, Integer> map);

}
