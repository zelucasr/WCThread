/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wcthread;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author zelucas
 */
public class Controlador {
    
    private Queue filaHomens;
    private Queue filaMulheres;
    private Gerador geradorHomens;
    private Gerador geradorMulheres;
    
    public Controlador(){
        filaHomens = new LinkedList();
        filaMulheres = new LinkedList();
        geradorHomens = new Gerador(true, filaHomens);
        geradorMulheres = new Gerador(false, filaMulheres);
    }
    
    /* métodos da fila:
    fila.offer(aluno);
    Aluno alunoRemovido = (Aluno)fila.poll();
    */
    
}
