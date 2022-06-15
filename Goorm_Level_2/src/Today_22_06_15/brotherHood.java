package Today_22_06_15;

import java.util.Scanner;

public class brotherHood {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		String []temp = str.split(" ");
		
		int day = scan.nextInt();
		
		int j = Integer.parseInt(temp[0]);
		int s = Integer.parseInt(temp[1]);
		
		for(int i=0;i<day;i++) {
			
			if(i%2==0) {
				
					if(j%2!=0) {
						s += j;
						j=0;
						
					}else {
						int a = j/2;
						j -= a;
						s += a;
					}
					
					
					
			
			}else {
				
				
					if(s%2!=0) {
						j += s;
						s =0;
						
					}else {
						int a = s/2;
						j += a;
						s -= a;
						
					}
				
					
				
			}
			
			
			
			
		}
		
		System.out.println(j + " " + s);
	}
	
}
