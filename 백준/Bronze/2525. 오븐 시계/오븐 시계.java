import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken()); 
        
        int C = Integer.parseInt(br.readLine());
        int total = A * 60 + B;
        
        total += C;
        
        total %= 1440;
        
        int hour = total / 60;
        int minute = total % 60;
        
        System.out.println(hour + " " + minute);
    }
}