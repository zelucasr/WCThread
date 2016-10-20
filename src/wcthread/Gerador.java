/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcthread;

import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zelucas
 */
public class Gerador extends Thread {
    
    private boolean tipoGerador; //diferenciar gerador de homens e de mulheres
    private Queue fila;
    
    public Gerador(boolean tipoGerador, Queue fila){
        this.tipoGerador = tipoGerador;
        this.fila = fila;
    }
    
    @Override
    public void run(){
        Random random = new Random();
        
        while(true){
            int timeCreation = random.nextInt() % 15;
            try {
                Thread.sleep(timeCreation*1000);
                gerarPessoa();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void gerarPessoa(){
        Random random = new Random();
        
        int timeWC = random.nextInt();
        Pessoa pessoa = new Pessoa(tipoGerador, timeWC);
        //mandar pessoa para a fila
        fila.offer(pessoa);
    }
    
    /* métodos da fila:
    fila.offer(pessoa);
    Pessoa pessoaRemovida = (Pessoa)fila.poll();
    */
    
}
