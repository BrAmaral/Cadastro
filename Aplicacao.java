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
        Disciplina disc = new Disciplina("Algoritmos", "DA", 8);
        //Criacao de objetos
        EntradaConsole entMenu = new EntradaConsole();
        Scanner sc = new Scanner(System.in);
        Cadastro cadAluno = new Cadastro();
        
        disc.setNomeDisciplina("Algoritmos");
        disc.setSiglaDisciplina("DA");
        disc.setNota(8);
        
        Disciplina disci[] = null;
        
        disc.setNomeDisciplina("Algoritmos");
        disc.setSiglaDisciplina("DA");
        disc.setNota(8);
        
        Aluno a2 = null;
        Aluno a1 = null;
       
        while(!saida){
            
            opcoes = entMenu.lerOp(); // Opcoes do menu
            
            switch(opcoes){
                case 1: // Criar alunos
                    if(qtdAlunos < 5){
                        IEntrada ent = new EntradaConsole();
                        //Aluno a1 = null;
        
                        a1 = new Aluno("Ana", 19, "P15", "RA017", 2, disci); // Cria o conteúdo de Aluno e aloca na variável a1
                        cadAluno.inserirAluno(a1); // Preenche os conteúdos de Aluno
                    } else if(qtdAlunos >= 5){
                        entMenu.alunosDemais();
                    }
                    break;
                
                case 2: // Imprimir alunos
                    //cadAluno.mostrarAlunos();
                    //imprimir();
                    cadAluno.imprimir();
                    break;
                    
                case 3: // Remover alunos
                    try{
                    //cadAluno.removerAlunos();
                    cadAluno.removerAluno(a1.ra);
                    }catch(Exception e){
                        break;
                    }
                    break;
                    
                case 4: // Fechar o programa
                    saida = true;
                    break;
            }
        }
    }
    
    
    
}
