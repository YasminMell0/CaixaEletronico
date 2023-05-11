package view;
import javax.swing.JOptionPane;
import controller.ControllerCliente;
import model.bean.Cliente;

public class ManterCliente { 
	Cliente[] clientes = new Cliente[50];
	int itau = 0; int santander = 0; int bradesco = 0; int hsbc = 0; int indice = 0; int contadorSaque = 0; 
	int sitau = 0; int ssantander = 0; int sbradesco = 0; int shsbc = 0; 
	
	public void cadastrar() {
		String nome = JOptionPane.showInputDialog("Insira o nome do cliente:");
		int rg = Integer.parseInt(JOptionPane.showInputDialog("Insira o RG:"));
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF:"));
		String endereco = JOptionPane.showInputDialog("Insira o endereco:");
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Insira o telefone:"));
		int banco = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo relacionado ao banco:" 
																+ "\n1 -Itau"
																+ "\n2 -Santander"
																+ "\n3 -Bradesco"
																+ "\n4-HSBC"));
		int conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da conta:"));
		String senha = JOptionPane.showInputDialog("Insira a senha:");
		int saldo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Saldo:"));

		Cliente ncliente = new Cliente(nome, rg, cpf, endereco, telefone, banco, conta, senha, saldo);
		ControllerCliente contcli = new ControllerCliente();
		Cliente saidacli = contcli.cadastrar(ncliente);
		clientes[indice] = ncliente;
		JOptionPane.showMessageDialog(null, saidacli);

		for(int x = 0; x < clientes.length; x++) {
			if(clientes[x] != null) {
				System.out.println(clientes[x] + "\n");
	}}indice++;}
	
	public void consultar() {	
		String n = JOptionPane.showInputDialog("Insira o Nome:"); boolean e = false;
		for(int x = 0; x < clientes.length; x++) {
			if(clientes[x] != null) {
				if (clientes[x].getNome().equals(n)) { e = true;
					ControllerCliente contcli = new ControllerCliente();
					Cliente saidacli = contcli.cadastrar(clientes[x]);
					JOptionPane.showInternalMessageDialog(null, saidacli);
		}}}if (e == false) {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado");
	}}
	
	public void verificarSaldo() {
		String s = JOptionPane.showInputDialog("Digite a senha:");
		boolean r = true;  boolean se = false;
		for(int x = 0; x < clientes.length; x++) {
			if(clientes[x] != null) {
				if (clientes[x].getSenha().equals(s)) {
					JOptionPane.showMessageDialog(null, "Bem vindo!");
					se = true; ManterCaixa c = new ManterCaixa();
					int saque = Integer.parseInt(JOptionPane.showInputDialog("Valor do Saque:"));
					if (clientes[x].getSaldo() >= saque) {
						c.sacar(saque); int nsaldo = clientes[x].getSaldo() - saque;
						clientes[x].setSaldo(nsaldo); contadorSaque++;
						
						if(clientes[x].getBanco() == 1) {
							sitau = sitau + saque; itau++;
						}else if(clientes[x].getBanco() == 2) {
							ssantander = ssantander + saque; santander++;
						}else if(clientes[x].getBanco() == 3) {
							sbradesco = sbradesco + saque; bradesco++;
						}else if(clientes[x].getBanco() == 4) {
							shsbc = shsbc + saque; hsbc++;
					}}else {r = false;}
					JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + clientes[x].getSaldo());
		}}}if(r == false) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}if(se == false) {
			JOptionPane.showMessageDialog(null, "Senha Incorreta");
	}}
	
	public void estatistica() {
		if(itau > santander && itau > bradesco && itau > hsbc) {
			JOptionPane.showMessageDialog(null, "O Itau foi o banco de maior saque");
		}else if(santander > itau && santander > bradesco && santander > hsbc) {
			JOptionPane.showMessageDialog(null, "O Santander foi o banco de maior saque");
		}else if(bradesco > itau && bradesco > santander && bradesco > hsbc) {
			JOptionPane.showMessageDialog(null, "O Bradesco foi o banco de maior saque");
		}else if(hsbc > itau && hsbc > santander && hsbc > bradesco) {
			JOptionPane.showMessageDialog(null, "O HSBC foi o banco de maior saque");
		}else {
			JOptionPane.showMessageDialog(null, "Mais de um banco teve o maior saque");
		}
		
		if(itau < santander && itau < bradesco && itau < hsbc) {
			JOptionPane.showMessageDialog(null, "O Itau foi o banco de menor saque");
		}else if(santander < itau && santander < bradesco && santander < hsbc) {
			JOptionPane.showMessageDialog(null, "O Santander foi o banco de menor saque");
		}else if(bradesco < itau && bradesco < santander && bradesco < hsbc) {
			JOptionPane.showMessageDialog(null, "O Bradesco foi o banco de menor saque");
		}else if(hsbc < itau && hsbc < santander && hsbc < bradesco) {
			JOptionPane.showMessageDialog(null, "O HSBC foi o banco de menor saque");
		}else {
			JOptionPane.showMessageDialog(null, "Mais de um banco teve o menor saque");
		}
		int total = sitau + ssantander + sbradesco + shsbc;
		JOptionPane.showMessageDialog(null, "O total de dinheiro sacado do itau foi: "+sitau+
											"\nO total de dinheiro sacado do santander foi: "+ssantander+
											"\nO total de dinheiro sacado do bradesco foi: "+sbradesco+
											"\nO total de dinheiro sacado do HSBC foi: "+shsbc);
		
		JOptionPane.showMessageDialog(null, "A quantidade de saques foi: "+contadorSaque+"\nO total de dinheiro foi: "+total);
	}}