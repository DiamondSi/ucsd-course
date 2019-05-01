package TestingCode;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class MapTesting extends PApplet {
	private UnfoldingMap map;

	public void setup() {
		size(950, 600, OPENGL);
		int mapWidth = 700;
		int mapHeight = 500;
		int mapStartX = (width - mapWidth) / 2;
		int mapStartY=(height-mapHeight)/2;
		// map = new UnfoldingMap(this, 200, 50, 700, 500, new
		// Google.GoogleMapProvider());
		map = new UnfoldingMap(this, mapStartX, mapStartY, mapWidth, mapHeight, new Google.GoogleMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		background(200);
		map.draw();
		// addKey();
	}
}
