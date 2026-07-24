import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        HashSet<Integer> dp[] =new HashSet[9]; 
        
        for(int i=0; i<9; i++){
            dp[i] = new HashSet<Integer>();
        }

        int sum = 0;
        for(int i=1; i<9; i++){
            
            dp[i].add(sum+ (int) (Math.pow(10,i-1)*N));
            sum += Math.pow(10,i-1)*N;
        }
        
       
        
        for(int i=1; i<9; i++){
            for(int j=1; j<i; j++){
                for(int a : dp[j]){
                    for(int b : dp[i-j]){
                        dp[i].add(a * b);
                        dp[i].add(a-b);
                        dp[i].add(a+b);                        
                        if(b == 0 ) continue;
                        dp[i].add(a/b);
                    }
                }
            }
                   
        if(dp[i].contains(number)){
            return i;
        }
        }
 
        
        return -1;
    }
}