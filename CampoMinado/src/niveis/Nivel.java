/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niveis;

import java.awt.Button;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author rodri
 */
public class Nivel {
    ArrayList<JButton> botoes;

    public Nivel() {
        this.botoes = new ArrayList<>();
    }

    public ArrayList<JButton> getBotoes() {
        return botoes;
    }

    public void setBotoes(ArrayList<JButton> botoes) {
        this.botoes = botoes;
    }
    
    public void addToList(JButton b){
        botoes.add(b);
    }
    
    
//    public static void main(String[] args){
//        ArrayList<Button> botaos = new Nivel().getBotoes();
//        
//        Button b1 = new Button();
//        Button b2 = new Button();
//        Button b3 = new Button();
//        Button b4 = new Button();
//        
//        
//        
//        botaos.add(b1);
//        
//        for(Button b : botaos){
//            
//            
//        }
//    }
    
    
}
