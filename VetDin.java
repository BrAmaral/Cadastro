/**
 * Escreva a descrição da classe VetDin aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhões
 * 21.03.2019
 */
public class VetDin implements IArmazenador
{
    Aluno vet[];
    int quanti;
    
    VetDin(){
        setVet(null);
        setQuanti(0);
    }  
    
    public Aluno[] getVet(){
        return vet;
    }    
    
    public int getQuanti(){
        return quanti;
    }    
    
    public void setVet(Aluno[] vet){
        this.vet = vet;
    }   
    
    public void setQuanti(int quanti){
        this.quanti = quanti;
    } 
    
    public boolean inserirAluno(Aluno obj){
        try{
            if (vet == null){
                setVet(new Aluno[1]);
                vet[0] = obj;
                setQuanti(getQuanti()+1);
                return true;
            }    
            else{
                Aluno aux[] = new Aluno[vet.length+1];
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
    
    Aluno removerAluno (){
        Aluno ret = null;
        if(vet != null){
            ret = vet[vet.length-1];
            vet[vet.length-1] = null;
        }

        // atualiza vetor
        // cria vetor auxiliar
        Aluno aux[] = new Aluno[vet.length-1];

        // copia todos elementos de vet para aux
        copiar(vet, aux);
        setVet(aux);

        setQuanti(getQuanti()-1);
        return ret;
    }

    Aluno buscar (int i){
        return vet[i];
    }

    boolean vazia(){
        return (quanti==0);
    }

    private void copiar(Aluno origem[], Aluno destino[]){
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
            if (vet[i].getRa().equals(ra)) {
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
