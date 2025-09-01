import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //        --------------Finding the average max, min and average of the elements-------------


        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.addAll(Arrays.asList(22,46,32,19,11,21,16,43,31));

        Integer largestElement = list.stream().reduce(Integer.MIN_VALUE, (i1, i2) -> i1 > i2 ? i1 : i2);
        System.out.println("Largest element is :"+largestElement);

        Integer smallestElement=list.stream().reduce(Integer.MAX_VALUE,(i1,i2)->i1<i2?i1:i2);

        System.out.println("Smallest element is : "+smallestElement);

        Integer average=list.stream().reduce(0,(i1,i2)->i1+i2)/list.size();
        System.out.println("Average of the elements are :"+average);


//        Given an ArrayList<String> of names (with duplicates)

        ArrayList<String> names=new ArrayList<>();
        names.add("Tripathi");
        names.add("Shyam");
        names.add("Ram");
        names.add("Tripathi");
        names.add("Ram");
        ArrayList<String> updated=new ArrayList<>();
        List<String> collect = names.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);



//        Write a method that takes an ArrayList<Integer> and returns it reversed without using


        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(5,23,2,6,82,2,76,4,232,8,3,22));
        List<Integer> collect1 = IntStream.range(0, list1.size()).mapToObj(i -> list1.get(list1.size() - 1 - i)).collect(Collectors.toList());
        System.out.println(collect1);



//        Create a shopping cart using ArrayList<String>.

        ArrayList<String> cartList=new ArrayList<>();
        String addCartItem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Add the items to the cart (Type end if you want to stop adding items) : ");
        do {
            addCartItem=sc.nextLine();
            cartList.add(addCartItem);
            System.out.println("Items are : "+cartList.stream().collect(Collectors.toList()));
        }while(!("end".equalsIgnoreCase(addCartItem)));

        System.out.println("Remove the item from the cart (Type end if you want to stop removing items) : ");

        String removeCartItem;
        do {
            removeCartItem=sc.nextLine();
            boolean remove = cartList.remove(removeCartItem);
            if(remove){
                System.out.print("Item '"+removeCartItem+"' removed from the list successfully...!");
                System.out.println("Remaining items are : "+cartList.stream().collect(Collectors.toList()));
            }else{
                System.out.print("Item '"+removeCartItem+"' not found in the list...:(");
            }
        }while(!("end".equalsIgnoreCase(removeCartItem)));


//        Even & Odd Splitter

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(11,23,5,3,2,5,7,78,8,2,5,8,9,3345,00,8,6,5,4,2));

        ArrayList<Integer> oddList=new ArrayList<>();
        ArrayList<Integer> evenList=new ArrayList<>();

        for(int i=0;i<list2.size();i++){
            if(list2.get(i)%2==0){
                evenList.add(list2.get(i));
            }else{
                oddList.add(list2.get(i));
            }
        }


        System.out.println("Even List is : "+evenList);
        System.out.println("Odd list id : "+oddList);
    }
}