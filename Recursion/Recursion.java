public class Recursion{
						//10
	public static long sum(int n){
		String name="Ahmad" + n;
		if(n == 0){
			return n;
		}else{
			n += sum(n-1);
		}	
		
		return n;
	}

	public static void main(String...a){
		long output = sum(10);
		System.out.println(output);
		
		/*int sum =0;
		for(int i=0; i<=10; i++){
			sum+= i;
		}
		System.out.println(sum);
		*/
	}	
}
