package tasks;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private Map<Integer, String> empIdNameMap;
	public Employee(Map<Integer, String> empIdNameMap) {
		this.empIdNameMap = empIdNameMap;
	}

	public Employee() {
		
	}
	
	
	public Map<Integer, String> getEmpIdNameMap() {
		return empIdNameMap;
	}

	public void setEmpIdNameMap(Map<Integer, String> empIdNameMap) {
		this.empIdNameMap = empIdNameMap;
	}

	public String getEmployeeName(int id) {
		String res = "";
		if(empIdNameMap == null || empIdNameMap.size() == 0) {
			res = null;
		}
		else {
			if(empIdNameMap.containsKey(id)) {
				res = empIdNameMap.get(id);
				
			}
		}
		return res;
	}
}
public class EmployeeMapProgram {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Sam");
		map.put(3, "Jam");
		map.put(4, "Gam");
		employee.setEmpIdNameMap(map);
		System.out.println(employee.getEmployeeName(2));
	}

}
