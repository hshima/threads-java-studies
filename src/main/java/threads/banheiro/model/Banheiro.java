package threads.banheiro.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

	private Lock lock = new ReentrantLock();

	public void n1() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " bate na porta");
//		synchronized (this) {
		lock.lock();
		System.out.println(nome + " entra no banheiro");
		System.out.println(nome + " faz coisa r�pida");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wrapUp(nome);
		lock.unlock();
//		}

		saida(nome);
	}
 
	public void n2() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " bate na porta");
//		synchronized (this) {
		lock.lock();
			System.out.println(nome + " entra no banheiro");
			System.out.println(nome + " faz coisa demorada");
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			wrapUp(nome);
			lock.unlock();
//		}

		saida(nome);
	}

	private void wrapUp(String nome) {
		System.out.println(nome + " d� a descarga");
		System.out.println(nome + " est� lavando as m�os");
	}

	private void saida(String nome) {
		System.out.println(nome + " est� saindo do banheiro");
	}

}