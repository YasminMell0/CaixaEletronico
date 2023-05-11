package view;

import javax.swing.JOptionPane;
import controller.ControllerCaixa;
import model.bean.Caixa;

public class ManterCaixa {
	static Caixa[] notas = new Caixa[1];

	public void carregar() {
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 2:"));
		int n5 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 5:"));
		int n10 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 10:"));
		int n20 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 20:"));
		int n50 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 50:"));
		int n100 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas de 100:"));
		
		if(notas[0] != null) {
			int a100 = notas[0].getN100(); int a50 = notas[0].getN50(); int a20 = notas[0].getN20(); int a10 = notas[0].getN10();int a5 = notas[0].getN5(); int a2 = notas[0].getN2();
			n2 = a2 + n2; n5 = a5 + n5; n10 = a10 + n10; n20 = a20 + n20; n50 = a50 + n50; n100 = a100 + n100;
		}
		
		Caixa nota = new Caixa(n2, n5, n10, n20, n50, n100);
		ControllerCaixa contcaixa = new ControllerCaixa();
		Caixa saidacaixa = contcaixa.carregar(nota);
		notas[0] = nota;
		
		JOptionPane.showMessageDialog(null, saidacaixa);	
		System.out.println(notas[0]);
		
	}
	
	public void sacar(int saque) {
		System.out.println(notas[0]);
		int n2 = 0; int n5 = 0; int n10 = 0; int n20 = 0; int n50 = 0; int n100 = 0; 
		int q100 = notas[0].getN100(); int q50 = notas[0].getN50(); int q20 = notas[0].getN20(); int q10 = notas[0].getN10();int q5 = notas[0].getN5(); int q2 = notas[0].getN2();
		
		if (notas[0].getN100() != 0) {
			while(saque >= 200 || saque - 100 < 100 && saque >= 0 ) { 
				System.out.println(saque = saque - 100);
				q100--; n100++;
			}q100++; n100--; saque = saque + 100;
			
		}if (saque != 0 && saque > 0) {
			if(notas[0].getN50() != 0) {
				while(saque >= 100 || saque - 50 < 50 && saque >= 0 ) { 
					System.out.println(saque = saque - 50);
					q50--; n50++;
				}q50++; n50--; saque = saque + 50;
			}
			
		}if (saque != 0 && saque > 0) {
			if(notas[0].getN20() != 0) {
				while(saque >= 20 || saque - 20 < 20 && saque >= 0 ) { 
					System.out.println(saque = saque - 20);
					q20--; n20++;
				}q20++; n20--; saque = saque + 20;
			}
			
		}if (saque != 0 && saque > 0) {
			if(notas[0].getN10() != 0) {
				while(saque >= 10 || saque - 10 < 10 && saque >= 0 ) { 
					System.out.println(saque = saque - 10);
					q10--; n10++;
				}q10++; n10--; saque = saque + 10;
			}
			
		}if (saque != 0 && saque > 0 && saque % 5 == 0) {
			if(notas[0].getN5() != 0) {
				while(saque >= 5 || saque - 5 < 5 && saque >= 0 ) { 
					System.out.println(saque = saque - 5);
					q5--; n5++;
				}q5++; n5--; saque = saque + 5;
			}
		
		}if (saque != 0 && saque > 0) {
			if(notas[0].getN2() != 0) {
				while(saque >= 2 || saque - 2 < 2 && saque >= 0 ) { 
					System.out.println(saque = saque - 2);
					q2--; n2++;
				}q2++; n2--; saque = saque + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Notas de 2: " +n2+
											"\nNotas de 5: " +n5+
											"\nNotas de 10: " +n10+
											"\nNotas de 20: " +n20+
											"\nNotas de 50: " +n50+
											"\nNotas de 100: " +n100);
		
		Caixa nota = new Caixa(q2, q5, q10, q20, q50, q100);
		ControllerCaixa contcaixa = new ControllerCaixa();
		Caixa saidacaixa = contcaixa.carregar(nota);
		notas[0] = nota;
		JOptionPane.showMessageDialog(null, saidacaixa);
	}
}