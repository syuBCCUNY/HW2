import java.util.*;

// help from intro to java programming by Daniel Liang, chapter 5, 10th ed.

public class Question3{
	public static void main(String[] args){
		Scanner readin = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String entry = readin.nextLine();

		boolean isequal = true;

		for(int compare = 0; compare < entry.length(); compare++){
			if (entry.charAt(compare) != entry.charAt(entry.length()-1 - compare)){
				isequal = false;
				break;
			}
		}
		
		if (isequal == false){
			System.out.print(entry + " is not a palindrome.");	
		}
		else 
			System.out.print(entry + " is a palindrome.");	
	}
}