/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());

		for(int i=0; i<r; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a_c= Integer.parseInt(st.nextToken());
			
			int aMap[] = new int[5];
			for(int j=0; j<a_c; j++){
			    int v = Integer.parseInt(st.nextToken());
			    
			    aMap[v]++;
			} 
			
			st = new StringTokenizer(br.readLine());
			int b_c = Integer.parseInt(st.nextToken());
			
			int bMap[] = new int[5];
			for(int j=0; j<b_c; j++){
			    int v = Integer.parseInt(st.nextToken());
			    bMap[v]++;
			}
			
			boolean flag = false;
			for(int j=4; j>=1; j--){
			    if(aMap[j] > bMap[j]) {
			        System.out.println("A");
			        
			        flag =true;
			        break;
			    }
			    if(aMap[j] < bMap[j]) {
			        System.out.println("B");
			        flag= true;
			        break;
			    }
			}
			
			if(!flag) {
			    System.out.println("D");
			}
		
			
		}
	}
}
