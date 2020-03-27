package com.hemebiotech.analytics;

public class AnalyticsCounter {

	/**
	 * This method initialize the program.
	 */
	public void initProgram() {

		ISymptomReader input = new ReadSymptomDataFromFile("symptoms.txt");

		ISymptomWriter output = new WriteSymptomDataIntoFile();

		output.writeFile(input.getSymptoms());

	}

	/**
	 * The main method make sure the program can be launched correctly without
	 * issues.
	 */
	public static void main(String args[]) {

		AnalyticsCounter start = new AnalyticsCounter();

		start.initProgram();

	}
}
