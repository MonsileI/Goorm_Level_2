package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_2 {

	public static void main(String[] args) throws Exception {
		
		//문자열 뒤집는 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String answer = "";
		
		for(int i=input.length()-1;i>=0;i--) answer += input.charAt(i)+"";
		
		
		System.out.println(answer);
		br.close();
	}
}
