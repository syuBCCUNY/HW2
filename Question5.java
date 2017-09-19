import java.util.*;

public class Question5{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter(",");
		System.out.println("Enter something seperated by a comma");
		
		while(input.hasNextLine()){
			String entry  = input.next();
			System.out.println(entry);	
		}
	}
}