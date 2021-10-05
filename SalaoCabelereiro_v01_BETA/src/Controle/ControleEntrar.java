/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visual.Agenda;
import javax.swing.JOptionPane;

/**
 *
 * @author Salvador Carlos
 */
public class ControleEntrar {
    private String user;
    private String pass;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    
    
    //Metodo do botao Entrar
    public boolean Entrar(String user, String pass){
        setUser(user);
        setPass(pass);
        
        if(getUser().equals("Admin") && getPass().equals("ADMIN321")){
            Agenda entrar = new Agenda();
            entrar.setVisible(true);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Insira dados válidos.");
        }
        return false;
    }
    //Metodo do botao sair
    public void Sair(){
        System.exit(0);
    }
}
