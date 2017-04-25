package combination;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("!] Input Different Numbers or characters. ");
		String input = scanner.nextLine();
		
		if(checkingString(input)){
		
			System.out.println("!] Input R. ");
			int r = scanner.nextInt();
			scanner.nextLine();
			
			if(checkingInt(input.length(), r)){
				
				char[] elements = input.toCharArray();
				
				Combination combination = new Combination(r);
				
				combination.runCombination(elements, elements.length, r, r);
				combination.printCombination(elements.length, r);
				
				System.out.println("!] Done.");
			}
			
		}
		
	}

	private static boolean checkingInt(int length, int r) {
		
		if(length >= r){
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
