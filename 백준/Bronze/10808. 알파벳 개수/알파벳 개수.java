import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] b= new int[26];
		
		String input = br.readLine();
		
// 		System.out.println('a'-0);

        for(int i=0; i<input.length(); i++){
            b[input.charAt(i) - 97]++;
        }
        
        for(int i=0; i<26;i++){
            System.out.print(b[i] + " ");
        }
	}
}
