package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    private ArrayList<Aluno> alunos;
    private HashMap<String, Aluno> bancoDeDados;

    public App() {
        this.alunos = new ArrayList<>();
        this.bancoDeDados = new HashMap<>();

    }

    private int menu() {
        int opçao = 0;

        System.out.println("..::SIGAA 2::..");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar dados de um aluno");
        System.out.println("5 - Listar dados de todos os alunos");
        System.out.println("6 - Sair");

        Scanner teclado = new Scanner(System.in);
        opçao = teclado.nextInt();

        return opçao;
    }

    private boolean cadastrar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = teclado.nextLine();

        System.out.println("Digite a matrícula");
        String matricula = teclado.nextLine();

        System.out.println("Digite o curso");
        String curso = teclado.nextLine();

        System.out.println("Digite o telefone");
        String telefone = teclado.nextLine();

        System.out.println("Digite o e-mail");
        String email = teclado.nextLine();

        System.out.println("Digite a data de nascimento (dd/mm/aaaa)");
        String nascimentoString = teclado.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(nascimentoString, formato);

        Aluno a = new Aluno(nome, matricula, curso, telefone, email, data);

        if (!this.bancoDeDados.containsKey(matricula)) {
            this.bancoDeDados.put(matricula, a);
            return true;
        }
        return false;

        // return alunos.add(a);
    }

    private boolean editar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a matrícula que você deseja editar");
        String matricula = teclado.nextLine();
        Aluno a = bancoDeDados.get(matricula);
        return false;
    }

    private void excluir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a matrícula do aluno que você deseja remover");
        String matricula = teclado.nextLine();
        
        if(bancoDeDados.remove(matricula) == null) {
            System.out.println("Matrícula não existente");
        } else {System.out.println("Removido com sucesso!");}
        


    }

    private void listarDados() {

    }

    private void listarTodos() {
        System.out.println(this.alunos);
    }

    public static void main(String[] args) {
        
        App app = new App();

        int opçao = 0;

        do {
            opçao = app.menu();

            switch (opçao) {
                case 1 -> app.cadastrar();
                case 2 -> app.editar();
                case 3 -> app.excluir();
                case 4 -> app.listarDados();
                case 5 -> app.listarTodos();
                case 6 -> System.out.println("Saindo...");  
                default -> System.out.println("Opção inválida");
                }
        } while (opçao != 6);

    }
}
