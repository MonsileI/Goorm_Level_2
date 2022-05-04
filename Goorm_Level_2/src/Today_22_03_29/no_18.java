package Today_22_03_29;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class no_18 {

	public static void main(String[] args) throws Exception {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//236
		
		//3 + 3*3 + 3*3*3
		
		long answer = 0;
		long three = 3;
		for(int i=0; i<n;i++) {
			
			answer += three;
			three *= 3;
			
		}
		
		System.out.println(answer);
		
	}
	
}
