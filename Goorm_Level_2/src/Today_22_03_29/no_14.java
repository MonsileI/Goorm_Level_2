package Today_22_03_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_14 {
	
	public static void main(String[] args) throws Exception {
		//출석부 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String name = br.readLine();
		
		//앞글자랑 바로 뒷글자랑 비교 ->
		
		char check = name.charAt(0);
		StringBuilder MyString = new StringBuilder(name);
		boolean flag = true;
		
		for(int i=0;i<name.length()-1;i++) {
			
			if(name.charAt(i)>name.charAt(i+1)) {
				MyString.deleteCharAt(i);
				flag = false;
				break;
			}
			
			
			
			
		}
		
		name = MyString.toString();
		
		if(flag) name = name.substring(0,name.length()-1);
		
		System.out.println(name);
		
		
		
	}

}
