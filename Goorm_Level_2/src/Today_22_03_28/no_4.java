package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_4 {

	public static void main(String[] args) throws Exception {
		
		//약수의 합을 구하는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		for(int i=1;i<=input;i++) {
			if(input%i==0) answer+=i;
		}
		
		
		System.out.println(answer);
		
	}
}
