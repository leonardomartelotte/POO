package com.poo.view;

import java.util.Scanner;
import com.poo.controller.AlunoController;
import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoView {
    public void Create() {
        try {
            String nome, matricula;
            Scanner scanner1 = new Scanner(System.in);
            Aluno aluno1 = new Aluno();
            System.out.println("Informe o nome: ");
            nome = scanner1.nextLine();
            System.out.println("Informe a matricula: ");
            matricula = scanner1.next();
            aluno1.setMatricula(matricula);
            aluno1.setNome(nome);
            AlunoController ac = new AlunoController();
            ac.Create(aluno1);
        } catch (Exception e) {
            System.out.println("Erro ao incluir aluno.");
        }
    }

    public void ReadAll() {
        AlunoController ac = new AlunoController();
        for (Aluno a : ac.ReadAll()) {
            System.out.println("Matricula: " + a.getMatricula());
            System.out.println("Nome: " + a.getNome());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        AlunoView aluno1 = new AlunoView();
        aluno1.ReadAll();
    }
}
