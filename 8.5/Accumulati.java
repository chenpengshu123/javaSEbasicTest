public class  Accumulati{
	public static void main(String[] args){
		int result = 0;
		for(int i=1;i<=100;i++){
			if(i%10 != 3){
				result += i;
			}
		}
		System.out.println(result);
	}
}