import java.util.* ;
import java.io.*; 

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
    // Optimal Using Math    
        long sn=n*(n+1)/2,s2n=n*(n+1)*(2*n+1)/6;
        long s=0,s2=0;
        for(int i:arr){
            s+=i;s2+=i*i;
        }
        long val1=s-sn;      // X-Y   
        long val2=s2-s2n;      // (X-Y)(X+Y)
        val2=val2/val1;           // (X+Y)
        long x = (val1+val2)/2;  
        long y= x-val1;
        return new int[]{(int)y,(int)x};
    }
}
