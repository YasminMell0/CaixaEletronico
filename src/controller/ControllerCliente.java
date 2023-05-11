package controller;
import model.bean.Cliente;
import model.dao.DaoCliente;

public class ControllerCliente {

	DaoCliente daocli;
	
	public Cliente cadastrar(Cliente cli) {
		daocli = new DaoCliente();
		Cliente saidacli = daocli.cadastrar(cli);
		return saidacli;
	}
	
	public Cliente consultar(Cliente cli) {
		daocli = new DaoCliente();
		Cliente saidacli = daocli.consultar(cli);
		return saidacli;
	}
	
	public Cliente verificarSaldo(Cliente cli) {
		daocli = new DaoCliente();
		Cliente saidacli = daocli.estatistica(cli);
		return saidacli;
	}
	
	public Cliente estatistica(Cliente cli) {
		daocli = new DaoCliente();
		Cliente saidacli = daocli.estatistica(cli);
		return saidacli;
	}
	
}
