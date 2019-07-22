import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(22);
		list.add(44);
		list.add(77);
		list.add(24);
		list.add(33);
		list.add(21);
		list.add(99);
		list.add(88);
		list.add(55);
		list.add(66);
		
		System.out.println(list);
		
		//filter operation
		List l1 = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//map operation
		List l2 = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(l2);
		
//		takeWhile operation
//		List l3 = list.stream().takeWhile(n->n%2==0).collect(Collectors.toList());
//		System.out.println(l3);
		
//		dropWhile operation
//		List l4 = list.stream().dropWhile(n->n%2==0).collect(Collectors.toList());
//		System.out.println(l4);
		
		Stream.iterate(1,x->x+1).forEach(System.out::println);
		
//		flatMap
//		List l5 = list.stream().flatMap(e->Stream.ofNullable(e)).collect(Collectors.toList());
//		System.out.println(l5);
		
	}
}
