public class Square2{
	public static void main(String[] args){
		for(int i=0;i<11;i++){// 11��11�е�������
			if(i>0&&i<10){// ��ӡ���м�յ����
				for(int j=0;j<11;j++){// ��ӡ��
					if(j==0||j==10){// ��ӡ��һ�л����һ��
						System.out.print("* ");// ����Ǻ�һ���ո�
					}
					else if(j>=1 && j<=9){// �м����
						System.out.print("  ");//��������ո�
					}
				}
			}
			else if(i==0||i==10){// ��һ�к����һ��
				for(int z=0;z<11;z++){
				System.out.print("* ");// ȫ���������*��
				}
			}
			System.out.println("");
		}
	}
}