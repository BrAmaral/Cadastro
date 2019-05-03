package Entradas;
import javax.swing.JFrame;
import Alunos.Aluno;

public class testeG
{
    Aluno teste = new Aluno();
    public static void main(String[] args) {
        RemoverG cv = new RemoverG("Cadatro de Alunos");
        cv.setVisible(true);
        cv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
