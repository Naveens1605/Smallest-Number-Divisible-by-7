package smallestnumber;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        int count=0;
        int position = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter Size of Array :");
        int a = sc.nextInt();
        for(i=0;i<a;i++){
        int b = sc.nextInt();
        ls.add(b);
        }
        for(i=0;i<a;i++){
        if(ls.get(i)%7==0 ){
        arr.add(ls.get(i));
        ++count;
        }
        }
        int smallest = arr.get(0);
        for(i=0;i<count;i++){
        if(smallest > arr.get(i))
        {
            smallest = arr.get(i);
        }      
}
      System.out.println(ls.indexOf(smallest));    
}
}
