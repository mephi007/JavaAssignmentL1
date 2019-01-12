package assignment5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="How was your day today";
		
		char c = 'a';
		
		int count=0;
		
		for(int i =0 ; i< str.length(); i++)
		{
			if(c == str.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("no. of ocurrences of a is::"+count);

	}

}
