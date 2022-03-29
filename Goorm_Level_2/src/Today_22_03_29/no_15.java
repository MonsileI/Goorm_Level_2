package Today_22_03_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_15 {

	public static void main(String[] args) throws Exception {
		
		
		//개미 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String StringAnt = br.readLine();
		String StringArr = br.readLine();
		
		String[]checkAnt = StringAnt.split(" ");
		String[]checkArr = StringArr.split(" ");
		
		int ant = Integer.parseInt(checkAnt[0]);
		int range = Integer.parseInt(checkAnt[1]);
		int [] arr = new int[checkArr.length];
		
		for(int i=0;i<arr.length;i++) arr[i] = Integer.parseInt(checkArr[i]);
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length-1;
		int answer = 0;
		int comp = Integer.MAX_VALUE;
		int startData = 0;
		int endData = 0;
		
		while(comp>range) {
			
			comp = arr[end]-arr[start];
			
			if(comp>range) {
				
				startData = range-arr[start];
				endData = arr[end] - range;
				
				if(start>=endData) start++;
				else end--;
				
				answer++;
			}
			
		}
		
		
		System.out.println(answer);
		
	}
}
