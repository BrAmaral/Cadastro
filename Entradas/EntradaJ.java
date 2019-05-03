package Entradas;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 * Classe de teste
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class EntradaJ extends JFrame implements ActionListener
{
    private JLabel res;
    private JButton inserir;
    private JButton mostrar;
    private JButton remover;
    private JButton sair;
    private JTextField tc;
    
    public EntradaJ(String titulo)
    {
        super(titulo);
        setSize(350,100);
        setLocation(900,300);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(5,3));
        
        cp.add(new JLabel("Forneca opcao:", JLabel.LEFT));
        tc = new JTextField();
        tc.addActionListener(this);
        tc.setToolTipText("Opcao");
        tc.setBackground(Color.WHITE);
        cp.add(tc);
        
        cp.add(mostrar = new JButton("Inserir"));
        mostrar.addActionListener(this);
        //inserir.setToolTipText("Insere aluno no Cadastro"); 
        
        cp.add(mostrar = new JButton("Mostrar"));
        mostrar.addActionListener(this);
        //mostrar.setToolTipText("Mostra os alunos do Cadastro");
        
        cp.add(remover = new JButton("Remover"));
        remover.addActionListener(this);
        //remover.setToolTipText("Remove aluno no Cadastro");
        
        cp.add(sair = new JButton("Sair"));
        sair.addActionListener(this);
        //sair.setToolTipText("Sai do Cadastro");
    }

    public void actionPerformed(ActionEvent ae){
        try{
            
        }catch(Exception e){
            
        }    
    }
}
