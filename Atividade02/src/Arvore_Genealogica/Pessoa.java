package Arvore_Genealogica;

public class Pessoa {
	
	String nome;
	int idade;
	String pai;
	String mae;
	
		
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getPai() {
		return pai;
	}



	public void setPai(String pai) {
		this.pai = pai;
	}



	public String getMae() {
		return mae;
	}



	public void setMae(String mae) {
		this.mae = mae;
	}


	public void cadastrar (String nm,int id, String p, String m) {
		System.out.println("Nome: " + nm + "\nIdade: " + id + "\nNome do Pai: " + p + "\nNome da Mãe: " + m);
		
	}
	
	

}
