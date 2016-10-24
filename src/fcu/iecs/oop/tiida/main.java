package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class main 
{
	private Scanner scanner;

	public main(String[] args)
	{
		int num,i=0;
		NissanTiida work=new NissanTiida();
		scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		num=scanner.nextInt();
		for(i=0;i<num;i++)
		{
			work.work2(num);
			System.out.print("\n");
		}
	}
}
