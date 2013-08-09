import java.util.Scanner;

public class TicketNumbers {

	public static void main(String[] args) {


	    int ticketNumber,stem,checkDigit;
	    
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter a ticket number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber/10;
		checkDigit= ticketNumber % 10;
		 
		while (checkDigit != stem % 7) {
			System.out.println("Not valid");
			System.out.println("try again");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
		}
					System.out.println("a valid ticket");
	}

}


