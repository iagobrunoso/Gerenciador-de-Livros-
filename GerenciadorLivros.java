import java.util.ArrayList;
import java.util.Scanner;


public class GerenciadorLivros {
    public static void main(String[] args) {

        // Iniciando com mensagem de boas-vindas

        Scanner sc = new Scanner(System. in);
        System.out.print("Pra começarmos, digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ". Seja bem-vindo ao seu Gerenciador de livros");
        int opcao;


        ArrayList<String> livros = new ArrayList<String>();
        ArrayList<String> autor = new ArrayList<String>();

        do{

            // Apresentando o Menu e pedindo a escolha do usuário

            System.out.println("1 - Adicionar Novo Livro");
            System.out.println("2 - Pesquisar Livro por Título");
            System.out.println("3 - Excluir Livro pelo Título");
            System.out.println("4 - Listar Todos os Livros");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch(opcao){

                case 1:
                    MetodosGerenciador.adicionar(sc, livros, autor);
                    break;
                case 2:
                    MetodosGerenciador.pesquisar(sc, livros, autor);
                    break;
                case 3:
                    MetodosGerenciador.excluir(sc, livros, autor);
                    break;
                case 4:
                    MetodosGerenciador.listar(livros, autor);
                    break;
                case 5:
                    System.out.println("Tchau Tchau! Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção Inválida! ");

            }

        }while(opcao != 5);



        }
    }
