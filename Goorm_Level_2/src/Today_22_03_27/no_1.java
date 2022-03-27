package Today_22_03_27;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m  = Integer.parseInt(br.readLine());
		
		String answer = "False";
		
		if(m==2) answer= "True";
		else {
			
			int count = 0;
			for(int i=1;i<=Math.sqrt(m);i++) if(m%i==0) count++;
			
			if(count==1) answer = "True";
		}
			
		System.out.println(answer);
		br.close();
	}
}