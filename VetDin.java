//import Elementos.Aluno;
import Alunos.Aluno;
/**
 * Escreva a descrição da classe VetDin aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhões
 * 21.03.2019
 */
public class VetDin implements IArmazenador 
{
    Object vet[];
    int quanti;
    
    VetDin(){
        setVet(null);
        setQuanti(0);
    }  
    
    public Object[] getVet(){
        return vet;
    }    
    
    public int getQuanti(){
        return quanti;
    }    
    
    public void setVet(Object[] vet){
        this.vet = vet;
    }   
    
    public void setQuanti(int quanti){
        this.quanti = quanti;
    } 
    
    public boolean inserirAluno(Object obj){
        try{
            if (vet == null){
                setVet(new Object[1]);
                vet[0] = obj;
                setQuanti(getQuanti()+1);
                return true;
            }    
            else{
                Object aux[] = new Object[vet.length+1];
                copiar(vet, aux);
                aux[aux.length-1] = obj;
                setVet(aux);
                setQuanti(getQuanti()+1);
                return true;
            }    
        }catch(Exception e){
            return false;
        }    
    }  
    
    Object removerAluno (){
        Object ret = null;
        if(vet != null){
            ret = vet[vet.length-1];
            vet[vet.length-1] = null;
        }

        // atualiza vetor
        // cria vetor auxiliar
        Object aux[] = new Object[vet.length-1];

        // copia todos elementos de vet para aux
        copiar(vet, aux);
        setVet(aux);

        setQuanti(getQuanti()-1);
        return ret;
    }

    Object buscar (int i){
        return vet[i];
    }

    boolean vazia(){
        return (quanti==0);
    }

    private void copiar(Object origem[], Object destino[]){
        // copia todos
        int i;
        for (i = 0; i < vet.length; i++){
            if (vet[i] != null) {
                destino[i] = origem[i];
            }
        }       
    }

    public boolean removerAluno(String ra){
        int i;
        boolean ret = false;
        
        for (i = 0; i < vet.length; i++){
            Aluno a = (Aluno) vet[i];
            if (a.getRa().equals(ra))
            {
                
                vet[i] = null;
                ret = true;
                break;
            }
        }       
        
        return ret;
    }
    
    public void imprimir(){
        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
