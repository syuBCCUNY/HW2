import java.util.*;

// cited: http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/

public class Question1{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How tall would you like your pyramid to be?: ");
		
		int pyramidsize = input.nextInt();
		int CurrentRow = 1;
		System.out.println();
	
	
		while(CurrentRow <= pyramidsize) {
				for (int space = pyramidsize-CurrentRow; space >= 0; space--){
					System.out.print(" " + " ");//single whitespace did not work
				}
				
				for (int inc = 1; inc <=CurrentRow; inc++){
					System.out.print(inc+" ");
				}
			
				for (int dec = CurrentRow-1; dec >=1; dec--){
					System.out.print(dec+" ");
				}	
			
			System.out.println();
			CurrentRow++;
		}
	}
}

