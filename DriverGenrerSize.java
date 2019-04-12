public class DriverGenrerSize{
	private static GenrersSize genrerssize;

	// endregion
	public DriverGenrersSize() {

		genrerssize = new GenrersSize();
	}

	// region Public Members

	public String solution(String S) {
		genrerssize.mapGenreSize(new StringReader(S));
		String resultString = genrerssize.getResultsMaped();

		return resultString;
	}
	
	public static void main(String[] args) {
		DriverGenrersSize gs = new DriverGenrersSize();
		String s = "my.song.mp3 11b" + '\n' + "greatSong.flac 1000b" + '\n' + "not3.txt 5b" + '\n' + "video.mp4 200b" + '\n' + "game.exe 100b" + '\n' + "mov!e.mkv 10000b";
		System.out.print(gs.solution(s));
	}
}