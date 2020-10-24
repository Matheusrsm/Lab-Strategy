package printer;

import java.util.Scanner;

import printer.type.Print;
import printer.type.Type;

public class Printer {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digit your text here: ");
		String text = input.nextLine();
		System.out.print("What is the type of your print? (1) Italic, (2) Bold, (3) Uppercase, (4) Lowercase: ");
		int type = input.nextInt();
		Type printType = Type.values()[type - 1];
		
		Print print = printType.getType();
		String formatedText = print.print(text);
		System.out.println(formatedText);
		input.close();
	}

}
