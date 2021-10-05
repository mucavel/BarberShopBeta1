/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Visual.Entrar;
/**
 *
 * @author Salvador Carlos
 */
public class ControleAgenda {

    public boolean Bloquear() {
        Entrar entrar = new Entrar();
        entrar.setVisible(true);
        return true;
    }

    public void Sair() {
        System.exit(0);
    }
    
}
