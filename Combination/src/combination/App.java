package combination;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("!] Input Different Numbers or characters. ");
		String input = scanner.nextLine();
		
		if(checkingString(input)){
		
			System.out.println("!] Input N and R. ex) 5 4 ");
			int n = scanner.nextInt();
			int r = scanner.nextInt();
			scanner.nextLine();
			
			if(checkingInt(input.length(), n, r)){
				
				char[] elements = input.toCharArray();
				
				Combination combination = new Combination(r);
				
				combination.runCombination(elements, n, r, r);
				combination.printCombination();
				
				System.out.println("!] Done.");
			}
			
		}
		
	}

	private static boolean checkingInt(int length, int n, int r) {
		
		if(length >= r && length >= n && n >= r){
			return true;
		}
		
		return false;
	}

	private static boolean checkingString(String input) {
		
		boolean result =  true;
		
		for(int i = 1; i<input.length(); i++){
			char temp = input.charAt(i);
			for(int j=0; j<i; j++){
				if(temp == input.charAt(j)){
					result = false;
					break;
				}
			}
		}
		return result;
	}

}
