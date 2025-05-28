package org.selenium.automation;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10;
		for (int i=1 ; i<=max ; i++)
		{
			
				if(i%2!=0)
				{
					System.out.println("Print the odd numbers: " + i);
					
			}
		}
	}

}
