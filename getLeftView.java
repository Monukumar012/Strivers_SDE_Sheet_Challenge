import java.util.*;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
 
        dfs(root,0,ans);
        return ans;
    }

    static void dfs(TreeNode<Integer> root,int lev,ArrayList<Integer> ans){
        if(root==null)return;
        if(lev==ans.size()) ans.add(root.data);
        dfs(root.left,lev+1,ans);
        dfs(root.right,lev+1,ans);
    }
}
