import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WC extends Thread{
	private int limite; // quantidade limite de pessoas dentro do banheiro
	private ArrayList<Person> wc; // ArrayList representando as pessoas que estão dentro do banheiro
	private Queue<Person> queue; // fila dos homens
	
	public WC(int limite){
		this.limite = limite;
		this.wc = new ArrayList<Person>();
		this.queue = new LinkedList<Person>();
	}
	
//	private void printWC(){
//		System.out.print("WC: [ ");
//		for(Person p : wc){
//			System.out.print(p.getID() + " ");
//		}
//		System.out.println("]");
//	}
//	
//	private void printQueue(){
//		System.out.print("Fila: [ ");
//		for(Person p : queue){
//			System.out.print(p.getID() + " ");
//		}
//		System.out.println("]");
//	}
//	
//	private void print(){
//		printWC();
//		printQueue();
//	}
	
	public synchronized void queue(Person person){
		queue.offer(person);
	}
	
	public synchronized void getIn(Person person){
		wc.add(queue.poll());
		notify();
	}
	
	public synchronized void getOut(Person person){
		wc.remove(person);
	}
	
	@Override
	public void run() {
		while(true){
			if(queue.size() > 0){
				if(wc.size() == 0){
					getIn(queue.poll());
				}
				else if(wc.size() > 0 && wc.size() < limite && queue.peek().getGender() == wc.get(0).getGender()){
					getIn(queue.poll());
				}
			}
		}
	}
	
	public static void main(String[] args) {  
        WC wc = new WC(5);
        int NUMERO_DE_PESSOAS = 10;
        Person[] person = new Person[NUMERO_DE_PESSOAS];
        for(int i = 0; i < NUMERO_DE_PESSOAS; i++){
        	person[i] = i % 2 == 0 ? new Person(true, wc, "H"+(i/2)) : new Person(false, wc, "M"+((i/2)+1));
        }
        wc.start();
        for(int i = 0; i < NUMERO_DE_PESSOAS; i++){
        	person[i].start();
        }
    }
}