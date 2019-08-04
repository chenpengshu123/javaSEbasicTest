public class ShuiXianFlowers{
    public static void main(String[] args){
		for(int i=100;i<=9999;i++){
			int unitPlace =i/1%10;
			int tenPlace =i/10%10;
			int hundredPlace =i/100%10;
			if(Math.pow(unitPlace,3)+Math.pow(tenPlace,3)+Math.pow(hundredPlace,3)==i){
				System.out.println(i);
			}
			
		}
	}
}