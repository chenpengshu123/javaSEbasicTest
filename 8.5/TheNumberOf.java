public class TheNumberOf {
    /**
     * 求1000以内的所有完数
     * 完数：一个数如果恰好等于它因子之和
     */
    public static void main(String[] args) 
    {
        int sum=0;
        for(int i=1;i<=1000;i++)
        {
            
            for(int j=1;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                    if(sum==i)
                        System.out.print(i+";");
                }
            }
        }
    }
} 