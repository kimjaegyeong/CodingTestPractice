import java.util.*;
import java.io.*;


public class Main
{
    static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());
	    
	    for(int i=0; i<N; i++){
	        String[] input = br.readLine().split(" ");
	        
	        if(input[1].equals("2026")){
	            System.out.println(input[0]);
	            return;
	        }
	    }
	    
	}
}
