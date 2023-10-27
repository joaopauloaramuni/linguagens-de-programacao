package prova;

import java.util.Random;

public class Questao6 {
    private static Random g = new Random();
    private int y=0;
    private int z=1;

    public Questao6(int w){
        y = w;
    }
    public int r(){
        z = g.nextInt(y) + 1;
        System.out.println("valor de z: " + z);
        return z;
    }
    public int s(){
        return y;
    }

    public static void main(String[] args) {
        Questao6 k = new Questao6(6);
        // k (y = 6)
        Questao6 m = k;
        Questao6 n = new Questao6(3);
        // n (y = 3)
        int  p;
        p = k.r()+m.s()+n.r();
        // k.r() no minimo 1 no maximo 6
        // m.s() 6
        // n.r() no minimo 1 no maximo 3
        System.out.println(p);
    }
}
