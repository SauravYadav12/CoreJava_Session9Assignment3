import java.util.HashMap;
import java.util.Map;

public class MapGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp2 = new Employee(102);
		Employee emp3 = new Employee(102);
		
		Employee emp4 = new Employee("Saurav");
		Employee emp5 = new Employee("Ankit");
		
		Map<Employee,Employee> empMap=new HashMap<Employee,Employee>();

		//Map<Integer,String> empMap2=new HashMap<Integer,String>();
		
		empMap.put(emp2,emp4);
		empMap.put(emp3,emp5);
		
		//empMap2.put(1,"Chetan");
		//empMap2.put(2, "Pratik");
		
		
		System.out.println(empMap.entrySet());
		System.out.println(empMap.get(emp2));
		System.out.println(empMap.get(emp3));
	}

}
