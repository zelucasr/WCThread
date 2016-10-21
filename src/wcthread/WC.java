package wcthread;

import java.util.ArrayList;

public class WC {
    
    private int maxPessoas;
    private ArrayList dentroWC; // lista de pessoas dentro do banheiro
    
    public WC(int maxPessoas){
        this.maxPessoas = maxPessoas;
        dentroWC = new ArrayList<Pessoa>();
    }
    
    public void inserirPessoa(Pessoa pessoa){
        dentroWC.add(pessoa);
    }
    
    public void retirarPessoa(Pessoa pessoa){
        dentroWC.remove(pessoa);
    }
    
    public int dentroDoBanheiro(){
        return dentroWC.size();
    }
}
