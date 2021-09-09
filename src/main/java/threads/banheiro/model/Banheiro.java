package threads.banheiro.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

	private Lock lock = new ReentrantLock();
	private boolean isDirty = true;


	private void waitOutSide() {
		System.out.println("Yuck!! Sujo!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void n1() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " bate na porta");
		synchronized (this) {
//		lock.lock();

			if (isDirty) {
				waitOutSide();
			}
		System.out.println(nome + " entra no banheiro");

		System.out.println(nome + " faz coisa rápida");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wrapUp(nome);
//		lock.unlock();
		}

		saida(nome);
	}

	public void n2() {

		String nome = Thread.currentThread().getName();

		
		System.out.println(nome + " bate na porta");
		synchronized (this) {
//		lock.lock();
		
		if(isDirty) {
			waitOutSide();
		}
		System.out.println(nome + " entra no banheiro");
		System.out.println(nome + " faz coisa demorada");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wrapUp(nome);
//		lock.unlock();
		}

		saida(nome);
	}
	
	public void limpar() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " bate na porta");
		
		if(!isDirty) {
			System.out.println(nome + " não precisa limpar");
			return;
		}
		
		synchronized (this) {
			System.out.println(nome + " entrando no banheito");
			System.out.println(nome + " limpando o banheiro");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(nome + " saindo do banheiro");
//			this.notifyAll();
			this.notifyAll();
		}
		
		this.isDirty = false;
	}

	private void wrapUp(String nome) {
		System.out.println(nome + " dá a descarga");
		System.out.println(nome + " está lavando as mãos");
	}

	private void saida(String nome) {
		System.out.println(nome + " está saindo do banheiro");
	}

}
