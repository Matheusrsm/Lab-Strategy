package printer.type;

public class Bold implements Type {

	public String print(String text) {
		return "\033[0;1m" + text + "\033[0m";
	}

}