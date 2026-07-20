
import java.util.*;


class Node implements Comparable<Node>{
    int jobT;
    int reqT;
    int num;
    
    public Node(int jobT, int reqT, int num){
        this.jobT = jobT;
        this.reqT = reqT;
        this.num = num;
    }
    
    public int compareTo(Node n){
        return this.jobT - n.jobT ==0? this.reqT - n.reqT ==0? this.num - n.num : this.reqT - n.reqT : this.jobT - n.jobT; 
    }
    
    
}
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        PriorityQueue<Node> pq = new PriorityQueue<>();

        int now = 0;
        int ans = 0;
        int index = 0;
        int count = 0;

        while (count < jobs.length) {

            while (index < jobs.length && jobs[index][0] <= now) {
                pq.offer(new Node(jobs[index][1], jobs[index][0], index));
                index++;
            }

            if (pq.isEmpty()) {
                now = jobs[index][0];
                continue;
            }

            Node n = pq.poll();

            now += n.jobT;
            ans += now - n.reqT;
            count++;
        }

        return ans / jobs.length;
    }
}