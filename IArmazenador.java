
/**
 * Armazena as informacoes dos alunos registrados e mCadastro
 * 
 * @ Breno Amaral, Gabrielle Silva & Victor Bulhões
 * 02.03.2019
 */

public interface IArmazenador
{
    public boolean inserirAluno(Aluno a);
    public boolean removerAluno(String ra);
    public void imprimir();
}