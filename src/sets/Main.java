package sets;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Character> a, b;
		
//		intersection:
		a = create('a', 'h');
		System.out.print("aSet = ");
		print(a);
		b = create('c', 'k');
		System.out.print("bSet = ");
		print(b);
		a. retainAll(b);
		System.out.println("aSet intersect bSet = ");
		print(a);
		System.out.println();
		
//		union:
		a = create('a', 'h');
		System.out.print("aSet = ");
		print(a);
		System.out.print("bSet = ");
		print(b);
		a.addAll(b);
		System.out.println("aSet union bSet = ");
		print(a);
		System.out.println();
		
//		set difference:
		System.out.println();
		a = create('a', 'h');
		System.out.print("aSet = ");
		print(a);
		System.out.print("bSet = ");
		print(b);
		a.removeAll(b);
		System.out.println("aSet set diff bSet = ");
		print(a);
		System.out.println();
			
	}
	
	private static Set<Character> create(char fromIncl, char toExcl){
		Set<Character > a = new TreeSet<>();
		for(char c= fromIncl; c < toExcl; c++ ) {
			a.add(c);
		}
		return a;
	}

	private static void print(Set<Character> cSet) {
		System.out.print('{');
		for(char c : cSet) {
			System.out.print(c + ", ");			
		}
		System.out.println('}');
	}
}

