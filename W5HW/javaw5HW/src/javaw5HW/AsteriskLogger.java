package javaw5HW;

public class AsteriskLogger implements Logger {

	public void logger(String log ) {
		// The log method on the AsteriskLogger should print out the String it receives 
		//between 3 asterisks on either side of the String 
		//(e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console.
System.out.println("***" + log + "***" );

		
	
System.out.println();
// The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
//with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
//****************
//***Error: Hello***
//****************

	}


	public void message(String error) {
		String asteriskLogger = "***" + error + "***";
		String border = "*" .repeat(asteriskLogger.length());
		System.out.println(border);
		System.out.println();
		System.out.println(asteriskLogger);
		System.out.println();
		System.out.println(border);
		
		
	}


	
		// TODO Auto-generated method stub
		
	


	
		
	}

		// TODO Auto-generated method stub
		
	



