import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());
		
		int male[] = new int[7];
		int female[] = new int[7];
		
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    
		    if(Integer.parseInt(st.nextToken()) == 0) {
		        female[Integer.parseInt(st.nextToken())]++;
		    }else{
		        male[Integer.parseInt(st.nextToken())]++;
		    }
		}
		
		int sum =0;
		for(int i=1; i<7; i++){
		    sum+= Math.ceil((double) female[i] / (double) K);
		    sum+=Math.ceil((double) male[i] / (double) K );
		}
		
		System.out.println(sum);
	}
}
