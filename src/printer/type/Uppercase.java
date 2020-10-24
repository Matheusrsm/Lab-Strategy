package printer.type;

public class Uppercase implements Print {

	public String print(String text) {
		return text.toUpperCase();
	}
}
