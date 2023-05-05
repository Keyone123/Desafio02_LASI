import java.util.Objects;
import java.util.Scanner;

public class Function {
    TODO inicio;
    TODO ultimo;
    static int tamanho;
    public void adicionar(String nome, String categoria, String descricao){
        TODO celula = new TODO(nome, categoria, descricao);
        if(tamanho == 0)
            this.inicio = celula;
        else
            this.ultimo.setProx(celula);
        this.ultimo = celula;
        tamanho++;
    }
    public void imprimir(){
        TODO atual = this.inicio;
        if(tamanho == 0)
            System.out.println("Não há elementos na lista\n");
        while(atual != null){
            System.out.print(atual.getNome() + " - Status: ");
            if(atual.getProgresso())
                System.out.println("Concluída");
            else
                System.out.println("Em andamento");

            atual = atual.getProx();
        }
    }
    public void editar(String pesquisa){
       Scanner input = new Scanner(System.in);
       TODO atual = this.inicio;
       int escolha;
       String novo;
       while(atual != null){
           if(Objects.equals(atual.nome, pesquisa)){
               System.out.println("\nTODO encontrada!!!");
               System.out.println("Escolha qual das alternativas deseja alterar dentro da TODO: ");
               System.out.println("1.Título da TODO");
               System.out.println("2.Categoria da TODO");
               System.out.println("3.Descrição da TODO");
               escolha = input.nextInt();
               System.out.print("Digite para substituir: ");
               novo = input.nextLine();
               if(escolha == 1)
                   atual.nome = novo;
               else if(escolha == 2)
                   atual.categoria = novo;
               else if(escolha == 3)
                   atual.descricao = novo;
               else
                   System.out.println("\nO número que voce digitou não está dentro do escopo de escolhas");
           }
           atual = atual.prox;
       }
       System.out.println("\nTODO não pode ser encontrada");
    }
    public void concluir(String pesquisa){
        TODO atual = this.inicio;
        while(atual != null){
            if(Objects.equals(atual.nome, pesquisa)){
                if(atual.getProgresso()) {
                    System.out.println("\nEssa tarefa já está marcada como concluída");
                }else {
                    atual.setProgresso(true);
                    System.out.println("\nTarefa concluída com sucesso");
                    break;
                }
            }
            atual = atual.prox;
        }
    }
    public void excluir(String pesquisa) {
        TODO aux = null;
        TODO atual = this.inicio;
        while (atual != null && !Objects.equals(atual.nome, pesquisa)) {
            aux = atual;
            atual = atual.prox;
        }
        if (Objects.equals(atual.nome, pesquisa)) {
            if (aux != null)
                aux.prox = atual.prox;
            else
                this.inicio = atual.prox;
        }
        atual.prox = null;
    }
    public void detalhe(String pesquisa){
        TODO atual = this.inicio;
        while(atual != null){
            if(Objects.equals(atual.nome, pesquisa)){
                System.out.println("\nNome encontrado com sucesso!!!!");
                System.out.println("Detalhes da sua TODO:");
                System.out.println("Nome: " + atual.nome);
                System.out.println("Categoria: " + atual.categoria);
                System.out.println("Descrição: " + atual.descricao);
            }
            atual = atual.prox;
        }
    }
}
