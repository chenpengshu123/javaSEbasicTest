public class Square2{
	public static void main(String[] args){
		for(int i=0;i<11;i++){// 11行11列的正方形
			if(i>0&&i<10){// 打印出中间空的情况
				for(int j=0;j<11;j++){// 打印列
					if(j==0||j==10){// 打印第一列或最后一列
						System.out.print("* ");// 输出星和一个空格
					}
					else if(j>=1 && j<=9){// 中间九列
						System.out.print("  ");//输出两个空格
					}
				}
			}
			else if(i==0||i==10){// 第一行和最后一行
				for(int z=0;z<11;z++){
				System.out.print("* ");// 全部都输出“*”
				}
			}
			System.out.println("");
		}
	}
}