import java.util.*;
import java.io.*;
public class Main
{
    static int N;
    static int A;
    static int D;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken());
	    A =Integer.parseInt(st.nextToken());
	    D =Integer.parseInt(st.nextToken());
	    
	    st = new StringTokenizer(br.readLine());
	    
	    int cnt = A;    
	    int m = 0;
	    for(int i=0; i<N; i++){
             int n  = Integer.parseInt(st.nextToken());
             
             if(n == cnt) {
                 cnt+=D;
                 m++;
             }
             
	    }
	    
	    System.out.println(m);
	 }
}
