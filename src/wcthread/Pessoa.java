package wcthread;

public class Pessoa {
    
    private boolean sexo; // false = mulher, true = homem
    private int time; // Tempo que vai ficar dentro do banheiro
    
    public Pessoa(boolean sexo, int time){
        this.sexo = sexo;
        this.time = time;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    
}
