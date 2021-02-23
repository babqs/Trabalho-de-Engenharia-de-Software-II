/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.Date;
import model.Aluno;
import model.Bibliotecario;
import model.Emprestimo;
import model.ItemEmprestimo;
import model.Livro;
import model.Titulo;

/**
 *
 * @author Uso Exclusivo
 */
public class Banco {

    public static ArrayList<Bibliotecario> bibliotecario;
    public static ArrayList<Aluno> aluno;
    public static ArrayList<Livro> livro;
//    public static ArrayList<Titulo> titulo;
    public static ArrayList<Emprestimo> emprestimo;
    public static ArrayList<ItemEmprestimo> item;


    public static void inicia(){

        //Instancia os Objetos
        bibliotecario = new ArrayList<>();
        aluno = new ArrayList<>();
        livro = new ArrayList<>();
        emprestimo = new ArrayList<>();

        //Integer id, String nome, String senha, String CPF, String dataNascimento, String CEP, String endereco
        Bibliotecario bibliotecario1 = new Bibliotecario(1, "adm", "1234", "02356478275", "18/02/1972", "86380000", "Avenida Major Barboza, 564");
        bibliotecario.add(bibliotecario1);
        
        //Integer RA, String nome, String CPF, String dataNascimento, String CEP, String endereco
        Aluno aluno1 = new Aluno(1, "Alan Santos", "30212126", "30/01/1995", "5142487", "Rua jaboti 35 Canudos NH");
        Aluno aluno2 = new Aluno(2, "Julia Maria", "30212127", "30/08/1994", "5142487745", "Rua campo bom 78 Centro NH");
        Aluno aluno3 = new Aluno(3, "Ricardo Silva", "30212128", "24/04/1997", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH");
        Aluno aluno4 = new Aluno(4, "Paulo Oliveira", "30212130", "20/08/1995", "2745487", "Rua Lombardi 40 Canudos NH");
        Aluno aluno5 = new Aluno(5, "Maria Alves", "30212131", "13/09/1992", "4742487", "Rua pedro quaresma 784 Canudos Belgica");
       
        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);
        aluno.add(aluno4);
        aluno.add(aluno5);
        
        //Integer codigo, String nome, boolean exemplarBiblioteca
       //Integer codigo, String nome, String isbn, Integer edicao, Integer ano, Integer prazo, boolean exemplarBiblioteca
        Livro livro1 = new Livro(1, "As Leis Fundamentais do Projeto de Software: a Ciência do Desenvolvimento", "231548", 5, 2014, 1);
        Livro livro2 = new Livro(2, "As Leis Fundamentais do Projeto de Software: a Ciência do Desenvolvimento", "231548", 5, 2014, 1);
        Livro livro3 = new Livro(10, "Introdução às Expressões Regulares", "231548", 3, 2011, 1);
        Livro livro4 = new Livro(13, "Padrões JavaScript", "231548", 1, 2012, 1);
        Livro livro5 = new Livro(1, "Programação Funcional Para Desenvolvedores Java", "231548", 11, 2018, 1);
        Livro livro6 = new Livro(22, "Programação Funcional Para Desenvolvedores Java", "231548", 11, 2018, 1);
        
        livro.add(livro1);
        livro.add(livro2);
        livro.add(livro3);
        livro.add(livro4);
        livro.add(livro5);
        livro.add(livro6);
        
        
        
        //int id, Aluno aluno, ArrayList<ItemEmprestimo> item, String dataEmprestimo
        Emprestimo emprestimo1 = new Emprestimo(1, aluno1, item, "22/02/2021 10:15");
        Emprestimo emprestimo2 = new Emprestimo(2, aluno5, item, "20/02/2021 10:20");
        Emprestimo emprestimo3 = new Emprestimo(3, aluno3, item, "14/02/2021 10:30");
        emprestimo.add(emprestimo1);
        emprestimo.add(emprestimo2);
        emprestimo.add(emprestimo3);

    }

}
