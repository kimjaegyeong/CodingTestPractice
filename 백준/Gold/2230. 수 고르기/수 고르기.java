import java.util.*;
import java.io.*;
public class Main
{
	static long[] map;
	static long M;
	static int N;

	static long max = Long.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M= Long.parseLong(st.nextToken());

		map= new long[N];

		for(int i=0; i<N; i++) {
			map[i] = Long.parseLong(br.readLine());

		}

		Arrays.sort(map);

		int s =0;
		int e= 0;

		if(N == 1) {
			System.out.println(map[0]);
			return;
		}

		while(s < N && e< N) {
			if(map[e] - map[s] >= M ) {

				max = Math.min(max, map[e] - map[s]);
				s++;
			} else if(map[e] - map[s]< M ) {
				e++;

			}
		}

		System.out.println(max);



	}
}
