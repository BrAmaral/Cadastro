import java.util.ArrayList;
/**
 * Escreva a descrição da classe Lista aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 21.03.2019
 */
public class Lista //implements IArmazenador
{
    private ArrayList arrayL;
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
}
