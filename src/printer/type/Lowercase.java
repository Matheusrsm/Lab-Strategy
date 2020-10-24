package printer.type;

public class Lowercase implements Type {

	public String print(String text) {
		return text.toLowerCase();
	}
}
