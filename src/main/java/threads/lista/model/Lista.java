package threads.lista.model;

public class Lista {
	
	private String[] elements = new String[1000];
	private int index = 0;
	
	public synchronized void addElements(String element) {
//		synchronized (this) {
			this.elements[index] = element;
			this.index++;
//		}
		
	}
	
	public int size() {
		return this.elements.length;
	}
	
	public String getElement(int position) {
		return this.elements[position];
	}

}
