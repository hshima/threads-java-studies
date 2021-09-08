package threads.banheiro.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TarefaN1 implements Runnable {

	private Banheiro banheiro;

	public void run() {
		this.banheiro.n1();
		
	}

}
