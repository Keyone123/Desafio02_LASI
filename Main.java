import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n------------------------------ Bem Vindo!!! ------------------------------");
        System.out.println("\nEscolha uma das opções abaixo: ");
        System.out.println("1.Criar uma TODO");
        System.out.println("2.Listar todas as TODOs criadas");
        System.out.println("3.Editar uma TODO");
        System.out.println("4.Marcar uma TODO como concluída");
        System.out.println("5.Excluir uma TODO");
        System.out.println("6.Detalhes de uma TODO");
        System.out.println("0.Sair do programa");
        System.out.println("\n--------------------------------------------------------------------------");
        op = input.nextInt();
        return op;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean igual = true;
        Function lista = new Function();
        while(igual){
            int op = menu();
            switch (op){
                case 1 ->{
                    String nome, categoria, descricao;
                    System.out.println("\nPor favor, digite o nome da sua TO-DO: ");
                    nome = input.nextLine();
                    System.out.println("\nPor favor, digite a categoria que está inserida a atividade: ");
                    System.out.println("Casa");
                    System.out.println("Trabalho");
                    System.out.println("Escola");
                    categoria = input.nextLine();
                    if(Objects.equals(categoria, "Casa") || Objects.equals(categoria, "Trabalho") || Objects.equals(categoria, "Escola")){
                        System.out.println("\nDigite uma descrição para sua TODO: ");
                        descricao = input.nextLine();
                        lista.adicionar(nome, categoria, descricao);
                    }
                    else{
                        System.out.println("\nA categoria escrita está incorreta");
                        return;
                    }

                }
                case 2 -> lista.imprimir();
                case 3 ->{
                    String pesquisa;
                    System.out.println("\nDigite o nome da TODO que deseja pesquisar: ");
                    pesquisa = input.nextLine();
                    lista.editar(pesquisa);

                }
                case 4 ->{
                    String pesquisa;
                    System.out.println("\nDigite a seguir, o nome da tarefa a ser pesquisada: ");
                    pesquisa = input.nextLine();
                    lista.concluir(pesquisa);
                }
                case 5 ->{
                    String pesquisa;
                    System.out.println("\nDigite a seguir, o nome da tarefa a ser pesquisada: ");
                    pesquisa = input.nextLine();
                    lista.excluir(pesquisa);
                }
                case 6 ->{
                    String pesquisa;
                    System.out.println("\nDigite a seguir, o nome da tarefa a ser pesquisada: ");
                    pesquisa = input.nextLine();
                    lista.detalhe(pesquisa);
                }
                case 0 -> igual = false;
            }
        }
    }
}
