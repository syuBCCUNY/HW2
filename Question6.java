import java.util.*;

public class Question6{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter("");
		System.out.println("Enter something");
		
		while(input.hasNext()){
			String entry  = input.next();
			System.out.println(entry);	
		}
	}
}