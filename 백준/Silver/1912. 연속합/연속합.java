import java.util.*;
import java.io.*;
public class Main
{
    static int N;
    static int[] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
		    map[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[N+1];
		int max = map[0];
		dp[0] = map[0];
		
		for(int i=1; i<N; i++){
		    dp[i]= Math.max(dp[i-1] + map[i], map[i]);
		    max = Math.max(max, dp[i]);
		    
		}
		
		
        System.out.println(max);
		
	}
}
