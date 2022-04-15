package Emprestimo_Livros;

public class Emprestimo {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Livro livro = new Livro();
		
		System.out.println("Livro: " + livro.livro + "\nAluno Responsável: " + pessoa.nome);
		System.out.println("\nLivro: " + livro.livro2 + "\nAluno Responsável: " + pessoa.nome2);

	}

}
