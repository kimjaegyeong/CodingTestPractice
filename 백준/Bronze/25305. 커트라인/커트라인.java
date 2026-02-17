import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n =Integer.parseInt(input[0]);
		int r = Integer.parseInt(input[1]);
		
		int map[]= new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
		    map[i]= Integer.parseInt(st.nextToken());
		    
		}
		
		Arrays.sort(map);
		
		System.out.println(map[ n - r]);
	}
}
