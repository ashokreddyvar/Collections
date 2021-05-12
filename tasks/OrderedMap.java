package tasks;

import java.util.HashMap;
import java.util.Map;

public class OrderedMap {
static Map <Integer,String> map = new HashMap<>();
	
	public static void addElements(int id, String name) {
		map.put(id, name); 
	 }

	public static void main(String[] args) {
		OrderedMapPojo op = new OrderedMapPojo(201,"ashok");
		OrderedMapPojo op1 = new OrderedMapPojo(199,"ashok");
		OrderedMapPojo op2 = new OrderedMapPojo(204,"ashok");
		
		addElements(op.getPersonid(), op.getName());
		addElements(op1.getPersonid(), op1.getName());
		addElements(op2.getPersonid(), op2.getName());
		
		 
		System.out.println(map);	
		
	}
}