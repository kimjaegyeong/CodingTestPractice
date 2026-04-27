import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int map[][] = new int[n+1][m+1];

		int cnt = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				sb.append(cnt);
				if(j != m) sb.append(" ");
				cnt++;
			}
			sb.append("\n");
		}

		System.out.println(sb);


	}
}
