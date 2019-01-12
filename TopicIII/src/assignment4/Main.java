package assignment4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Malayalam";
		
		
		String c="";
		for(int i=x.length()-1 ; i >=0 ; i--)
		{
			c = c+x.charAt(i);
		}
		
		if(x.equalsIgnoreCase(c))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		

	}

}
