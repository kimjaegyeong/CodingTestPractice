import java.util.*;

class Solution {

    static int ans;

    public boolean valid(int[] visit, String[] data){

        for(int i=0; i<data.length; i++){

            int a = getCharacterNum(data[i].charAt(0));
            int b = getCharacterNum(data[i].charAt(2));

            int dist = data[i].charAt(4) - '0';

            int gap = Math.abs(visit[a] - visit[b]) - 1;

            char op = data[i].charAt(3);

            if(op == '='){
                if(gap != dist) return false;
            }

            if(op == '<'){
                if(gap >= dist) return false;
            }

            if(op == '>'){
                if(gap <= dist) return false;
            }
        }

        return true;
    }

    public void dfs(int[] visit, boolean[] used, int depth, String[] data){

        if(depth == 8){

            if(valid(visit, data))
                ans++;

            return;
        }

        for(int i=0; i<8; i++){

            if(!used[i]){

                used[i] = true;

                visit[i] = depth;

                dfs(visit, used, depth + 1, data);

                used[i] = false;
                visit[i] = -1;
            }
        }
    }

    public int getCharacterNum(char ch){

        char[] chs = {'A','C','F','J','M','N','R','T'};

        for(int i=0; i<8; i++){
            if(chs[i] == ch)
                return i;
        }

        return -1;
    }

    public int solution(int n, String[] data) {

        ans = 0;

        int[] visit = new int[8];
        Arrays.fill(visit, -1);

        boolean[] used = new boolean[8];

        dfs(visit, used, 0, data);

        return ans;
    }
}