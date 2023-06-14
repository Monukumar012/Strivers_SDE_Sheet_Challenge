import java.util.* ;
import java.io.*; 


public class Solution 
{

	static void swap(ArrayList<Integer> arr,int i,int j){
        int t=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,t);
    }

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		ArrayList<Integer> ans=new ArrayList<>();
        
        int brk=-1,N=arr.size();
        for(int i=N-2;i>=0;i--){
            if(arr.get(i)<arr.get(i+1)){
                brk=i;
                break;
            }
        }
        if(brk==-1){
            for(int i=N-1;i>=0;i--){
                ans.add(arr.get(i));
            }
        }
        else{
            for(int i=N-1;i>brk;i--){
                if(arr.get(i)>arr.get(brk)){
                    swap(arr,i,brk);
                    break;
                }
            }
            for(int i=0;i<=brk;i++){
                ans.add(arr.get(i));
            }
            for(int i=N-1;i>brk;i--){
                ans.add(arr.get(i));
            }
        }
        
        return ans;
	}
}
