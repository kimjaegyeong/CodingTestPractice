import java.util.*;
import java.io.*;
public class Main
{
    static int N;
    
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    
	    for(int t=0; t<N; t++){
	        StringTokenizer st =new StringTokenizer(br.readLine());
	        int sum = 0;
	        while(st.hasMoreTokens()){
	            sum+= Integer.parseInt(st.nextToken());
	        }
	        
	        System.out.println(sum);
	    }
	}
}
