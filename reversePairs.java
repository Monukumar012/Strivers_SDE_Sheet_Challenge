import java.util.* ;
import java.io.*; 

public class Solution 
{
    static int temp[];
    public static int reversePairs(ArrayList<Integer> arr) 
    {

        int[] nums = arr.stream().mapToInt(i->i).toArray();

        int n=nums.length;
        temp=new int[n];
        return mergeSort(nums,0,n-1);
    }

    static int mergeSort(int arr[],int low,int high){
        int cnt=0;
        if(low<high){
            int mid=(low+high)/2;
            cnt+=mergeSort(arr,low,mid);
            cnt+=mergeSort(arr,mid+1,high);
            cnt+=merge(arr,low,mid,high);
        }
        return cnt;
    }

    static int merge(int arr[],int low,int mid,int high){
        int left=low,ryt=mid+1,k=low;

        int cnt=countPair(arr,low,mid,ryt,high);

        while(left<=mid && ryt<=high){
            if(arr[left]>arr[ryt]){
                temp[k++]=arr[ryt++];
            }else{
                temp[k++]=arr[left++];
            }
        }
        while(left<=mid) temp[k++]=arr[left++];
        while(ryt<=high) temp[k++]=arr[ryt++];

        for(int i=low;i<=high;i++){
            arr[i]=temp[i];
        }
        return cnt;
    
    }

    static int countPair(int arr[],int low,int mid,int ryt,int high){
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(ryt<=high && arr[i]>(2*(long)arr[ryt]))ryt++;

            cnt+=(ryt-(mid+1));
        }
        return cnt;
    } 
}
