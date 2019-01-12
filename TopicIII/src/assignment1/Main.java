package assignment1;
import assignment1.invalidAgeException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		try {
		if(!(age >= 18 && age < 60))
		{
			throw new invalidAgeException();
		}
		}
		catch(invalidAgeException e)
		{
			System.out.println(e.toString());
		}
		

	}

}
