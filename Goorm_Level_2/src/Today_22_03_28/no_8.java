package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_8 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//갯수
		//숫자배열
		//횟수
		//확인
		//아니 근데 왜 자꾸 스트링값으로 받아야 되는건데
		
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		String s = br.readLine();
		String []checkS = s.split(" ");
		
		for(int i=0;i<checkS.length;i++) arr[i] = Integer.parseInt(checkS[i]);
		
		int m = Integer.parseInt(br.readLine());
		
		String d = br.readLine();
		String[]checkD = d.split(" ");
		
		int check = 0;
		int[]answer = new int[checkD.length];
		
		for(int i=0;i<checkD.length;i++) {
			
			check = 0;
			
			int thisOne = Integer.parseInt(checkD[i]);
			
			for(int j=0;j<arr.length;j++) {
				
				if(thisOne==arr[j]) {
					
					check++;
					break;
				}
			}
			if(check==1) answer[i] = 1;
			else answer[i] = 0;
		}
		
		
		for(int i : answer)System.out.println(i);
		
		
	}
}
