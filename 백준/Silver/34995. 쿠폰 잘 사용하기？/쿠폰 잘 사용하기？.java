import java.util.*;
import java.io.*;
public class Main
{
    static StringBuilder sb=  new StringBuilder();
	public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] input = br.readLine().split(" ");
	    int N = Integer.parseInt(input[0]);
	    
	    String value = br.readLine(); // A
	    String coupon = input[1];

        // ? -> 9 치환
	    for(int i=0; i<coupon.length(); i++){
	        if(coupon.charAt(i) == '?'){
	            sb.append('9');
	        }else{
	            sb.append(coupon.charAt(i));
	        }
	    }

	    String maxCoupon = sb.toString();

        // 길이 비교
	    if(maxCoupon.length() > value.length()){
	        System.out.println(maxCoupon);
	    }else if(maxCoupon.length() < value.length()){
	        System.out.println(-1);
	    }else{
	        if(maxCoupon.compareTo(value) >= 0){
	            System.out.println(maxCoupon);
	        }else{
	            System.out.println(-1);
	        }
	    }
	}
}