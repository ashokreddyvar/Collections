package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArraystoString {
}
class Employeedetails{
	private Map<Integer,String> employeeNameidMap;
	public Employeedetails() {
	
		employeeNameidMap = new TreeMap<Integer,String>();
		
	}
	public Employeedetails(Map<Integer,String> employeeNameidMap ) {
	
		this.employeeNameidMap = employeeNameidMap ;
	}
	
	public String getEmployeeNames(int employeeid) {
		String str = "";
		int count = 0;
		if(employeeNameidMap == null || employeeNameidMap.size() == 0 ) {
		return null;
		}
		else {
			if(employeeNameidMap.containsKey(employeeid)) {
				str = employeeNameidMap.get(employeeid);
			}
		}
		if(str.length() == 0) {
			return null;
		}
		else {
			return str;
		}
	}
	public Map<Integer,String> employeeNameidMap(){
		return employeeNameidMap;
		
	}
	public void setEmployeeNameMap(Map<Integer,String> employeeNameidMap) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		Map<Integer,String> m = new HashMap<Integer, String>();
		
		for(int i = 0; i< num1; i++) {
			System.out.println(" enter the kay value");
			m.put(sc.nextInt(),sc.next());
		}
		Employeedetails emp = new Employeedetails(m);
		System.out.println(" enter kay to search");
		System.out.println(emp.getEmployeeNames(sc.nextInt()));
	}

	
		
		
		
		
		

}
