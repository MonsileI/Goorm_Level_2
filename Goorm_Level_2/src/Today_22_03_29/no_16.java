package Today_22_03_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_16 {

	public static void main(String[] args) throws Exception {
		//A4 용지를 만들자!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[]check = s.split(" ");
		
		int n = Integer.parseInt(check[0]);
		int m = Integer.parseInt(check[1]);
		
		//20 //40
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		int answer = 0;
		
		if(min<20) answer=0;
		else {
			
			while(max>=20) {
			
				max -= 20;
				if(max<20) break;
				answer++;
				
			}
			int temp = answer;
			
			while(min>=40) {
				
				min -= 40;
				if(min<40) break;
				answer += temp;
				
				
			}
			
			
		}
		
		
		System.out.println(answer);
		
		
	}
}
