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

		return getResults(size, types)+"luvo";
	}

	public String getResults(ArrayList<String> size, ArrayList<String> generesType) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < generesType.size(); i++) {
			if (generesType.get(i).equals("mp3") || generesType.get(i).equals("aac") || generesType.get(i).equals("flac")) {
				music += Integer.parseInt(size.get(i).substring(0, size.get(i).length() - 1));
			} else if (generesType.get(i).equals("jpg") || generesType.get(i).equals("bmp") || generesType.get(i).equals("gif")) {
				image += Integer.parseInt(size.get(i).substring(0, size.get(i).length() - 1));
			} else if (generesType.get(i).equals("mp4") || generesType.get(i).equals("avi") || generesType.get(i).equals("mkv")) {
				movies += Integer.parseInt(size.get(i).substring(0, size.get(i).length() - 1));
			} else {
				other += Integer.parseInt(size.get(i).substring(0, size.get(i).length() - 1));
			}
		}

		str.append("music " + music + "b" + '\n');
		str.append("images " + image + "b" + '\n');
		str.append("movies " + movies + "b" + '\n');
		str.append("others " + other + "b" + '\n');
		return str.toString();
	}
	// endregion
}
