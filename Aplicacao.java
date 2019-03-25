
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
    
    public static void main(String args[]){
        String a, c, d;
        int b=0, e=0, i, x = 0;
        
        //LerRa d = new LerRa();
        Cadastro cadAluno = new Cadastro(5);
        
        IEntrada ent = new EntradaConsole();
        
        //ent.lerDados();
        cadAluno.cad[x].nome = ent.lerNome();
        b = ent.lerIdade();
        c = ent.lerRg();
        d = ent.lerRa();
        e = ent.lerSemestre();
        
        

        for(i = 0; i < 5; i++){
            //alguma coisa = inserirAluno(cad[], i);
        }
        
        //switch case com os metodos de cadastro
    }
}
