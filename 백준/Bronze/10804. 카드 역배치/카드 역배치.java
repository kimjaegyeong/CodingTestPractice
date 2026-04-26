import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int map[] = new int[21];


		for(int i=1; i<21; i++) {
			map[i] =i;
		}
		while(true) {
			String input = br.readLine();
			if(input ==null) {
			    
			    for(int i=1; i<21; i++){
			        System.out.print(map[i]+" ");
			        }
				break;
			}

			StringTokenizer st = new StringTokenizer(input);

			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			while(s<e) {
				int temp = map[e];
				map[e] = map[s];
				map[s] = temp;
				s++;
				e--;

			}
		
		
		}
	}
}
