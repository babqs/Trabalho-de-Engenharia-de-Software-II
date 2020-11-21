/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] codigos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String aluno = JOptionPane.showInputDialog("RA do aluno");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número de livros a serem emprestados"));
        int aux;
        for (int i = 0; i < num; i++) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Código do livro"));
            //System.out.print("Digite o codigo do livro: " + (i + 1));
            codigos[i] = aux;
        }

        Controle c = new Controle();
        c.emprestar(aluno, codigos, num);

    }
}