package threads.lista;

import threads.lista.model.Lista;
import threads.lista.runner.AddElementRunner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Lista list  = new Lista();
		for(int i =0; i < 100; i++) {
			new Thread(new AddElementRunner(list, i)).start();;
		}
		Thread.sleep(2000);
		for(int i =0; i < list.size(); i++) {
			System.out.println(i + " - " + list.getElement(i));
		}
	}

}
