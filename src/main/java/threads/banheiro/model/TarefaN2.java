package threads.banheiro.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TarefaN2 implements Runnable {
	Banheiro banheiro;

	public void run() {
		this.banheiro.n2();

	}

}
