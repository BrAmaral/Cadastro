
/**
 * A classe Cadastro utiliza os dados de Aluno para armazena-los em cadastro
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 22.03.2019
 */
 public class Cadastro
 {
    public Aluno cad[];
    int tamanho;
    
    Cadastro(int tam){ // Apenas "cria" os 5 alunos
       cad = new Aluno[tam]; //tam = 5
       tamanho = tam; /* Para que o valor de tam possa ser usado
       no resto dessa classe */ 
       
       for(int i = 0; i < tam; i++){ 
           //Inicialização do cadastro com valor nulo
           cad[i] = null;
       }
    }
    
    
    public void inserirAluno(Aluno a){
       int i;
       
       for(i = 0; i < tamanho; i++){
           if(cad[i] == null){ 
               cad[i] = a; // Copia o cadastro feito em cad
               break;
           }
       }
    }
    
    public void removerAlunos(){
        int i = 0;
        
        for(i = 0; cad[i] != null; i++){   
            cad[i] = null;
        }
    }
   
    public void mostrarAlunos(){
        int i = 0;
        
        for(i = 0; cad[i] != null; i++){   
            cad[i].imprimir();
        }
    }    
    
    public Aluno colocar(Aluno a){
        IEntrada ent = new EntradaConsole();
        
        String nome = ent.lerNome();
        String ra = ent.lerRa();
        String rg = ent.lerRg();
        int idade = ent.lerIdade();
        int semestre = ent.lerSemestre();
        
        a = new Aluno(nome, idade, rg, ra, semestre);
        return a;
        
    }    
    
    
    
     
}
