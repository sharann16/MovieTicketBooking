import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Long,String> ticket=new HashMap<>();//storing individual persons tickets
        Scanner sc=new Scanner(System.in);

        Tickets tic=new Tickets();
        List amar=tic.Amaran();
        List bro=tic.Begger();
//        Tickets ob=new Tickets();
//        LinkedList li=ob.ticket();//It contains the ticket
        UserInput inp= new UserInput();
        int opt=0;
        boolean run=true;
        while (run){
            System.out.println("1) Ticket Booking\n2)seat booked");
            int opy=sc.nextInt();
            switch (opy){
                case 1:
                    inp.userinp(ticket,amar,bro);
                    System.out.println("Your ticket is sucessfully reserved");
                    System.out.println("Thank you!");
                    System.out.println("*******************************");
                    break;
                case 2:
                    System.out.println(ticket);
                    break;
            }
        }
    }
}