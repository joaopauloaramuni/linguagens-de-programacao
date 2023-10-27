package prova;

import javax.swing.*;

public class Questao5 {

    public Questao5(){

    }

    public Questao5(int x, int y){

    }

    public static void main(String[] args) {
        A a = new A();
        JOptionPane.showMessageDialog(null, a.getS());
        //getS retorna S e não R (III incorreto)
    }
}
