package threads.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import threads.lista.runner.AddElementRunner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Lista list  = new Lista();
//		List<String> list = new ArrayList<>();
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		for(int i =0; i < 100; i++) {
			new Thread(new AddElementRunner(list, i)).start();;
		}
		Thread.sleep(2000);
		for(int i =0; i < list.size(); i++) {
//			System.out.println(i + " - " + list.getElement(i));
			System.out.println(i + " - " + list.get(i));
		}
	}

}
