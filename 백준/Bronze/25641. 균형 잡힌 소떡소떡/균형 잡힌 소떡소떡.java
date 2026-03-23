import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int s = 0;
		int t =0;
		for(int i=0; i<input.length(); i++){
		    if(input.charAt(i) == 's') {
		        s++;
		    }else{
		        t++;
		    }
		}
		
		int idx = 0;
// 		System.out.println(s + " " + t);
		for(int i=0; i<input.length(); i++){
		    if(s==t) {
		        idx = i;
		        break;}
		    
		    if(input.charAt(i) == 's') s--;
		    else t--;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=idx; i<input.length(); i++){
		    sb.append(input.charAt(i));
		}
		
		System.out.println(sb);
	}
}
