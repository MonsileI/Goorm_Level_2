package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class no_13 {

	public static void main(String[] args) throws Exception {
		
		//동전줍기 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		String[]check = s.split(" ");
		int []arr = new int[n];
		
		for(int i=0;i<arr.length;i++)arr[i] = Integer.parseInt(check[i]);
		
		
		Integer [] answer = new Integer[n];
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			temp += arr[i];
			answer[i] = temp;			
		}
		
		
		Arrays.sort(answer,Collections.reverseOrder());
		
		System.out.println(answer[0]);
	}
}
