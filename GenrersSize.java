/*
 * Author luvo
 *
 */
package test.GenrerSize;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class GenrersSize {

	private int music;
	private int image;
	private int movies;
	private int other;
	private HashMap<String, String> map;
	private ArrayList<String> types;
	private ArrayList<String> size;
	// endregion

	// region Public Members
	public GenrersSize() {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		types = new ArrayList<String>();
		size = new ArrayList<String>();

	}

	public void mapGenreSize(StringReader input) {
		Scanner read = new Scanner(input);
		String temp = "";
		while (read.hasNext()) {
			temp = read.nextLine();
			String[] diskfiles = temp.split(" ");
			map.put(diskfiles[0].substring(diskfiles[0].lastIndexOf('.') + 1, diskfiles[0].length()), diskfiles[1]);

		}
		read.close();
	}

	public String getResultsMaped() {
		for (Entry<String, String> typ : map.entrySet()) {
			types.add(typ.getKey());
			size.add(typ.getValue());
		}

		return null;
	}

	// endregion
}
