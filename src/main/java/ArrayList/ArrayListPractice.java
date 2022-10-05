package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Rahul",26,"Electrical");
		Employee emp2=new Employee("Ridhima",27,"Computer");
		Employee emp3=new Employee("Sarthak",25,"Electronics");
		Employee emp4=new Employee("Prasad",30,"Civil");
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		arr.add(emp4);
		
		Iterator<Employee> itr=arr.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.department);
			
			
		}
		

	}

}
