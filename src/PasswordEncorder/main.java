package PasswordEncorder;

import java.util.Scanner;
public class main 
{
	private Scanner scanner;

	public main(String[] args)
	{
		PasswordEncorder use=new PasswordEncorder();
		int flag=1;
		String word,nword = null;
		scanner = new Scanner(System.in);
		do
		{
			System.out.println("Please enter a password:");
			word=scanner.nextLine();
			if(word.equals("exit"))
			{
				flag=0;
			}
			else
			{
				nword=use.turn(word);
			}
			System.out.println(nword);
		}while(flag!=0);
		
		
	}

}
