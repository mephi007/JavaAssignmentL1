package assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		
		try {
			
			int mark1 = Integer.parseInt(args[1]);
			int mark2 = Integer.parseInt(args[2]);
			int avg = (mark1+mark2)/2;
			System.out.println("average marks of two subjects is::"+avg);
		}
		catch(NumberFormatException e)
		{
			System.out.println("enter integer only");
		}

	}

}
