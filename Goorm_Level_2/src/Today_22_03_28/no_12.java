package Today_22_03_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class no_12 {

	public static void main(String[] args) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
	int n = Integer.parseInt(br.readLine());
	int temp = n;
	//3 = 2개 필요 
	//11  3개 필요    
	//28 3개 필요   
	//1 2 4 8 16 (얘네들 갯수가 필요한거잖아 그치?)
	int count = 0;
	while(temp>0) {
		if(temp%2==0) temp = temp/2;
		else {
			temp--;
			count++;
			
		}
		
	}
	int [] answer = new int[count];
	int check = 0;
	int Tcount = 0;
	
	for(int i=0;i<count;i++) {
		
		
		check = 1;
		Tcount = 0;
		
		while(check<n && n!=1) {
			
			check *= 2;
			if(n==1) {
				break;
			}
			if(check>n) {
				break;
			}
			
			Tcount++;
		}
		
		n = n - (check/2);
		answer[i] = Tcount;
		
	}
	
	Arrays.sort(answer);
	
	String result = "";
	
	for(int i : answer) result += i+ " "; 
	
	result = result.substring(0,result.length()-1);
	
	System.out.println(answer.length);
	System.out.println(result);
	
	
		
	}
}
