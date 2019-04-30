import java.util.ArrayList;
/**
 * Escreva a descrição da classe Lista aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 21.03.2019
 */
public class Lista //implements IArmazenador
{
    private ArrayList<Object> arrayL = new ArrayList<Object>();
    private int qtdd;
    
    public Lista(){
        setVet(new ArrayList());
        setQtdd(0);
    }  
    
    public ArrayList getVet(){
        return arrayL;
    }    
    
    public int getQtdd(){
        return qtdd;
    }    
    
    public void setVet(ArrayList arrayL){
        this.arrayL = arrayL;
    }   
    
    public void setQtdd(int qtdd){
        this.qtdd = qtdd;
    } 
    
    public void adicionar(Object x){
        arrayL.add(x);
        setQtdd(getQtdd()+1);
    }
    
    public void remover(Object x){
        arrayL.remove(x);
        setQtdd(getQtdd()-1);
    }
    
    public int tamanho(Object x){
        return arrayL.size();
    }
    
    public Object buscar(int x){
        return arrayL.get(x);
    }
    
    public boolean vazia(){
        return (qtdd == 0);
    }
    
    public void imprimir(){
        System.out.println(arrayL);
    }
    
}
