package assignment3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = {Integer.parseInt(args[0]),
					      Integer.parseInt(args[1]),
					      Integer.parseInt(args[2]),
					      Integer.parseInt(args[3]),
					      Integer.parseInt(args[4]),};
			int sum =0;
			for(int i=0 ; i<arr.length ; i++)
			{
				sum += arr[i];
			}
			
			int avg = sum/5;
			
			System.out.println("average marks of 5 integers is::"+avg);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You have entered less than 5 integers, please write 5 integers");
		}

	}

}
