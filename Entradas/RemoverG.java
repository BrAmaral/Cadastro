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
public class RemoverG extends JFrame implements ActionListener
{
    private JLabel res;
    private JTextField ra;
    private JButton remover;
    private JButton sair;
    //private JTextField tc;
    
    public String RA;
    
    
    RemoverG (String titulo){
        super(titulo);
        setSize(270,100);
        setLocation(900,300);
        setRa(RA);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));
        
        
        cp.add(new JLabel("RA", JLabel.CENTER));
        ra = new JTextField();
        ra.addActionListener(this);
        ra.setToolTipText("RA do Aluno");
        ra.setBackground(Color.WHITE);
        cp.add(ra);
        
        cp.add(remover = new JButton("Remover"));
        remover.addActionListener(this);
        remover.setToolTipText("Remover o Aluno pelo RA");
        
        cp.add(sair = new JButton("Sair"));
        sair.addActionListener(this);
        sair.setToolTipText("Sai da Remocao");

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
    
    public String getRa(){
        return this.RA;
    }
    
    protected void setRa(String RA){
        this.RA = RA;
    }
    
    public void CloseFrame(){
        super.dispose();
    }
}
