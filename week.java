
import java.util.Scanner;

public class week {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner myday = new Scanner(System.in)) {
            System.out.println("TODAY is day no.");
            int Dayofweek=myday.nextInt();
            switch(Dayofweek) {
            case 1:
            	System.out.println("Monday");break;
            case 2:
            	System.out.println("Tuesday");break;
            case 3:
            	System.out.println("Wednesday");break;
            case 4:
            	System.out.println("Thursday");break;
            case 5:	
            	System.out.println("Friday");break;
            case 6:
            	System.out.println("Saturday");break;
            case 7:
            	System.out.println("Sunday");break;
            case 8:
		System.out.println("No more options");break;
            }
        }
		
	}



}
