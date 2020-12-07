public class GugudanOutput{
	public static void print(int[] result, int first, int second) {
		for(int i=1;i<first;i++) {
			for(int j = 1;j<=second;j++) {
			System.out.println((i+1)+"*"+j+"="+result[i]);
		
		}	
		}
	}	
}