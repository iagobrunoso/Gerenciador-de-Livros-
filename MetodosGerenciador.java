import java.util.ArrayList;
import java.util.Scanner;

public class MetodosGerenciador {

    public static void adicionar(Scanner sc, ArrayList<String> livros, ArrayList<String> autor){

        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autoria = sc.nextLine();

        livros.add(titulo);
        autor.add(autoria);

        System.out.println("Livro adicionado com sucesso!");


    }

    public static void pesquisar(Scanner sc, ArrayList<String> livros, ArrayList<String> autor){
        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();
        for(int i=0; i < livros.size(); i++){
            if(livros.get(i).equalsIgnoreCase(titulo)){;
            System.out.println("Título do livro: " + livros.get(i));
            System.out.println("Autor do livro: " + autor.get(i));
                return;
            }

        }
        System.out.println("Livro não encontrado.");
    }

    public static void excluir(Scanner sc, ArrayList<String> livros, ArrayList<String> autor){
        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();
        for(int i=0; i < livros.size(); i++){
            if(livros.get(i).equalsIgnoreCase(titulo)){;
            System.out.println("Título do livro: " + livros.get(i));
            System.out.println("Autor do livro: " + autor.get(i));
            livros.remove(i);
            autor.remove(i);
            System.out.println("Livro removido com sucesso");
                return;
            }


        }
        System.out.println("Livro não encontrado");
    }

    public static void listar(ArrayList<String> livros, ArrayList<String> autor){
        for(int i=0; i < livros.size(); i++){
            System.out.println("Título do livro: " + livros.get(i));
            System.out.println("Autor do livro: " + autor.get(i));
            System.out.println("_____________________________");
        }
        System.out.println("Nenhum livro foi cadastrado!");
    }


}
