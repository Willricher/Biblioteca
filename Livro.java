public class Livro {

    String titulo;
    String autor;
    String isbn;
    int quantidadeDisponivel;

    public Livro(String titulo, String autor, String isbn, int quandidadeDisponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeDisponivel = quandidadeDisponivel;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getquantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public void exibirInformacoes(){
        System.out.println("O título é " + titulo);
        System.out.println("O autor se chama" + autor);
        System.out.println("Essa merda é " + isbn);
        System.out.println("Quantia disponível: " + quantidadeDisponivel);
    }
    public boolean emprestarLivro() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            return true;
        }
        return false;
    }

        public void devolverLivro(){
        quantidadeDisponivel++;
            }
        }


