package threads.lista.runner;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddElementRunner implements Runnable {

//	private Lista list;
	private List<String> list;
	private int n;
	public void run() {
		for(int i =0; i < 10; i++) {
//			list.addElements("Thread: "+n+" - " + i);
			list.add("Thread: "+n+" - " + i);
		}
	}

}
