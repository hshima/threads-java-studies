package threads.contador.runnable;

import lombok.Data;

@Data
public class ContadorRunnable implements Runnable {

	public void run() {
		for (int i  = 0; i < 1000; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + "; count: " + i);
		}
	}

}
