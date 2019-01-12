package Music.live;

import Music.strings.*;
import Music.wind.Saxophone;
import Music.Playable;

public class Test {
	public static void main(String[] args) {
		
	
	Veena veena = new Veena();
	veena.play();
	Saxophone saxo = new Saxophone();
	saxo.play();
	
	Playable play = veena;
	play.play();
	
	Playable play1 = saxo;
	play1.play();
	
	}

}
