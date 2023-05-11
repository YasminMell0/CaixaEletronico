package model.bean;

public class Cliente {
	private String nome;
	private int rg;
	private int cpf;
	private String endereco;
	private int telefone;
	private int banco;
	private int conta;
	private String senha;
	private int saldo;

	public Cliente(String nome, int rg, int cpf, String endereco, int telefone, int banco, int conta, String senha, int saldo) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.banco = banco;
		this.conta = conta;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	public Cliente() {

	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getBanco() {
		return banco;
	}
	
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente \nnome= " + nome + "\nrg= " + rg + "\ncpf= " + cpf + "\nendereco= " + endereco + "\ntelefone= "
				+ telefone + "\nbanco= " + banco + "\nconta= " + conta + "\nsenha= " + senha + "\nsaldo= " + saldo;
	}
}