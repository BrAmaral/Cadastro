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
 * Cadastro das disciplinas
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroDisciplinasG extends JFrame implements ActionListener
{
    private JLabel res;
    private JTextField nome;
    private JTextField sigla;
    private JTextField nota;
    private JButton cadastro;
    private JButton sair;
    //private JTextField tc;
    
    public String nomeDisciplina;
    public String siglaDisciplina;
    public double notaDisciplina;
    
    
    CadastroDisciplinasG (String titulo){
        super(titulo);
        setSize(450,200);
        setLocation(900,300);
        setNome(nomeDisciplina);
        setSigla(siglaDisciplina);
        setNota(notaDisciplina);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,2));
        
        
        cp.add(new JLabel("Nome", JLabel.LEFT));
        nome = new JTextField();
        nome.addActionListener(this);
        nome.setToolTipText("Nome da Disciplina");
        nome.setBackground(Color.WHITE);
        cp.add(nome);
        
        cp.add(new JLabel("Sigla", JLabel.LEFT));
        sigla = new JTextField();
        sigla.addActionListener(this);
        sigla.setToolTipText("Sigla da Disciplina");
        sigla.setBackground(Color.WHITE);
        cp.add(sigla);
        
        cp.add(new JLabel("Nota", JLabel.LEFT));
        nota = new JTextField();
        nota.addActionListener(this);
        nota.setToolTipText("Nota na Disciplina");
        nota.setBackground(Color.WHITE);
        cp.add(nota);
        
        cp.add(cadastro = new JButton("Cadastrar"));
        cadastro.addActionListener(this);
        cadastro.setToolTipText("Cadastra o Aluno");
        
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
            res.setText("Valor invalido!");
        }    
    }
    
    public String getNome(){
        return this.nomeDisciplina;
    }
    
    protected void setNome(String nomeAluno){
        this.nomeDisciplina = nomeAluno;
    }
    
    public double getNota(){
        return this.notaDisciplina;
    }
    
    protected void setNota(double notaDisciplina){
        this.notaDisciplina = notaDisciplina;
    }
    
    public String getSigla(){
        return this.siglaDisciplina;
    }
    
    protected void setSigla(String siglaDisciplina){
        this.siglaDisciplina = siglaDisciplina;
    }
    
    public void CloseFrame(){
        super.dispose();
    }
}
