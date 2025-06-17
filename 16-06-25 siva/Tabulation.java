import java.util.Arrays;
public class Tabulation {

	public static void main(String[] args) {
		long[]memo=new long[100];
		memo[0]=0;
		memo[1]=1;
		System.out.println(fibTabulation(20,memo));
		System.out.println(Arrays.toString(memo));
	

	}
	public static long fibTabulation(int n,long[]memo) {
		if(memo.length>=n) {
			for(int i=2;i<memo.length;i++) {
				long val=memo[i-1]+memo[i-2];
				memo[i]=val;
			}
			return memo[n];
		}
		System.out.println("Insufficient memory in memo"+memo.length);
		return -1;
}
}