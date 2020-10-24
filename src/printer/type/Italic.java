package printer.type;

public class Italic implements Type {

	public String print(String text) {
		return "\033[3m" + text + "\033[0m";
	}

}