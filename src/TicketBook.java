import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TicketBook {
    public   void ticketBooking(Long pno, List li, HashMap ticket){
        System.out.println(li.toString());
        Snacks snac=new Snacks();
        Scanner sc=new Scanner(System.in);
        long availableSeat = li.stream().filter(seat -> !seat.equals("o")).count(); // Correct filtering
        System.out.println("available seat : "+availableSeat);
        System.out.println("Number of seats");
        int num=0;
        boolean valid=true;
        while (valid){
            try{

                if (sc.hasNextInt()){
                    num=sc.nextInt();
                    valid=false;
                }
                else {
                    System.out.println("enter valid number of seats");
                    sc.next();
                }
            }catch (Exception e){
                System.out.println("enter valid number of seats");
                sc.next();
            }
        }
        sc.nextLine();
        //check if the seats are available
        if(num<=availableSeat){
            String seat="";
            String[] userseat=new String[num];
            System.out.println("enter your seats one by one");
            //getting seat numbers and set the sest as reserves
            for(int i=0;i<num;i++){
                seat= sc.nextLine();
                try {
                    if(!li.contains(seat)){
                        System.out.println("inivalid seat number or the seat is already taken");
                        i--;
                    }
                    else {
                        userseat[i]=seat;
                        li.set(li.indexOf(seat),"o");
                    }
                }catch (Exception e){
                    System.out.println("This seat is already booked");
                    i--;
                }
            }
            ticket.put(pno, Arrays.toString(userseat));//adding the user phone number and seat numbers into map
            System.out.println("do you want snacks y/n");
            String opt=sc.nextLine();
            if(opt.equals("y")){
                snac.snack(ticket,pno);
            }
        }
    }
}
