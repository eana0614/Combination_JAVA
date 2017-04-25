package combination;

import java.util.ArrayList;

public class Combination {
	
	ArrayList<String> combinationElement;
	char[] temp;
	
	public Combination(int length){
		combinationElement = new ArrayList<>();
		temp = new char[length];
	}

	public void runCombination(char[] elements, int n, int r, int length) {
		
		if(r == 0){
			addCombinationElement(length);
		}else if(n>=r){
			
			temp[r-1] = elements[n-1];
			runCombination(elements, n-1, r-1, length);
			runCombination(elements, n-1, r, length);
			
		}else{
			
		}
		
	}
	
	private void addCombinationElement(int length) {
		
		String t = "";
		for(int i=length-1; i>= 0; i--){
			t = t + temp[i];
		}
		
		combinationElement.add(t);
	}

	public void printCombination(int n, int r){
		
		System.out.println("===== Result "+n+"C"+r+" =====");
		for(int i=0; i<combinationElement.size(); i++){
			System.out.println((i+1)+"th Combination Element = "+combinationElement.get(i));
		}
		
		System.out.println();
	}

}
