package threads.lista.runner;

import lombok.AllArgsConstructor;
import threads.lista.model.Lista;

@AllArgsConstructor
public class AddElementRunner implements Runnable {

	private Lista list;
	private int n;
	public void run() {
		for(int i =0; i < 10; i++) {
			list.addElements("Thread: "+n+" - " + i);
		}
	}

}
