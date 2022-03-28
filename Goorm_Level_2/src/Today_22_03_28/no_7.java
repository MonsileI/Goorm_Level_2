package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_7 {

	public static void main(String[] args) throws Exception {
		
		//두부 자르기 문제
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//7
		//1,1,1,2,2 ||3
		//1,1,2,3 ||2
		//6,1 ||1
		//4,3 ||1
		//5,1,1 ||1
		//1,1,1,1,3 || 4
		
		//1+2+3+4
		
		
		//10
		
		
		int cnt = 0;
		
		for(int i=n-2;i>1;i--) {
			cnt++;
			
		}
		
		
		
		System.out.println(cnt);
		
		
		
		
		
		
		
		
	}
}
