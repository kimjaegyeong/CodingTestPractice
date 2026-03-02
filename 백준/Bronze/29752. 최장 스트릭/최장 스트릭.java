import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans =0;
		int sum = 0;
		StringTokenizer st =new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
		    int n = Integer.parseInt(st.nextToken());
		    
		    if(n == 0 ){
		        ans = Math.max(ans, sum);
		        sum =0;
		        continue;
		        
		    }
		    sum++;
		}
		
		ans = Math.max(ans, sum);
		System.out.println(ans);
	}   
}
