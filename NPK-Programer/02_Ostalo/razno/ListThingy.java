package razno;

import java.util.ArrayList;
import java.util.Scanner;

public class ListThingy{

  static Scanner sc = new Scanner (System.in);
  static ArrayList < String > storedInputs = new ArrayList < String > ();


  public static void main (String[]args){


    System.out.println ("");
    commandsPrint ();

    while (true)  {
	System.out.println ("Insert next element: ");
	storedInputs.add (sc.nextLine ());

	if (storedInputs.contains ("/clear"))
	  {
	    storedInputs.clear ();
	    //break;
	  }

	if (storedInputs.contains ("/end"))
	  {
	    storedInputs.remove (storedInputs.size () - 1);
	    break;
	  }

	if (storedInputs.contains ("/remove") && storedInputs.size () > 2)
	  {
	    storedInputs.remove (storedInputs.size () - 1);
	    storedInputs.remove (storedInputs.size () - 1);
	    System.out.println (">> :: Table content: " + storedInputs);
	    if (storedInputs.size () < 2)
	      {
		System.out.println ("Use /clear to delete all elements");
	      }
	  }

	if (storedInputs.contains ("/show"))
	  {
	    storedInputs.remove (storedInputs.size () - 1);
	    System.out.println (">> :: Table content: " + storedInputs);
	  }

	if (storedInputs.contains ("/commands"))
	  {
	    commandsPrint ();
	    storedInputs.remove (storedInputs.size () - 1);
	  }	

      }


    if (storedInputs.size () > 0)
      {
	System.out.println (">> :: Table content: " +
			    storedInputs.toString ());
      }

    if (storedInputs.isEmpty ())
      {
	System.out.println (" >> :: Table is empty!");
      }

    sc.close ();


  }

  //Methods:
  public static void commandsPrint ()
  {
    System.out.println ("\n**Commands **");
    System.out.
      println (">> ::  /clear \t CLEARS ALL ELEMENTS FROM THE TABLE");
    System.out.
      println
      (">> ::  /remove \t REMOVES LAST ELEMENT AND DISPLAYS CURRENT TABLE ELEMENTS");
    System.out.
      println
      (">> ::  /end  \t EXIT THE APPLICATION AND DISPLAY TABLE ELEMENTS ");
    System.out.println (">> ::  /show  \t DISPLAY TABLE ELEMENTS");    
    System.out.
      println (">> ::  /commands  \t DISPLAY THIS 'COMMANDS'  SECTION\n");
  }



}

