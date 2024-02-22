package com.tnsif.lec2.loopingstatement;

public class NestedIfElseemo {

	public static void main(String[] args) {
		int x=10,y=11,z=12;
		if(x>y)
		{
			if(x>z)
				System.out.println(" x is a larger no.");
			else
				System.out.println("zis a larger no.");

	}else
		if(z>y)
			System.out.println(" z is a larger no.");
		else
			System.out.println(" y is larger no.");
				}
}
	


