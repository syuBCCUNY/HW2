import java.util.*;

public class Question2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What year?: ");
		int year = input.nextInt();
		
		System.out.println("What day of week did the first day of the new year fall on?(0 = sunday, 6 = saturday)");
		int firstday = input.nextInt();
		
		for (int month = 1; month <= 12; month++){
			int daysInMonth = 0;
			String nameOfMonth = " ";
			
			switch(month){
				case 1: 
					daysInMonth = 31;
					nameOfMonth = "January";
					break;
				case 2: 
					if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 !=0))){
						daysInMonth = 29;
					}
					else {
						daysInMonth = 28;
					}
					nameOfMonth = "February";
					break;
				case 3:
					daysInMonth = 31;
					nameOfMonth = "March";
					break;
				case 4: 
					daysInMonth = 30;
					nameOfMonth = "April";
					break;
				case 5:
					daysInMonth = 31;
					nameOfMonth = "May";
					break;
				case 6: 
					daysInMonth = 30;
					nameOfMonth = "June";
					break;
				case 7:
					daysInMonth = 31;
					nameOfMonth = "July";				
					break;
				case 8:
					daysInMonth = 31;
					nameOfMonth = "August";				
					break;
				case 9: 
					daysInMonth = 30;
					nameOfMonth = "September";
					break;
				case 10:
					daysInMonth = 31;
					nameOfMonth = "October";				
					break;
				case 11: 
					daysInMonth = 30;
					nameOfMonth = "November";
					break;
				case 12:
					daysInMonth = 31;
					nameOfMonth = "December";
					break;
			}
		
		System.out.printf("%12s %d\n",nameOfMonth,year);
		System.out.printf("Su Mo Tu We Th Fr Sa\n");

		for (int blanks = 1; blanks <= firstday; blanks++){
			System.out.printf("   ");
			}
		
		for (int days = 1; days<=daysInMonth; days ++){
			System.out.printf("%-3d",days);
			if((days + firstday) % 7 ==0)
				System.out.println();
			}
		firstday = (firstday + daysInMonth) % 7; //solving the first day of every month source: https://stackoverflow.com/questions/35679827/how-to-display-calendar-in-java 
		System.out.println();
		}
		
	}
}
