package po.leit;

import javax.swing.*;
import java.util.Scanner;
public class Prog2 {

        public static void main(String[] args) {

            Aluno aluno1 = new Aluno(6162126, "Philipe","LEIT",2,17);

            MaquinaContar contador;
            contador = new MaquinaContar();
            contador.contar();
            System.out.println(contador.mostrar());

            Veiculo carro = new Veiculo(5, "automovel","CVB 2023");




            String[] nomes = new String[20];
            double[] notas = new double[20];

            int qtNomes = lerNomes(nomes);
            int qNotsa = lerNotas(notas,12);

            mostrarNotas(notas);

        }

    private static void mostrarNotas(double[] notas) {
            int c;
            for (c=0; c < notas.length; c++)
                System.out.println(notas[c]);
    }

    private static int lerNotas(double[] aNotas, int numeroNotas ) {

        String input = JOptionPane.showInputDialog("Digite notas :");
        Scanner numerosLidos = new Scanner(input);
        int i=0;
        while (numerosLidos.hasNextDouble()) {
            aNotas[i++] = numerosLidos.nextDouble();
        }
        return i;
    }
    private static int lerNotas(double[] aNotas) {
        int i=0;
        do {
            String input = JOptionPane.showInputDialog("Nota :");
            if (input.length() > 0)
                aNotas[i++] = Double.parseDouble(input);
            else
                break;
        } while (true);
        JOptionPane.showMessageDialog(null,"Fim leitura notas");
        return i;
    }

    private static int lerNomes(String[] aNomes) {
        int i=0;
        do {
            String input = JOptionPane.showInputDialog("Nome :");
            if (input.length() > 0)
                aNomes[i++] = input;
            else
                break;
        } while (true);
        JOptionPane.showMessageDialog(null,"Fim leitura nomes");
        return i;
    }

}
