public class Square{
	public static void main(String[] args) {
    int line = 5; // �����ε�������(5��5��)
    for (int i = 1; i <= line; i++) { // ������
        for (int j = 1; j <= line; j++) { // ������
            if (i == 1 || i == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
               System.out.print("-");
                    }             
                 else if (j == 1 || j == line) { // ����ǵ�һ�л��������һ�����ӡ�Ǻ�
                    System.out.print("| ");
                   }               
	                 else {
                     System.out.print("  "); // ������ǵ�һ�С����һ�С���һ�С����һ�����ӡ�ո�
                }
             }
                  System.out.print("\n"); // ����
         }
    }
}
