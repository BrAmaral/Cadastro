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
 * Entrada inicial da GUI
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class EntradaG extends JFrame implements ActionListener
{
    private JLabel res;
    private JButton inserir;
    private JButton mostrar;
    private JButton remover;
    private JButton sair;
    //private JTextField tc;
    
    /*private JTextField nome;
    private JTextField idade;
    private JTextField rg;
    private JTextField ra;
    private JButton cadastro;
    private JButton sair;
    private JTextField tc;*/
    
    public String nomeAluno;
    public int idadeAluno;
    public String rgAluno;
    public String raAluno;
    
    
    EntradaG (String titulo){
        super(titulo);
        setSize(450,200);
        setLocation(900,300);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(5,3));
        
        // Versão Gabiii
        
        cp.add(inserir = new JButton("Inserir"));
        inserir.addActionListener(this);
        inserir.setToolTipText("Insere aluno no Cadastro"); 
        
        cp.add(mostrar = new JButton("Mostrar"));
        mostrar.addActionListener(this);
        mostrar.setToolTipText("Mostra os alunos do Cadastro");
        
        cp.add(remover = new JButton("Remover"));
        remover.addActionListener(this);
        remover.setToolTipText("Remove aluno no Cadastro");
        
        cp.add(sair = new JButton("Sair"));
        sair.addActionListener(this);
        sair.setToolTipText("Sai do Cadastro");

    }  
    
    public void actionPerformed(ActionEvent ae){
        try{
            System.out.println(ae.getActionCommand());
             if(ae.getActionCommand().equals("Sair")){
                
               System.exit(0);
            }    
            //double t = (9./5.)*Double.parseDouble(tc.getText())+32.;
            //res.setText(t+" F");
        }catch(Exception e){
            //res.setText("Valor invalido!");
        }    
    }
    
    
}
