import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		String phone=""; 
		String c="";
		String name="";
		do {
			System.out.println("Name : Mobile number entry");
			System.out.println("Enter name");
			name = in.next();
			System.out.println("enter contact details");
			phone = in.next();
			map.put(name, phone);
			System.out.println("do you want to enter more entries? type y or n");
			c = in.next();
		}while(c.equals("y"));
		
		System.out.println("Enter the name whose number you want to search?");
		String search = in.next();
		
		if(map.containsKey(search))
		{
			String res= map.get(search);
			System.out.println("the contact details of corresponding name is ::"+ res);
		}
		else
		{
			System.out.println("Sorry! not in a list");
		}
	}

}
