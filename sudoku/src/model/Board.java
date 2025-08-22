package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Board {
	private ArrayList<ArrayList<Tile>> tiles;
	private static final int BOARD_SIZE = 9;

	public Board(Map<String, String> positionData) {
		ArrayList<ArrayList<Tile>> tiles = new ArrayList<ArrayList<Tile>>();
		for (int i = 0; i < BOARD_SIZE; i++) {
			tiles.add(new ArrayList<Tile>());
			for (int j = 0; j < BOARD_SIZE; j++) {
				String[] positionAttributes = positionData.get("%s,%s".formatted(i, j)).split(",");
				tiles.get(i).add(
						new Tile(Integer.parseInt(positionAttributes[0]), Boolean.parseBoolean(positionAttributes[1])));
			}

		}
		this.tiles = tiles;

	}

	public ArrayList<ArrayList<Tile>> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<ArrayList<Tile>> tiles) {
		this.tiles = tiles;
	}
	
}
