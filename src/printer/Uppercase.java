package printer;

public class Uppercase implements Print {

	public String print(String text) {
		return text.toUpperCase();
	}
}
