import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);

            double N = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            double M = Double.parseDouble(st.nextToken());

            int years = 0;
            while (N <= M) {               
                N += N * B / 100.0;        
                years++;
            }
            System.out.println(years);
        }
    }
}
