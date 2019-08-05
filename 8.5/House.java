public class House{
	public static void main(String[] args){
		// ´òÓ¡·¿×Ó
		for(int i=5;i>=1;i--){
			for(int j=1;j<=14;j++){
				if(j == i){
					System.out.print("*****");
				}else if(j == 11-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int a=1;a<=5;a++){
			if(a == 1 || a == 5){
				for(int b=1;b<=14;b++){
					System.out.print("*");
				}
			}
			else{
				for(int c=1;c<=14;c++){
				    if(c==1 || c==14){
					    System.out.print("*");
				    }
					else{
					    System.out.print(" ");
				    }
			    }
			}
			System.out.println();
		}
	}
}