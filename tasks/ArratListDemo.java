package tasks;

import java.util.ArrayList;
import java.util.List;

public class ArratListDemo {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Ashok");
		ls.add("reddy");

		ls.add("vurumundar");

		ls.add("kumar");

		ls.add("ojas");
		
		ls.forEach(x->System.out.println(x));
		
		for (String string : ls) {
			System.out.println(string);
		}
		System.out.println(ls);
					 
	}

}
