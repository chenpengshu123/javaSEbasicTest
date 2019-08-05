import java.util.Scanner;

public class DataEncryption{
	public static void main(String[] args){
		
		//数据加密
		Scanner scanner = new Scanner(System.in);
		System.out.print("您要传递的数据是：");
		int num = scanner.nextInt();
		int unitPlace = num % 10;
		int tenPlace = num % 100 / 10;
		int hundredPlace = num % 1000 / 100;
		int thousandPlace = num % 10000 / 1000;
		int newunitPlace = (thousandPlace+5)%10;
		int newTenPlace = (hundredPlace+5)%10;
		int newhundredPlace = (tenPlace+5)%10;
		int newthousandPlace = (unitPlace+5)%10;
		int result = newthousandPlace*1000 + newhundredPlace*100 + newTenPlace*10 + newunitPlace;
		System.out.println("加密后的数据为："+result);
		
		
	}
}