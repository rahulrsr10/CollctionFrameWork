package LinkList;

import java.util.LinkedList;

public class LinkListPractice {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Test");
		list.add("Project");
		list.add("Link");
		
		System.out.println(list);
		
		list.addFirst("Rahul");
		System.out.println(list);
		
		list.addLast("Rode");
		System.out.println(list);
		

	}

}
