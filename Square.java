public class Square{
	public static void main(String[] args) {
    int line = 5; // 正方形的总行数(5行5列)
    for (int i = 1; i <= line; i++) { // 控制行
        for (int j = 1; j <= line; j++) { // 控制列
            if (i == 1 || i == line) { // 如果是第一行或者是最后一行则打印星号
               System.out.print("-");
                    }             
                 else if (j == 1 || j == line) { // 如果是第一列或者是最后一列则打印星号
                    System.out.print("| ");
                   }               
	                 else {
                     System.out.print("  "); // 如果不是第一行、最后一行、第一列、最后一列则打印空格
                }
             }
                  System.out.print("\n"); // 换行
         }
    }
}
