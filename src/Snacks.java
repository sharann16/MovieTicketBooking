import java.util.*;

public class Snacks {
    public   void snack(HashMap ticket, long pno){
        Scanner sc=new Scanner(System.in);
        HashMap<Object,Object> userord=new HashMap<>();
        //using two dimentional array list to stare snack details
        ArrayList<ArrayList<Object>> flist=new ArrayList<>();
        ArrayList<Object> pop=new ArrayList<>();
        pop.add(1);
        pop.add("popcorn");
        pop.add(180);
        ArrayList<Object> puff=new ArrayList<>();
        puff.add(2);
        puff.add("puff");
        puff.add(70);
        flist.add(pop);
        flist.add(puff);
        String opt="";
        int userpreference;
        int qty;
        System.out.println("Available Snacks");
        do{
            System.out.println(pop.get(1)+"    rs"+pop.get(2));
            System.out.println(puff.get(1)+"    rs"+puff.get(2));
            System.out.println("what do you like to order");
            userpreference=sc.nextInt();
            System.out.println("quantity");
            qty=sc.nextInt();
            sc.nextLine();
            userord.put(flist.get(userpreference-1).get(1),(Integer)flist.get(userpreference-1).get(2)*qty);//getting the item name ]and anount and calculate the total amount
            System.out.println("do you like to order any other snack");
            opt=sc.nextLine();
        }while (opt.equals("y"));
        System.out.println("Ticket numbers"+ticket.get(pno));
        Iterator<Map.Entry<Object,Object>> ite=userord.entrySet().iterator();//iterator for user order snacks
        System.out.println("****SNACKS****");
        while (ite.hasNext()){
            Map.Entry<Object,Object> entry=ite.next();
            System.out.println(entry.getKey()+","+"Amt="+entry.getValue());//display the order item to the users
        }
        userord.clear();
    }
}
