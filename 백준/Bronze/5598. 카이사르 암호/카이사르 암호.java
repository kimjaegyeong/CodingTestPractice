import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringBuilder sb =new StringBuilder();
		
        
		for(int i=0; i<input.length(); i++){
		   sb.append((char) ((input.charAt(i) - 'A' - 3 + 26) % 26 + 'A'));
		}
		
		System.out.println(sb);
	}
}
