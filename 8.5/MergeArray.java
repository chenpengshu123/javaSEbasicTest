import java.util.Arrays;
public class Array{
	public static void main(String[] args){
		//数组合并
		int[] a = {1,7,9,11,13,15,17,19};
		int[] b = {2,4,6,8,10};
		int[] result = Arrays.copyOf(a,a.length + b.length);
		System.arraycopy(b,0,result,a.length,b.length);
		System.out.println(Arrays.toString(result));
	}
}