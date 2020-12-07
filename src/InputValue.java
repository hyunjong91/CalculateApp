
	public class InputValue {
		  static String[] input = GugudanInput.inputNumber();
		
			
		  private static int first = Integer.parseInt(input[0]);

		  private static int second= Integer.parseInt(input[1]); ;

		  public InputValue(int first, int second) {
		      InputValue.first = first;
		      InputValue.second = second;
		  }

		  public static int getFirst() {
		      return first;
		  }

		  public static int getSecond() {
		      return second;
		  }
		}
	
	
	

