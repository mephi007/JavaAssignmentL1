import java.sql.Timestamp;

class time extends Thread{
	public void run() {
		try {	
			for(int i=0; i<10; i++) 
			{
				Timestamp time = new Timestamp(System.currentTimeMillis());
				System.out.println(time);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Assignment2 {

	public static void main(String[] args) {
		
		time obj = new time();
		obj.start();
	}

}


