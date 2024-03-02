package program;

import java.util.Scanner;

import entities.Cliente;
import entities.Funcionario;
import util.Functions;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = LocalDateTime.now().getHour();
        String nome = "";

        List<Cliente> clientes = new ArrayList<>();
        List<Funcionario> funcionario = new ArrayList<>();

        Funcionario func = new Funcionario("Raul", "raulsoares1409@gmail.com", 4523, 8059);
        Funcionario func2 = new Funcionario("Kauã", "kauakruger34@outlook.com", 5387, 2181);
        funcionario.add(func);
        funcionario.add(func2);

        /* Adicionando alguns clientes para testes: */
        Cliente cliente1= new Cliente(1234, "Arthur", "Dobby", "Cachorro", "Poodle");
        Cliente cliente2 = new Cliente(4321, "Maria", "Jhey", "Gato", null);
        Cliente cliente3 = new Cliente(34560, "Jhonny", "Luke", "Cachorro", "Pincher");
        Cliente cliente4 = new Cliente(6587, "Gaby", "Barbie", "Cachorro", "Golden Retriver");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        System.out.println("============================");
        System.out.println("Entrar com ID: Digite [1]");
        System.out.println("Entrar com Email: Digite [2]");
        System.out.println("============================");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println();
                System.out.print("Digite seu ID: ");
                int id = sc.nextInt();
                boolean foundId = false;

                for (int i=0; i<funcionario.size(); i++) {
                    if (id == funcionario.get(i).getId()) {
                        System.out.print("Digite sua senha: ");
                        int senha = sc.nextInt();

                        if (senha == funcionario.get(i).getPassword()) {
                            nome = funcionario.get(i).getName();
                            foundId = true;
                            break;
                        } else {
                            System.out.println("Senha incorreta!");
                            break;
                        }
                        
                    }
                }

                if (!foundId) {
                    System.out.println("O ID informado não pertence a nenhum funcionário cadastrado!");
                }
                break;

            case 2:
                sc.nextLine();
                System.out.println();
                System.out.print("Digite seu Email: ");
                String email = sc.nextLine();
                boolean foundEmail = false;

                for (int i=0; i<funcionario.size(); i++) {
                    if (email.equals(funcionario.get(i).getEmail())) {
                        System.out.print("Digite sua senha: ");
                        int senha = sc.nextInt();
                        
                        if (senha == funcionario.get(i).getPassword()) {
                            nome = funcionario.get(i).getName();
                            foundEmail = true;
                            break;
                        } else {
                            System.out.println("Senha incorreta!");
                        }
                    } 
                }

                if (!foundEmail) {
                    System.out.println("O Email informado não pertence a nenhum funcionário cadastrado!");
                }
                break;
            default:
                break;
        }
        System.out.println();
        System.out.println(Functions.mensHora(hora, nome));

        System.out.println("Informe qual serviço abaixo será realizado:");
        System.out.println("Banho [1]");
        System.out.println("Tosa [2]");
        System.out.println("Consulta [3]");
        System.out.println("Passeio [4]");
        System.out.print("Escolha: ");
        int choiceServico = sc.nextInt();

        Functions function = new Functions();

        switch (choiceServico) {
            case 1:
                function.increaseValue(50.0);
                System.out.println("Serviço agendado: Banho");
                break;
            case 2:
                function.increaseValue(30.0);
                System.out.println("Serviço agendado: Tosa");
                break;
            case 3:
                function.increaseValue(100);
                System.out.println("Serviço agendado: Consulta");
                break;
            case 4:
                function.increaseValue(20.0);
                System.out.println("Serviço agendado: Passeio");
                break;
            default:
                System.out.println("A opção não corresponde a nenhum serviço!");
                break;
        }
        System.out.println();
        System.out.println("Valor em caixa: " + function.getAccount());

        sc.close();
        }
}