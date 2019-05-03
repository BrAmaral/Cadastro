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
 * Cadastro do aluno
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroG extends JFrame implements ActionListener
{
    private JLabel res;
    private JTextField nome;
    private JTextField idade;
    private JTextField rg;
    private JTextField ra;
    private JButton cadastro;
    private JButton sair;
    
    CadastroDisciplinasG dis = new CadastroDisciplinasG("Cadastro de Disciplina");
    
    public String nomeAluno;
    public int idadeAluno;
    public String rgAluno;
    public String raAluno;
    
    
    CadastroG (String titulo){
        super(titulo);
        setSize(450,200);
        setLocation(900,300);
        setNome(nomeAluno);
        setIdade(idadeAluno);
        setRg(rgAluno);
        setRa(raAluno);
        
        Container cp = getContentPane();
        //cp.setLayout(new GridLayout(5,3));
        cp.setLayout(new GridLayout(5,2));
        
        
        cp.add(new JLabel("Nome", JLabel.LEFT));
        nome = new JTextField();
        nome.addActionListener(this);
        nome.setToolTipText("Nome do Aluno");
        nome.setBackground(Color.WHITE);
        cp.add(nome);
        
        cp.add(new JLabel("Idade", JLabel.LEFT));
        idade = new JTextField();
        idade.addActionListener(this);
        idade.setToolTipText("Idade do Aluno");
        idade.setBackground(Color.WHITE);
        cp.add(idade);
        
        cp.add(new JLabel("RG", JLabel.LEFT));
        rg = new JTextField();
        rg.addActionListener(this);
        rg.setToolTipText("RG do Aluno");
        rg.setBackground(Color.WHITE);
        cp.add(rg);
        
        cp.add(new JLabel("RA", JLabel.LEFT));
        ra = new JTextField();
        ra.addActionListener(this);
        ra.setToolTipText("RA do Aluno");
        ra.setBackground(Color.WHITE);
        cp.add(ra);
        
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
        
        if("Cadastrar".equals(ae.getActionCommand())){
            dis.setVisible(true);
            dis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    
    
    public String getNome(){
        return this.nomeAluno;
    }
    
    protected void setNome(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    public int getIdade(){
        return this.idadeAluno;
    }
    
    protected void setIdade(int idadeAluno){
        this.idadeAluno = idadeAluno;
    }
    
    public String getRg(){
        return this.rgAluno;
    }
    
    protected void setRg(String rgAluno){
        this.rgAluno = rgAluno;
    }
    
    public String getRa(){
        return this.raAluno;
    }
    
    protected void setRa(String raAluno){
        this.raAluno = raAluno;
    }
    
    public void CloseFrame(){
        super.dispose();
    }
}
