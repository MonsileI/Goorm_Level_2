package Today_22_03_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_17 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int nfac = fact(n);
		
		String check = String.valueOf(nfac);
		
		String yes = answer(check);
		
		
		
		System.out.println(yes);
		
	}
	public static int fact(int n) {
		
		if(n<=1)return n;
		else return fact(n-1) * n;
	

	}
	
	public static String answer(String s) {
		int temp = 0;
		if(s.length()==1) return s;
		else {
			temp = 0;
			for(int i=0;i<s.length();i++) {
				temp += Integer.parseInt(s.charAt(i)+"");
			}
			
			return answer(String.valueOf(temp));
		}
	}
}
