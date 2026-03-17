import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int sum = 0;
		
		char dir = input.charAt(0);
		sum += 10;
		for(int i=1; i<input.length(); i++){
		    if(dir != input.charAt(i)) {
		        sum+=10;
		    }else{
		        sum+=5;
		    }
		    dir = input.charAt(i);
		}
		
		System.out.println(sum);
	}
}
