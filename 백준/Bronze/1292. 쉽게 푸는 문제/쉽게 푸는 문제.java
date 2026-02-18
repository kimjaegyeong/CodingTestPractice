import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		int v[] = new int[1001];
		
		int i=0;
		int cnt = 1;
		while(true){
		    for(int j=0; j<cnt; j++){
		        if(i >= 1001) break;
		        v[i] = cnt;
		        i++;
		    }
		    cnt++;
		    
		    if(i >= 1001) break;
		}
		
// 		System.out.println(Arrays.toString(v));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		int sum =0;
	    for(int j=(a-1); j<b; j++){
	        sum+=v[j];
	    }
	    
	    System.out.println(sum);
	}
}
