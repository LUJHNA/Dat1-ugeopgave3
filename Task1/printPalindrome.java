import java.io.*;
import java.util.Scanner;

class printPalindrome {

public static void main(String[] args) {

String word = "Den laks skal ned", reverseWord="";
char ch;

	for(int i=0; i<word.length(); i++)
	{
		ch = word.charAt(i);
		reverseWord = ch+reverseWord;
	}
	System.out.println(word.equalsIgnoreCase(reverseWord));
System.out.println("" +reverseWord);
}

}



	

