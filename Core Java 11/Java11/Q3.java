package Java11;

import java.util.ArrayList;
import java.util.List;

public class Q3{

	public static void main(String[] args) {

		List<String> List1 = new ArrayList<String>();
		List1.add("A");
		List1.add("quick");
		List1.add("brown");
		List1.add("fox");
		List1.add("jumps");
		List1.add("over");
		List1.add("the");
		List1.add("lazy");
		List1.add("dog");
  
        String[] arr = new String[List1.size()];
        arr = List1.toArray(arr);
  
        for (String x : arr)
            System.out.print(x + " ");
	}

}