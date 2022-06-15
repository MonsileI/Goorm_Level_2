package Today_22_06_15;

import java.util.Scanner;

public class temaPark {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		
		s = s.replaceAll("\\s+", " ");
		
		String[]temp = s.split(" ");
		
		
		System.out.println(s);
		
		int answer = temp.length;
		
		if(temp[0].isEmpty()) answer--;
		if(temp[temp.length-1].isEmpty()) answer--;

		System.out.println(answer);
	
		
	}
	
}
