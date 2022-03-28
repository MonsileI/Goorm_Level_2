package Today_22_03_28;

import java.util.ArrayList;
import java.util.Arrays;

public class twoPointerList {

	public static void main(String[] args) throws Exception {
		
		int [] a = {1,4,1,4,1,4,7,7,5,2,3};
		int m = 5;
		int n = a.length-1;
		int startIdx = 0;
		int endIdx = n;
		int sum = 0;
		ArrayList<int[]>list = new ArrayList<>();
		
		Arrays.sort(a);
		
		while(startIdx<endIdx) {
			int start = a[startIdx];
			int end = a[endIdx];
			sum = start+end;
			if(sum<=m) startIdx++;
			else endIdx--;
			
			if(sum==m) list.add(new int[] {start,end});
			
			
			
		}
		
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i)[0] +","+list.get(i)[1]);
			
			
		}
		
	}
}
