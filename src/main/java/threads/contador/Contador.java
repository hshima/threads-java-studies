package threads.contador;

import threads.contador.runnable.ContadorRunnable;

public class Contador {
	
	public static void main(String[] args) {
		new Thread(new ContadorRunnable()).start();
		new Thread(new ContadorRunnable()).start();	
	}
	
}
