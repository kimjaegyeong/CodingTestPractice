import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    StringTokenizer st =new StringTokenizer(br.readLine());
	    
	    long[] map = new long[N];
	    for(int i=0; i<N; i++){
	        map[i] = Long.parseLong(st.nextToken());
	    }
	    
	    long ans = 0;
	    for(int i=0; i<N; i++){
	        for(int j=0; j<N; j++){
	       
	            ans+= Math.abs( map[i] - map[j]);
	        }
	    }
	   System.out.println(ans);
	    
	}
}
