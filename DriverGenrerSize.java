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
}