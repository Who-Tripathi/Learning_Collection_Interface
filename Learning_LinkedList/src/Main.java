import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.StreamHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        1. Browser History Simulation
//
//        Use a LinkedList<String> to simulate browsing history.
//
//        LinkedList<String> browserHistory = new LinkedList<>();
//
//        System.out.printf("Welcome to the browser history manager.\n 1. Type : 'Search' to add history to the browser.\n 2. Type : 'History' to check your browsing history.\n 3. Type : 'Delete' to clear your browsing history.\n 4. Type : 'Back' to go back to the last visited page\n 5. Type : 'Last' to get the last visited page of the browser.\n 6. Type : 'End' to end the Browser.\n");
//
//
//        Scanner sc = new Scanner(System.in);
//        Scanner history=new Scanner(System.in);
//
//
//        String selected;
//        do {
//            selected = sc.next();
//            switch (selected) {
//                case "Search": {
//                    System.out.print("Enter your search Topic : ");
//                    browserHistory.addLast(history.nextLine());
//                }break;
//                case "History": {
//                    System.out.println(browserHistory);
//                }break;
//                case "Delete": {
//                    browserHistory.clear();
//                    System.out.println("Browsing History is cleared...!");
//                }break;
//                case "Back": {
//                    System.out.println("Your previous browsing history is : "+browserHistory.pollLast());
//                }break;
//                case "Last": {
//                    System.out.println("Your previous browsing history is : "+browserHistory.getLast());
//                }break;
//                default: {
//                    System.out.println("Invalid Selection, please select right choice");
//                }
//            }
//        } while (!(selected.equalsIgnoreCase("end")));

//        2. Bank Queue Simulation
//
//        Use a LinkedList<String> as a queue of customers.

//        LinkedList<String> customers=new LinkedList<>();
//        System.out.print("Add the customers in the Queue : " );
//        Scanner scanner=new Scanner(System.in);
//        int i=0;
//        while(i<5){
//            customers.offer(scanner.nextLine());
//            i++;
//        }
//
//        System.out.print("5 Customers are added in the the queue Type Y/N to proceed checkout: ");
//        String s=scanner.nextLine();
//        if(s.equalsIgnoreCase("Y")){
//            String customer;
//            while ((customer=customers.pollFirst())!=null){
//                System.out.println("Bank is serving : "+customer);
//                try{Thread.sleep(3000);}catch (InterruptedException e){};
//            }
//        }else{
//            System.out.println("Bank System is closed...Thanks for using the App...!");
//        }
//        System.out.println("Thanks for using the App...!");


        System.out.println("Welcome to to the application checking if the String is palindrome...!");
        System.out.print("Type your string : ");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        LinkedList<Character> charList=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            charList.offer(s.charAt(i));
        }

        boolean result=true;
        do{
            if(charList.peekLast()==charList.peekFirst()){
                charList.pollFirst();
                charList.pollLast();
            }else{
                result =false;
                break;
            }

        }while (charList.peekLast()!=charList.peekFirst());

        if(result==true){
            System.out.println("String is palindrome ...!");
        }else{
            System.out.println("String is not palindrome...!");
        }


    }
}