import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<works.length; i++){
            pq.offer(works[i]);
        }
        
        for(int i=0; i<n; i++){
            if(pq.isEmpty()) break;
            int workTime = pq.poll();
            workTime-=1;
            
            if(workTime ==0) continue;
            pq.offer(workTime);
        }
        
        while(!pq.isEmpty()){
            int time = pq.poll();
            
            answer+= time*time;
        }
        
        return answer;
    }
}