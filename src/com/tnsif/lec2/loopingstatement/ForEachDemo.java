package com.tnsif.lec2.loopingstatement;

public class ForEachDemo {

	public static void main(String[] args) {
				int arr[]= {10,20,30,40,50};
				for(int i:arr)
				{
					System.out.println(i);
				}

				
				char charArr[]= {'z','x','c'};
				for(char c:charArr)
				{
					System.out.println(c);
				}	
				
				String strArr[]= {"Java","Ritesh"};
				for(String str:strArr)
				{
					System.out.println(str);
				}

	}

}
