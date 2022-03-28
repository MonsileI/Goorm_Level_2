package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_9 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int floor = Integer.parseInt(br.readLine());
		
		int board[][] = new int[floor][];
		int idx = 1;
		for(int i=0;i<board.length;i++) {
			
			board[i] = new int[idx];
			idx = idx*2;
		}
				
		
		int max;
		int min;
		int answerMax = 0;
		int answerMin = 0;
		String s; 
		
		for(int i=0;i<board.length;i++) {
				s="";
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				
			for(int j=0;j<board[i].length;j++) {
				s = br.readLine();
				int a = s.charAt(0)-64;
			
				 min = Math.min(min, a);
				 max = Math.max(max, a);
				
			}
			
			answerMax += max;
			answerMin += min;
			
			
		}
		
		
			
		
			
		System.out.println(answerMax+" , "+answerMin);
			
		
		
	}
}
