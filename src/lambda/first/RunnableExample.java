package lambda.first;

public class RunnableExample {

	public static void main(String[] args) {

		// prior to java 8
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
				
			}
		};
	
		
		new Thread(runnable).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Legacy Runnable");
				
			}
		}).start();
		
		Runnable runnableLambda = () -> {
			System.out.println("Lambda Runnable example one");
		};
		
		new Thread(runnableLambda).start();
		
		Runnable runnableLambdaTwo = () -> System.out.println("Lambda Runnable example two");
		
		new Thread(runnableLambdaTwo).start();
		
		new Thread(()-> System.out.println("Lambda Runnable example three")).start();
		
		
	}

}
