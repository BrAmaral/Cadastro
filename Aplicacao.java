import java.util.Scanner;
/**
 * Classe Aplicação guarda os dados de entrada em variaveis
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 21.03.2019
 */
public class Aplicacao
{
    
    public static void main(String args[]){
        boolean saida = false;
        int opcoes = 0;
        int qtdAlunos = 0;
        
        //Criacao de objetos
        EntradaConsole entMenu = new EntradaConsole();
        Scanner sc = new Scanner(System.in);
        Cadastro cadAluno = new Cadastro(5);
        
        while(!saida){
            
            opcoes = entMenu.lerOp(); // Opcoes do menu
            
            switch(opcoes){
                case 1: // Criar alunos
                    if(qtdAlunos < 5){
                        IEntrada ent = new EntradaConsole();
                        Aluno a1 = null;
        
                        a1 = cadAluno.colocar(a1); // Cria o conteúdo de Aluno e aloca na variável a1
                        cadAluno.inserirAluno(a1); // Preenche os conteúdos de Aluno
                    } else if(qtdAlunos >= 5){
                        entMenu.alunosDemais();
                    }
                    break;
                
                case 2: // Imprimir alunos
                    cadAluno.mostrarAlunos();
                    break;
                    
                case 3: // Remover alunos
                    cadAluno.removerAlunos();
                    break;
                    
                case 4: // Fechar o programa
                    saida = true;
                    break;
            }
        }
    }
    
    
    
}
