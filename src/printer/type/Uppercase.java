package printer.type;

public class Uppercase implements Type {

	public String print(String text) {
		return text.toUpperCase();
	}
}
