package threads.banheiro;

import threads.banheiro.model.Banheiro;
import threads.banheiro.model.TarefaN1;
import threads.banheiro.model.TarefaN2;

public class UsandoBanheiro {

	public static void main(String[] args) {

		Banheiro banheiro1 = new Banheiro();
		Banheiro banheiro2 = new Banheiro();
		
		// Usando o mesmo banheiro
		Thread c1 = new Thread(new TarefaN1(banheiro1), "Joao");
		Thread c2 = new Thread(new TarefaN2(banheiro1), "Maria");

		// usando banheiros diferentes
//		Thread c1 = new Thread(new TarefaN1(banheiro1), "Joao");
//		Thread c2 = new Thread(new TarefaN2(banheiro2), "Maria");
		
		c1.start();
		c2.start();
	}

}
