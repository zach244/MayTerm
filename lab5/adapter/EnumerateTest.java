/**
 * Way old-school Java program.
 */

import java.util.*;

public class EnumerateTest
{
	public static void main(String[] args) {
		OldStyleList<String> osl = new OldStyleList<String>();
		osl.add("one");		
		osl.add("two");		
		osl.add("three");		
		osl.add("four");		

		// get an enumeration of the list
		// the old style ...
		Enumeration e = osl.elements();

		System.out.println("Enumeration ..... the \"old-style\" way");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
