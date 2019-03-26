import java.util.Scanner;

/**
 * Realiza a entrada via console pela biblioteca scanner de java, recebendo os
 * valores de Nome, Idade, RG, RA e Semestre.
 * 
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * @version (número de versão ou data)
 */
public class EntradaConsole implements IEntrada
{
    Scanner scan = new Scanner( System.in );

    public String lerNome(){
        System.out.print("Forneca o nome do aluno:");
        return scan.next();
    }
    
    public int lerIdade(){
        System.out.print("Forneca a idade do aluno:");
        return scan.nextInt();
    }
    
    public String lerRg(){
       System.out.print("Forneca o RG do aluno:"); 
       return scan.next(); 
    }
    
    public String lerRa(){
        System.out.print("Forneca o RA do aluno:");
        return scan.next();
    }
    
    public int lerSemestre(){
        System.out.print("Forneca o semestre do aluno:");
        return scan.nextInt();
    }
    
    public int lerOp(){
        System.out.print("Opcao 1- Inserir\nOpcao 2- Mostrar lista\nOpcao 3- Remover alunos\nOpcao 4- Sair\n");
        System.out.print("\nForneca a opcao: ");
        return scan.nextInt();
    }  
    
    public void alunosDemais(){
        System.out.println("Impossível adicionar mais alunos");
    }
}
