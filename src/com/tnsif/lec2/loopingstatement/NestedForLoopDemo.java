package com.tnsif.lec2.loopingstatement;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		for(int j=2	;j<=10;j++)
		for(int i=1;i<=10;i++) {
			System.out.println(j*i);
			{
				System.out.println(" ");
			}

	}

}
}
