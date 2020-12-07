
public class GugudanCal{
	public static int[] calculator(int first, int second){
	
		int[] result = new int[(first-1)*second];
		for(int i=1;i<first;i++) {
			for(int j = 1;j<=second;j++) {
			result[i] = (i+1)*j;
		
		}	
		}
		return result;
		
}
}