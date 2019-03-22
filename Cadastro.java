
/**
 * A classe Cadastro utiliza os dados de Aluno para armazena-los em cadastro
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 22.03.2019
 */
 public class Cadastro
 {
    private Aluno cad[];
    
    Cadastro(int tam){
       cad = new Aluno[tam]; //tam = 5
    }
    
    
    public Aluno inserirAluno(Aluno cad[], int num){
       return this.cad[num]; 
    }
    
    //inserir,remover
    
    
    
     
}
