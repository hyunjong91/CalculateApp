public class Gugudan {

	public static void main(String[] args) {
		
		int first = InputValue.getFirst();
		int second = InputValue.getSecond();
		int[] result = GugudanCal.calculator(first, second);
		GugudanOutput.print(result, first, second);
		
	

}
}
