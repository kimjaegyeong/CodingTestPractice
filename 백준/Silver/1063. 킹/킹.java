import java.util.*;
import java.io.*;
public class Main
{
	static int N = 8;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String kPos = st.nextToken();
		String sPos = st.nextToken();

		int n = Integer.parseInt(st.nextToken());


		int kx = kPos.charAt(0) - 64;
		int ky = kPos.charAt(1) - 48;


		int sx = sPos.charAt(0) - 64;
		int sy = sPos.charAt(1) - 48;

		for(int i=0; i<n; i++) {
			String mp = br.readLine();
			int[] np = movePos(mp);
			int ny = np[0] + ky;
			int nx = np[1] + kx;

			if(!check(ny,nx)) continue;

			if(ny == sy && nx == sx) {
				int nsy = np[0] + sy;
				int nsx= np[1] + sx;

				if(!check(nsy,nsx)) continue;
				ky = np[0] + ky;
				kx = np[1] + kx;

				sy= np[0] + sy;
				sx = np[1] + sx;

			}else{
			    
			    ky = np[0] + ky;
			    kx = np[1] + kx;
			}


		}

		System.out.println((char)(kx+64) + ""+ ky);
		System.out.println((char)(sx+64) + "" + sy);


	}


	public static boolean check(int y, int x) {
		return y >= 1 && x>=1 && y<=N && x<=N;
	}

	public static int[] movePos(String m ) {
		if(m.equals("R")) {
			return new int[] {0,1};
		} else if(m.equals("L")) {
			return new int[] {0,-1};
		} else if(m.equals("B")) {
			return new int[] {-1,0};
		} else if(m.equals("T")) {
			return new int[] {1,0};
		} else if(m.equals("RT")) {
			return new int[] {1,1};
		} else if(m.equals("LT")) {
			return new int[] {1,-1};
		} else if(m.equals("RB")) {
			return new int[] {-1,1};
		} else if(m.equals("LB")) {
			return new int[] {-1,-1};
		}

		return new int[] {0,0};
	}
}
