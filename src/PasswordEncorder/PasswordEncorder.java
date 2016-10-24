package PasswordEncorder;

public class PasswordEncorder 
{
	public String turn(String word)
	{
		word = word.replace("a", "4");
		word = word.replace("A", "4");
		word = word.replace("E", "3");
		word = word.replace("e", "3");
		word = word.replace("I", "1");
		word = word.replace("i", "1");
		word = word.replace("o", "0");
		word = word.replace("O", "0");
		word = word.replace("T", "7");
		word = word.replace("t", "7");
		return word;
	}
	
}
