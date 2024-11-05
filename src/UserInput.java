import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class UserInput {
    public void userinp( HashMap ticket,List ama,List bro){
        Scanner sc=new Scanner(System.in);
        TicketBook s2=new TicketBook();
        System.out.println("enter your phone no");
        long pno=sc.nextLong();
        System.out.println("1)amaran\n 2)Brother");
        int movie=sc.nextInt();

        switch (movie){
            case 1:
                s2.ticketBooking(pno,ama,ticket,movie);
                break;
            case 2:

                s2.ticketBooking(pno,bro,ticket,movie);
                break;
        }


    }
}
