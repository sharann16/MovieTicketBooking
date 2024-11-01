import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Long,String> ticket=new HashMap<>();//storing individual persions tickets
        Tickets ob=new Tickets();
        LinkedList li=ob.ticket();//It contains the ticket
        UserInput inp= new UserInput();

        while (!li.isEmpty()){
            inp.userinp(li,ticket);
            System.out.println("Your ticket is sucessfully reserved");
            System.out.println("Thank you!");
            System.out.println("*******************************");

        }
        System.out.println(ticket);
    }
}