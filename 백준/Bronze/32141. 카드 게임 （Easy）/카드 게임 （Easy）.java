import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++){
		    int r = Integer.parseInt(st.nextToken());
		    
		    H-=r;
		    
		    if(H <=0) {
		        System.out.println(i);
		        return;
		    }
		}
		
		System.out.println(-1);
	}
}
