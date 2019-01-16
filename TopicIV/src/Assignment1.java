class Number extends Thread{
	
	public void run()
	{
		for(int i=0; i<5; i++) {
		int j=(int)(Math.random()*(5-0))+0;
		System.out.println("Number ::"+j);
		System.out.println("factorial ::"+ fact(j));
		}
		
	}
	
	int fact(int n)
	{
		if(n==0 || n==1 )
		{
			return 1;
		}
		else {
			int fac = n*fact(n-1);
			return fac;
		}
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj = new Number();
		obj.start();

	}

}
