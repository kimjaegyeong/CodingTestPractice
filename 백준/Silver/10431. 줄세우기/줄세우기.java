import java.util.*;
import java.io.*;
public class Main
{
    static int T;
    static int map[];
    static int N;
	public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t=0; t<T;t ++){
		    StringTokenizer st= new StringTokenizer(br.readLine());
		    N =  Integer.parseInt(st.nextToken());
            int ans =0;		    
		    map = new int[20];
		    
		    for(int i=0; i<20; i++){
		        map[i] = Integer.parseInt(st.nextToken());
		    }
		    
		    for(int i=1; i<20; i++){
		        int cnt =0;
		        for(int j=i; j>=1; j--){
		            if(map[j] < map[j-1]){
		                int temp = map[j-1];
		                map[j-1] = map[j];
		                map[j] = temp;
		                cnt++;
		            }else{
		                break;
		            }
		        }
		        
		        ans+=cnt;
		    }
		    
		    sb.append(N).append(" ").append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
}
