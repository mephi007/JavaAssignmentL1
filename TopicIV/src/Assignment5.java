import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		Scanner in = new Scanner(System.in);
		String name="";
		String c="";
		do {
			System.out.println("Enter names of the Employees");
			System.out.println("Enter name");
			name = in.next();
			set.add(name);
			System.out.println("do you want to enter more entries? type y or n");
			c = in.next();
		}while(c.equals("y"));
		
		System.out.println("the list of the employees name as follows");
		Iterator<String> i =  set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
