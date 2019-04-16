package Elementos;
/**
 * Escreva a descrição da classe Disciplina aqui.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos e Victor Bulhões
 * @version (número de versão ou data)
 */
public class Disciplina
{
    public NomeDisciplina nomeDisciplina;
    public String siglaDisciplina;
    public double nota;
    
    public Disciplina(String nomeDisciplina, String siglaDisciplina, double nota){
        this.nomeDisciplina = new NomeDisciplina(nomeDisciplina);
        this.siglaDisciplina = siglaDisciplina;
        this.nota = nota;
    }    
    
    public String getNomeDisciplina(){
        return nomeDisciplina.getNomeDisciplina();
    }   
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina.setNomeDisciplina(nomeDisciplina);
    }
    
    public String getSiglaDisciplina(){
        return siglaDisciplina;
    }    
    
    public void setSiglaDisciplina(String siglaDisciplina){
        this.siglaDisciplina = siglaDisciplina;
    }    
    
    public double getNota(){
        return nota;
    }    
    
    public void setNota(double nota){
        this.nota = nota;
    }    
}
