import Elementos.Disciplina;
/**
 * Escreva a descrição da classe Lista aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 23.04.2019
 */
public class Disciplinas
{
    public IArmazenador armazem;
    
    public Disciplinas(){
        this.armazem = new VetDin();
    }    
    
    public void inserirAluno(Disciplina disc){
        this.armazem.inserirAluno(disc);
    }    
    
    private boolean removerAluno(String sigla){
        boolean ret = false;
        int indice = buscar(sigla);
        
        if(indice>=0)
        {
            this.armazem.removerAluno(indice);
            ret = true;
        }   
        return ret;
    }   
    
    private int buscar(String sigla){
        int indice = -1;
        Object vet[] = ((VetDin)this.armazem).getVet();
        int i;
        //Object vet[] = ((Lista)this.armazem).getVet();
        
        if (vet != null){
            for(i=0; i < vet.length; i++){
                Disciplina a = (Disciplina) vet[i];
                if (a.getSigla().equals(sigla)){
                    indice = i;
                    break;
                }    
            }    
        }
        return indice;
    }    
}
