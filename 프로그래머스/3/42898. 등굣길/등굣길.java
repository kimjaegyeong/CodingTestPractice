import java.util.*;

class Solution {
    
    static int[][] map;
    static int[][] dp;
    public int solution(int n, int m, int[][] puddles) {
        int answer = 0;
        
        dp= new int[m][n];
        
        map = new int[m][n];
        
        for(int i=0; i<puddles.length; i++){
            map[puddles[i][1]-1][puddles[i][0]-1] = 1;
        }
        
        simul(m-1,n-1);
        
        // for(int i=0; i<m; i++){
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        
        
        return dp[m-1][n-1];
    }
    
    public int simul(int y, int x){
        if(y<0 || x<0) return 0;
        if(y==0 && x==0) return 1;
        
        if(map[y][x] == 1) return 0;
        if(dp[y][x] > 0) return dp[y][x];
        
        return dp[y][x] = (simul(y-1,x) + simul(y,x-1))%1000000007;
    }
}