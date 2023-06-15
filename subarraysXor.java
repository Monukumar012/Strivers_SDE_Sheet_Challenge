import java.io.*;
import java.util.* ;

public class Solution {

	public static int subarraysXor(ArrayList<Integer> a, int k) {

		int n = a.size(), xr = 0, cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(xr, 1);

        for (int i :a) {
            xr = xr^i;
            if (map.containsKey(xr ^ k)) {
                cnt += map.get(xr ^ k);
            }
            if (map.containsKey(xr))
                map.put(xr, map.get(xr) + 1);
			      else
                map.put(xr, 1);
        }
        return cnt;
	}
}
