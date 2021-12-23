package javaw5HW;

public class SpacedLogger implements Logger {


	// If the log method received “Hello” as an argument, it should print H e l l o
		

		public void log2 (String message) {
		String log2 = buildMessage(message);
			System.out.println(log2);
		}
		
	private String buildMessage(String message) {
		// TODO Auto-generated method stub
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			b.append(ch);
			b.append(' ');
		}
		return b.toString();
	}



		


	public void error2(String message) {

	System.out.println("Error: " + buildMessage(message));	
	}

	//The error method should do the same, but with “ERROR:” preceding the spaced out input 
		//(i.e. ERROR: H e l l o)

		
		}




