import java.util.ArrayList;
public class Biblioteca {
   private ArrayList<Livro> listaLivros;

   public Biblioteca(){
       listaLivros = new ArrayList<>();
   }
   public void adicionarLivro(Livro livro){
       listaLivros.add(livro);
       System.out.printf("O Livro %s foi adicionado a biblioteca!", livro.getTitulo());
   }
   public String buscarLivro(){
   }

}
