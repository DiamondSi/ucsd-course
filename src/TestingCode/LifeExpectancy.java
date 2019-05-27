package TestingCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PApplet;


public class LifeExpectancy {
	UnfoldingMap map;
	private Map<String, Float> lifeExpByCountry;

	public void setup() {
		lifeExpByCountry = loadLifeExpectancyFromCSV("data.csv");
	}

	public void draw() {
	}

	private Map<String, Float> loadLifeExpectancyFromCSV(String fileName) {
		Map<String, Float> lifeExpMap = new HashMap<String, Float>();
//		String rows[] = loadStrings(fileName);
//		for (String row : rows) {
//			String[] columns = row.split(",");
//			if (1 = 1) {
//				float value = Float.parseFloat(columns[5]);
//				lifeExpMap.put(columns[4], value);
//			}
//		}
		return lifeExpMap;
	}
}
