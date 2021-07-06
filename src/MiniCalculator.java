
import java.util.Scanner;
import static java.lang.System.out;

public class MiniCalculator {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			out.println("Welcome to the mini calculator.");

			double first = Double.parseDouble(keyboard.findInLine("\\d+"));
			char operation = keyboard.findInLine("[+-\\\\*/]").charAt(0);
			double second = Double.parseDouble(keyboard.findInLine("\\d+"));
			double result;

			switch (operation) {
				case '+':
					result = first + second;
					break;
				case '-':
					result = first - second;
					break;
				case '*':
					result = first * second;
					break;
				case '/':
					result = first / second;
					break;
				default:
					return;
			}

			out.printf("Result: %.2f", result);
		}
	}
}
