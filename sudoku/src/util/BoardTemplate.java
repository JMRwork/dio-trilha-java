package util;

public class BoardTemplate {
	private static final String boardTemplate = "\n%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "------+-------+------\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "------+-------+------\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n"
			+ "%s %s %s | %s %s %s | %s %s %s\n\n";

	public static String get() {
		return boardTemplate;
	}


}
