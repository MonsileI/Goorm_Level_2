package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_5 {

	public static void main(String[] args) throws Exception {
		
		//계산기 만드는 문제(나누기이면 수소점 두번째까지 출력(round함수 썼음!))
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[]check = input.split(" ");
		
		int a = Integer.parseInt(check[0]);
		int b = Integer.parseInt(check[2]);
		double aa = 0;
		double bb = 0;
		double answer2 = 0;
		String idx = check[1];
		int answer = 0;
		switch (idx) {
		case "*": answer = a*b;
			
			break;
		case "+": answer = a+b;
			
			break;
		case "-": answer = a-b;
			
			break;
		case "/":  aa = a;
				   bb = b;
				   answer2 = aa/bb;
				   answer2 = Math.round(answer2 * 100) / 100.0;

			break;
		}
		
		if(idx.equals("/")) System.out.println(answer2);
		else System.out.println(answer);
		
		
	}
}
