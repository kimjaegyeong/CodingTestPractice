import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int low = 0;
		int high = 11;
		
		while(true){
		    int n = Integer.parseInt(br.readLine());
		    
		    if(n == 0 ) break;
		    
		    String input = br.readLine();
		    
		    if(input.equals("too high")){
		        
		        high = Math.min(n, high);
		    }else if(input.equals("too low")){
		        low = Math.max(n, low);
		    }else{
		        if(n > low && n < high){
		            sb.append("Stan may be honest");
		        }else{
		            sb.append("Stan is dishonest");
		        }
		        sb.append("\n");
		        
		        low = 0;
		        high= 11;
		    }
		}
		System.out.println(sb);
	}
}
