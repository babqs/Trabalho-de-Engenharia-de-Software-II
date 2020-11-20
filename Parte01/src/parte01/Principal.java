package parte01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Emprestimo e = new Emprestimo();
                

		Livro l1 = new Livro(1);
		Livro l2 = new Livro(2);
		Livro l3 = new Livro(3);
                Livro l4 = new Livro(4);
                Livro l5 = new Livro(5);
                Livro l6 = new Livro(6);
                Livro l7 = new Livro(7);
                Livro l8 = new Livro(8);
                Livro l9 = new Livro(9);
                Livro l10 = new Livro(10);
                
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		Item i3 = new Item(l3);
                Item i4 = new Item(l4);
                Item i5 = new Item(l5);
                Item i6 = new Item(l6);
                Item i7 = new Item(l7);
                Item i8 = new Item(l8);
                Item i9 = new Item(l9);
                Item i10 = new Item(l10);
		
                
                e.i.add(i1);
		e.i.add(i2);
		e.i.add(i3);
                e.i.add(i4);
                e.i.add(i5);
                e.i.add(i6);
                e.i.add(i7);
                e.i.add(i8);
                e.i.add(i9);
                e.i.add(i10);
                
                
                

		System.out.println("Data de Empréstimo: " + e.getDataEmprestimo());
		System.out.println("\nData de Devolução: " + e.CalculaDataDevolucao());
                
                System.out.println("Data de devolvuao do livro 1:" + i1.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 2:" + i2.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 3:" + i3.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 4:" + i4.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 5:" + i5.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 6:" + i6.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 7:" + i7.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 8:" + i8.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 9:" + i9.calculaDataDevolucao(e.getDataEmprestimo()));
                System.out.println("Data de devolvuao do livro 10:" + i10.calculaDataDevolucao(e.getDataEmprestimo()));
                

	}

}
