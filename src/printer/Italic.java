package printer;

public class Italic implements Print {

	public String print(String text) {
		return "\033[3m" + text + "\033[0m";
	}

}