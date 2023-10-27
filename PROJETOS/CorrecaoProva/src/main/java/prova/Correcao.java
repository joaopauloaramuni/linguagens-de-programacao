package prova;
import javax.swing.JOptionPane;

public class Correcao {
    public static void main(String[] args) {
        //questao2();
        //questao4();
        questao7();
    }

    private static void questao2() {
        System.out.println("Questão 2");
        int a=0, b=1, c=2, d=4;
        boolean x, y, z;
        x = (a * c + 2 != d) && !(d / c >= c);
        // x = (0 * 2 + 2 != 4) && !(4 / 2 >= 2)
        // x = (2 != 4) && !(2 >= 2)
        // x = (verdadeiro) && !(verdadeiro)
        // x = v && f
        // x = falso
        y = !x || false;
        // y = verdadeiro || falso
        // y = verdadeiro
        z = y && !x || d/a != b;
        // z = verdadeiro && verdadeiro || 4/0 != 1
        // z = verdadeiro && verdadeiro || verdadeiro
        // z = verdadeiro || verdadeiro = verdadeiro
        System.out.println("x, y e z: " + x + " " + y + " " + z);
    }
    private static void questao4() {
        System.out.println("Questão 4");
        int r = 1, s, x = 0;
        s = Integer.parseInt(JOptionPane.showInputDialog(
                null, "S"));
        for (int i = 0; i <= 2; i++){
            x = ++r + r++ + i;
            System.out.println("r: " + r);
            System.out.println("x: " + x);
            // Primeiro loop: 2 + 2 + 0 (x = 4)
            // Segundo loop: 4 + 4 + 1 (x = 9)
            // Terceiro loop: 6 + 6 + 2 (x = 14)
        }
        JOptionPane.showMessageDialog(null,
                        "Resultado: " + x);
    }
    private static void questao7() {
        System.out.println("Questão 7");
        int cont = 0;

        //for (int i=0; i>=0; i+=2, cont++);

        //System.out.println("cont: " + cont);
        /*
         * O valor impresso é "cont: 1073741824" porque 1073741824 é o resultado de dividir o valor máximo possível para um int (que é 2147483647) por 2.
         * Este é um resultado do comportamento do overflow de inteiros em Java.
         * O loop está sendo executado tantas vezes que o contador cont ultrapassa o valor máximo possível para um int, causando um overflow.
         * Quando um int atinge o valor máximo e é incrementado, ele "volta" para o valor mínimo possível (um conceito conhecido como overflow).
         * Esse padrão de comportamento faz com que cont atinja 1073741824 após tantas iterações do loop.
         * */
    }
}