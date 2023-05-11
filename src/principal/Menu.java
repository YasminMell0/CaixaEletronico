package principal;
import javax.swing.JOptionPane;

import view.ManterCaixa;
import view.ManterCliente;

public class Menu {
	
	public static void main(String[]args) {
		String senhaADM = "alo";	
		ManterCliente cli = new ManterCliente();
		ManterCaixa c = new ManterCaixa();
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Clientes"
															 + "\n2 - Consultar Conta"
															 + "\n3 - Carregar Caixa"
															 + "\n4 - Saque"
															 + "\n5 - Estatistica"
															 + "\n6 - Finalizar operacao"));
		while(opcao >= 1 && opcao <= 5) {
					
			switch(opcao) {
				case 1:
					boolean va = ValidacaoSenha.Adm(senhaADM);
					if(va == true) {
						JOptionPane.showMessageDialog(null, "Bem vindo!");
						cli.cadastrar();
					}else {
						JOptionPane.showMessageDialog(null, "Senha Invalida");
					}
				break;
					
				case 2:
					va = ValidacaoSenha.Adm(senhaADM);
					if(va == true) {
						JOptionPane.showMessageDialog(null, "Bem vindo!");
						cli.consultar();
					}else {
						JOptionPane.showMessageDialog(null, "Senha Invalida"); 
					}
				break;
				
				case 3:
					va = ValidacaoSenha.Adm(senhaADM);
					if(va == true) {
						JOptionPane.showMessageDialog(null, "Bem vindo!");
						c.carregar();
					}else {
						JOptionPane.showMessageDialog(null, "Senha Invalida");
					}
				break;
					
				case 4:
					cli.verificarSaldo();
					
				break;
					
				case 5:
					va = ValidacaoSenha.Adm(senhaADM);
					if(va == true) {
						JOptionPane.showMessageDialog(null, "Bem vindo!");
						cli.estatistica();
		
					}else {
						JOptionPane.showMessageDialog(null, "Senha Invalida");
					}
				break;
			}

			opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Clientes"
					 + "\n2 - Consultar Conta"
					 + "\n3 - Carregar Caixa"
					 + "\n4 - Saque"
					 + "\n5 - Estatastica"
					 + "\n6 - Finalizar operacao"));
		}
	}
}