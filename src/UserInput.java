import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public void userinp(List li, HashMap ticket){
        System.out.println("Welcome");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your phone no");
        long pno=sc.nextLong();
        TicketBook tic=new TicketBook();
        tic.ticketBooking(pno,li,ticket);

    }
}
