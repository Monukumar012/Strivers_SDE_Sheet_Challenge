import java.util.* ;
import java.io.*; 
public class Solution {

    public static long getInversions(long arr[], int n) {
        return mergeSort(arr,0,(int)n-1);
    }
  
    static long mergeSort(long arr[], int l, int r){

        long cnt=0;
        if(l<r){
            int mid = (l+r)/2;
            cnt+=mergeSort(arr,l,mid);
            cnt+=mergeSort(arr,mid+1,r);
            cnt+=merge(arr,l,mid,r);
        }
        return cnt;
    }

    static long merge(long arr[],int low,int mid,int high){
        int left=low,ryt=mid+1;

        List<Long> list=new ArrayList<>();
        
        long cnt=0;
        while(left<=mid && ryt<=high){
            if(arr[left]<=arr[ryt]){
                list.add(arr[left++]);
            }
            else{
                
                cnt+=mid-left+1;    // Only this statement add in merge sort
                list.add(arr[ryt++]);
            }
        }
        while(left<=mid) list.add(arr[left++]);
        
        while(ryt<=high) list.add(arr[ryt++]);
        
        
        int i=0;
        for(int j=low;j<=high;j++){
            arr[j]=list.get(i++);
        }
        return cnt;
    }      
}
