package wcthread;

import java.util.LinkedList;
import java.util.Queue;

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
    
    /* metodos da fila:
    fila.offer(aluno);
    Aluno alunoRemovido = (Aluno)fila.poll();
    */
    
}
