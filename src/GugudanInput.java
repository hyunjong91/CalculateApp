import java.util.Scanner;

public class GugudanInput{
	public static String[] inputNumber() {
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		return splitedValue;
	}
}