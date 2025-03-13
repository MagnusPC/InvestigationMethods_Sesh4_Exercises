package quantifiers;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//      int[] b = { };
//      int[] b = { 1, 2, -3, 4 };
      int b[] ={ 7, 6, 8, 5, 7, 7, 7, 8, 9, 2, 3 };
      List<Integer> l = create(b);


      System.out.println(l);  //printCol(l);       
      
      System.out.println("Sum: reduce(0, (x,y) -> x+y):" 
    		  +l.stream().reduce(0, (x,y) -> x+y));
      System.out.println("Square sum: reduce(0, (x,y) -> x+y*y):"
    		  +l.stream().reduce(0, (x,y) -> x+y*y));
      //Count is not defined
      System.out.println("Product: reduce(1, (x,y) -> x*y):"
    		  +l.stream().reduce(1, (x,y) -> x*y));
      System.out.println("Exists: anyMatch((x) -> x % 2 == 0):"
    		  +l.stream().anyMatch((x) -> x % 2 == 0) );
      System.out.println("Exists: anyMatch((x) -> x < 0)):"
    		  +l.stream().anyMatch((x) -> x < 0) );
      System.out.println("ForAll: allMatch((x) -> x > 0)):"
    		  +l.stream().allMatch((x) -> x > 0) );
      System.out.println("ForAll: allMatch((x) -> x % 2 == 0)):"
    		  +l.stream().allMatch((x) -> x % 2 == 0) );
      System.out.println("Minimum: min(Integer::compare).get()):"
    		  +l.stream().min(Integer::compare).get());
	}
	
	public static List<Integer> create(int a[]){
		List<Integer> returnList = new ArrayList<>();
		for(int x : a)
			returnList.add(x);
		return returnList;
	}
	
	public static void printCol(List<Integer> a) {
        if(!a.isEmpty()) {
            System.out.print("[ ");
            for(int x : a)
                System.out.print(x + ", ");
            System.out.println("]");
        }
        else
            System.out.println("[]");
        System.out.println();
    }

}
