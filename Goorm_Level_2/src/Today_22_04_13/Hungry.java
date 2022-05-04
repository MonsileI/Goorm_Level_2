package Today_22_04_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hungry {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		String num = br.readLine();
		
		String numCheck[] = num.split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();

		for(String s : numCheck) arr.add(Integer.parseInt(s));
			
		int n2 = Integer.parseInt(br.readLine());
		
		String num2 = br.readLine();
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		String numCheck2[] = num2.split(" ");
		
		for(String s : numCheck2) arr2.add(Integer.parseInt(s));
	
		
		int[]answer = new int[n2];
		
	
		for(int i=0;i<arr2.size();i++) {
			
			for(int s : arr) {
				
				if(arr2.get(i)==s) {
					answer[i] = 1;
					break;
				}
				
				
			}
			
		}
		
		for(int i : answer)System.out.println(i);
	}
	
}
