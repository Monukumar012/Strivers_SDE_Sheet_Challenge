import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] a)
    {
        int n=a.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            
            if(a[mid]==0){
                swap(a,mid,low);
                low++;mid++;
            }
            
            else if(a[mid]==2){
                swap(a,mid,high);
                high--;
                
            }
            
            else{
                mid++;
            }
        }
    }

    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
