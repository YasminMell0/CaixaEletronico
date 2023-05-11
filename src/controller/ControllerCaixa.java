package controller;

import model.bean.Caixa;
import model.dao.DaoCaixa;

public class ControllerCaixa {

	DaoCaixa daoc;
	
	public Caixa carregar(Caixa c) {
		daoc = new DaoCaixa();
		Caixa saidac = daoc.carregar(c);
		return saidac;
	}
	
	public Caixa sacar(Caixa c) {
		daoc = new DaoCaixa();
		Caixa saidac = daoc.sacar(c);
		return saidac;
	}

}
