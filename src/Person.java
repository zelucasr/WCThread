import java.util.Random;

public class Person extends Thread{
	private Boolean gender; // true = homem, false = mulher (=^.^=)
	private String id;
	private WC wc;
	
	public Person(Boolean gender, WC wc, String id){
		this.gender = gender;
		this.id = id;
		this.wc = wc;
	}
	
	public Boolean getGender(){
		return gender;
	}
	
	public String getID(){
		return id;
	}

	@Override
	public void run() {
		int time;
		Random random = new Random();
		while(true){
			time = gender ? ((random.nextInt() % 6) + 10)*1000 : ((random.nextInt() % 6) + 5);
			// homem espera entre  10 a 15 segundos para ir ao banheiro
			// mulher espera de 5 a 10 segundos para ir ao banheiro
			try {
				Thread.sleep(time);	// Espera o mesmo tempo que ficou no banheiro antes de tentar entrar de novo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			wc.queue(this);	// Tenta entrar
				
			synchronized(wc){
				try {
					wc.wait();	// Espera o banheiro notificar que pode entrar
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			time = gender ? ((random.nextInt() % 6) + 5) : ((random.nextInt() % 6) + 10);	
			// homem fica de  5 a 10 segundos no banheiro
			// mulher fica de  10 a 15 segundos no banheiro
			try { // Espera o tempo destinado a ficar dentro do banheiro
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	

			wc.getOut(this);	// Sai do banheiro
		}
	}
}
