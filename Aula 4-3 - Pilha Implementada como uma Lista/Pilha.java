// Pilha criada para trabalhar com armazenamento de inteiros
public class Pilha implements IPilha{
    private int valores[];
    private int topo;
    

    
    public Pilha(){
        valores = new int[10];
        topo    = -1;
    }
    public void push (int elemento){
        topo+=1;
        valores[topo] = elemento;
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public boolean isFull(){
        return (topo == 9);
    }

    public int pop(){
        int elem = valores[topo];
        topo-=1;
        return elem;
    }
}