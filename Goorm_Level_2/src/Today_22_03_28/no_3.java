package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no_3 {

	public static void main(String[] args) throws Exception {
		
		//완전수(자신을 제외한 약수를 모두 더해서 자기 자신이 나오는 수 구하는 문제)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
	
		
		String[]split = input.split(" ");
		
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int check = 0;
		int soo = 0;
		for(int i=a;i<b;i++) {
			
			check = i;
			soo = 0;
			for(int j=1;j<check;j++) {
				
				if(check%j==0) soo+= j;
				if(soo>check) break;
				
			}
			
			if(soo==check) list.add(check);
			
			
		}
		
		String answer = "";
		
		for(int i : list) answer += i+" ";
		
		System.out.println(answer);
	}
}
