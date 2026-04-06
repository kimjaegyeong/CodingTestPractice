import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
            
        int n;
        int m;
        
        int nHas = 0;
        int mHas= 0;
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        HashSet<Integer> nSet = new HashSet<Integer>();
        
        HashSet<Integer> mSet = new HashSet<Integer>();
        
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nSet.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            mSet.add(Integer.parseInt(st.nextToken()));
            
        }
        
        Iterator iter = mSet.iterator();
        
        while(iter.hasNext()){
            if(nSet.contains(iter.next())){
                nHas++;
            }
        }
        
         iter = nSet.iterator();
        
        while(iter.hasNext()){
            if(mSet.contains(iter.next())){
                mHas++;
            }
        }
        
        System.out.println((n - nHas) + (m - mHas)); 
	}
}
