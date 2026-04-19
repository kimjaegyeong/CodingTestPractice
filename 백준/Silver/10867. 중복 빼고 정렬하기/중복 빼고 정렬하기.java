import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int[] map = new int[2001]; 
		
		for(int i=0; i<n; i++){
		    int num = Integer.parseInt(st.nextToken());
		    map[num + 1000] = 1; 
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=2000; i++){
		    if(map[i] == 1) {
		        sb.append(i - 1000).append(" ");
		    }
		}
		
		System.out.println(sb);
	}
}