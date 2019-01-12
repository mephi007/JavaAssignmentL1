package Assignment4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[] = {new Piano(), new Flute(),new Guitar()};
		Instrument obj[] = new Instrument[10];
		for(int i =0; i< 10; i++)
		{
			int j = (int) (Math.random() * (3 - 0)) + 0;
			obj[i] = (Instrument) a[j];
			obj[i].play();

			 if(obj[i] instanceof Piano) {
				 System.out.println("Piano is stored at "+i);
			 }
			 else if(obj[i] instanceof Flute)
			 {
				 System.out.println("Flute is stored at "+i);
			 }
			 else
			 {
				 System.out.println("Guitar is stored at "+i);
			 }
		} 
		
	}

}
