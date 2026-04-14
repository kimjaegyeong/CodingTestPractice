import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double a= Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		if(a > b) {
		    double temp = b;
		    b = a;
		    a= temp;
		}
		
		int cnt= 1;
		while(true){
		    
		    if(a %2 == 1 && b % 2== 0){
		        
		        if(a+1 == b){
		            System.out.println(cnt);
		            return;
		        }
		        
		    }
		    
		    a = Math.ceil(a/2);
		    b = Math.ceil(b/2);
		    cnt++;
		}
		
	}
}
