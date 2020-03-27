package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will read symptom data from a source. The important part is the
 * return value from the operation, which is a map that contains strings and
 * integers which are both respectively a key and a it's value.
 * 
 * The implementation does not need to order the map.
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty map.
	 * 
	 * @return a raw map of all Symptoms obtained from a data source.
	 */
	Map<String, Integer> getSymptoms();
}
