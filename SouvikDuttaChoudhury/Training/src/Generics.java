import java.util.*;


public class Generics {
	public static void main(String args[]){
		TreeSet<String> list=new TreeSet();
		list.add("one");
		list.add("five");
		list.add("mango");
		list.add("apple");
		list.add("mango");
		Iterator it=list.iterator();
		while (it.hasNext() ) {
		 System.out.print( it.next() + " " );
		 	} 
		//String fruit=list.get();
		//System.out.println(fruit);
	}
}
