/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcthread;

/**
 *
 * @author zelucas
 */
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
