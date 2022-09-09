package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Lists {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		
		
		Iterator<String> iterator = myList.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
		}
		
		for(String next : myList) {
			System.out.println(next);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			intList.add(random.nextInt(1000));
			
		}
		
		Collections.sort(intList);
		System.out.println("Natural Sorting: " + intList);
		
		
		Collections.reverse(intList);
		System.out.println("Reverse Sorting: " + intList);
	}

}
