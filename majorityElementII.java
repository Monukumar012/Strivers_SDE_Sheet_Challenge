import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> a) 
    {
        int n=a.size();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int key:map.keySet()){
            
            if(map.get(key)>n/3)ans.add(key);
        }
        return ans;
    }
}
