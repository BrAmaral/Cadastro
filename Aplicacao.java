import java.util.Scanner;
/**
 * Classe Aplicação guarda os dados de entrada em variaveis
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 21.03.2019
 */
public class Aplicacao
{
    
    //public Aplicacao(){
       // super();  
    //}
    
    /*public static void main(String args[]){
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Cadastro cadAluno = new Cadastro(5);
        
        while(opcao > 4){
            System.out.println("Forneça a Opçao");
            System.out.println("1 - Inserir novo aluno");
            System.out.println("2 - Remover alunos");
            System.out.println("3 - Imprimir aluno");
            System.out.println("4- Sair");
            opcao = sc.nextInt();
        }
    }
    
    public static void menu(int op,Cadastro cadAluno){
        int i = 0 ;
        IEntrada ent = new EntradaConsole();
        Aluno a1 = null;
          
            switch(op){
                case 1 :
                    a1 = cadAluno.colocar(a1);
                    cadAluno.inserirAluno(a1); 
                    break;
                    
                 case 2 :
                    cadAluno.removerAlunos();
                    break;
                    
                 case 3 :
                   cadAluno.mostrarAluno();
                    break;
                    
                 case 4 :
                        System.exit(0);
            }            
    }    */
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Cadastro cadAluno = new Cadastro(5);
        for(int i = 0; i < 5; i++){
        IEntrada ent = new EntradaConsole();
        Aluno a1 = null;
        
        a1 = cadAluno.colocar(a1);
        cadAluno.inserirAluno(a1);
        }
        mostrarAluno();
    }
    
    //public static void aplicacao(Cadastro cadAluno){
    //    
    //}
    
    
}
