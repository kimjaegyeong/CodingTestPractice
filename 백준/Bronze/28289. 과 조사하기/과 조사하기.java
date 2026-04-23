import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		int a=0;
		int b=0;
		int c=0; 
		int d=0;
		for(int i=0; i<N; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int g= Integer.parseInt(st.nextToken());
		    int gc = Integer.parseInt(st.nextToken());
		    int n = Integer.parseInt(st.nextToken());
		    
		    if(g==1){
		        d++;
		    }else{
		        if(gc==1 || gc==2){
		            a++;
		        }else if(gc==3){
		            b++;
		        }else if(gc==4){
		            c++;
		        }
		    }
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
