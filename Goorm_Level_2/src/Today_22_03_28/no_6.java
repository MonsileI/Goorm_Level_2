package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_6 {

	public static void main(String[] args) throws Exception {
		
		//외계인과 용돈기입장 문제.. 쉽지만 그냥 귀찮은 문제..
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String [] check = input.split(" ");
		int age = Integer.parseInt(check[0]);
		int count = Integer.parseInt(check[1]);
		String money = br.readLine();
		String[]answer = new String[count];
		
		String[]checkMoney = money.split(" ");
		
		String[]checkInput = new String[count];
		
		for(int i=0;i<checkInput.length;i++) checkInput[i] = br.readLine();
		
		for(int i=0;i<checkInput.length;i++) {
			
			String []checkNum = checkInput[i].split(" ");
			String start = checkNum[0];
			String end = checkNum[1];
			
			int startNum = Integer.parseInt(start);
			int endNum = Integer.parseInt(end);
			int thisOne = 0;
			
			for(int j=startNum-1;j<=endNum-1;j++) {
				
				thisOne += Integer.parseInt(checkMoney[j]);
				
				
				
			}
			
			if(thisOne>0) answer[i] = "+"+String.valueOf(thisOne);
			else answer[i] = String.valueOf(thisOne);
			
			
		}
		
		
			
		for(String s : answer)System.out.println(s);
			
		
		
		
	}
}
