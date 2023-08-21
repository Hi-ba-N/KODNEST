package characterIdentifier;

import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)

	 

    {

    if(Character.isLowerCase(ch))

    {

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')

    {

         System.out.println("lower case vowel");

    }

    else

    {

         System.out.println("lower case consonant");

    }

    }

    else if(Character.isUpperCase(ch))

      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')

    {

         System.out.println("upper-case vowel");

    }

    else

    {

         System.out.println("upper-case consonant");

    }

    else if(Character.isDigit(ch))

         System.out.println("Digit");

    else

    {

         System.out.println("Special Charecter");

    }

    

    }



    public static void main(String[] args)



    {



    Scanner scan=new Scanner(System.in);

    char ch=scan.next().charAt(0);

    identifyCharacter(ch);



    }
}
