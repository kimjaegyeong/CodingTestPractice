import java.util.*;
import java.io.*;

public class Main
{
	static StringBuilder sb =new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int t=0; t<N; t++) {
			String[] input =br.readLine().split(" ");

			for(int i=0; i<input.length; i++) {
				for(int j= input[i].length()-1; j>=0; j--) {
					sb.append(input[i].charAt(j));
				}
				sb.append(" ");
			}

			sb.append("\n");
		}

		System.out.println(sb);

	}
}
