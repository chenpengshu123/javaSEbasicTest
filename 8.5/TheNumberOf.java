public class TheNumberOf {
    /**
     * ��1000���ڵ���������
     * ������һ�������ǡ�õ���������֮��
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