package com.alg.oodesign.solution3;

public class Test {

	public static void main(String[] args) {
		SquareCookie s1 = new SquareCookie("100", 10);
		System.out.println(s1.getDetails());
		
		CircleCookie c1 = new CircleCookie("200", 10);
		System.out.println(c1.getDetails());
		
		NutsDecoratorCookie nd1 = new NutsDecoratorCookie(c1, 2);
		System.out.println(nd1.getDetails());

		
		SprinklesDecoratorCookie sd1 = new SprinklesDecoratorCookie(nd1, 0.2f);
		System.out.println(sd1.getDetails());
		
		SprinklesDecoratorCookie sd2 = new SprinklesDecoratorCookie(sd1, 0.5f);
		System.out.println(sd2.getDetails());
	}

}
