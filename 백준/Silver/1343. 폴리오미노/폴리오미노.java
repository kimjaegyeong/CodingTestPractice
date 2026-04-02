import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String board = sc.next();
        
        StringBuilder result = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < board.length(); i++) {
            char c = board.charAt(i);
            
            if (c == 'X') {
                count++;
            } else { // '.'
                // X 구간 처리
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                
                while (count >= 4) {
                    result.append("AAAA");
                    count -= 4;
                }
                while (count >= 2) {
                    result.append("BB");
                    count -= 2;
                }
                
                result.append(".");
            }
        }
        
        // 마지막 X 구간 처리
        if (count % 2 != 0) {
            System.out.println(-1);
            return;
        }
        
        while (count >= 4) {
            result.append("AAAA");
            count -= 4;
        }
        while (count >= 2) {
            result.append("BB");
            count -= 2;
        }
        
        System.out.println(result.toString());
    }
}