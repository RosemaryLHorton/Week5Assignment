package javaw5HW;
public interface Logger {
	public static void main(String[] args) {
		Logger log = new AsteriskLogger();
		Logger error = new AsteriskLogger();
		Logger log2 = new SpacedLogger();
		Logger error2 = new SpacedLogger();
		Logger log3 = (Logger) new App();
		Logger error3 = (Logger) new App();
		
	 AsteriskLogger asteriskLogger = new AsteriskLogger();
	asteriskLogger.logger("Hello"); 
	asteriskLogger.message("Error: Hello");
	System.out.println();
	SpacedLogger spacedLogger = new SpacedLogger();
	spacedLogger.log2("Hello");
	System.out.println();
	spacedLogger.error2("Hello");
	System.out.println();
	App app = new App();
	app.log3("My name is Rosemary. What's yours?");
	app.error3("Read the following directions carefully!");
		
		
		
	}
	}


