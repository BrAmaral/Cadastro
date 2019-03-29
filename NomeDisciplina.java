
/**
 * Escreva a descrição da classe NomeDisciplina aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class NomeDisciplina extends Texto
{
    private String nomeDisciplina;
    
    public NomeDisciplina(String nomeDisciplina){
        super(nomeDisciplina);
        setNomeDisciplina(super.getTxt());
    }   
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }  
    
    
}
