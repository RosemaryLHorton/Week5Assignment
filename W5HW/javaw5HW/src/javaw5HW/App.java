package javaw5HW;

public class App implements Logger  {

	
		public void log3 ( String message) {
			System.out.println("***" + message + "***" );
		// TODO Auto-generated method stub
		
		
	}

	 void error3 (String message) {
		String error3 = buildMessage(message);
			System.out.println(error3);
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
		// TODO Auto-generated method stub
		
	}


