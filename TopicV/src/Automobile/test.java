package Automobile;

import java.util.Scanner;

import Automobile.TwoWheeleer.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("whose info would you like know, hero or honda?");
		String com = in.next();
		if(com.equalsIgnoreCase("hero"))
		{
			Hero hero = new Hero();
			System.out.println(hero.ownerName());
			System.out.println(hero.modelName());
			System.out.println(hero.registrationNumber());
			System.out.println(hero.speed());
			hero.radio();
		}
		else
		{
			Honda honda = new Honda();
			System.out.println(honda.ownerName());
			System.out.println(honda.modelName());
			System.out.println(honda.registrationNumber());
			System.out.println(honda.speed());
			System.out.println(honda.cdplayer());
		}

	}

}
