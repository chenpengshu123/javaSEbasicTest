public class Chicken{
	public static void main(String[] args){
            //公鸡的上限
            for (int x = 0; x < 20; x++)
            {
                //母鸡的上限
                for (int y = 0; y < 33; y++)
                {
                    //剩余小鸡
                    int z = 100 - x - y;

                    if ((z%3==0) && (x * 5 + y * 3 + z / 3 == 100))
                    {
                        System.out.println("公鸡"+x+"\t"+"母鸡"+y+"\t"+"小鸡"+z);
                    }
                }
            }
        }
    }