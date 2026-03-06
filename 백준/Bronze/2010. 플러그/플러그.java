import java.util.*;
import java.io.*;


public class Main
{
	static int N;
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		ans+= Integer.parseInt(br.readLine());
		for(int i=1; i<N; i++) {
			int n = Integer.parseInt(br.readLine());
			ans-=1;
			ans += n;

		}
		
		System.out.println(ans);

	}
}
