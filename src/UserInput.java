import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public void userinp( HashMap ticket){
        Tickets Amaran=new Tickets();
        Tickets Beg=new Tickets();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your phone no");
        long pno=sc.nextLong();
        System.out.println("1)amaran\n 2)begger");
        int movie=sc.nextInt();

        switch (movie){
            case 1:
                TicketBook s1=new TicketBook();
                s1.ticketBooking(pno,Amaran.Amaran(),ticket,movie);
                break;
            case 2:
                TicketBook s2=new TicketBook();
                s2.ticketBooking(pno,Beg.Begger(),ticket,movie);
        }


    }
}
