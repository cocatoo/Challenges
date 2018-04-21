package codingChallenge;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java5Future {

	public static void main(String[] args) {
		
		Callable<String> task = new MyCallable();
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Future> futureArrList = new ArrayList<>();

		for (int i = 0; i < 1; i++) {
			Future<String> future = executor.submit(task);
			futureArrList.add(future);
			
			while(!future.isDone()) {
				System.out.println("Waiting for future.....");
				
			}
			
			try {
				System.out.println("Future completed...."+future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		/*futureArrList.forEach(t -> {
			try {
				System.out.println(new Date()+ "::"+t.get());

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		} );
*/
		executor.shutdown();
	}
}

class MyCallable<T> implements  Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return Thread.currentThread().getName();		
	}


} 
