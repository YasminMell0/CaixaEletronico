package model.bean;

public class Caixa {
	private int n2;
	private int n5;
	private int n10;
	private int n20;
	private int n50;
	private int n100;

	public Caixa(int n2, int n5, int n10, int n20, int n50, int n100) {
		this.n2 = n2;
		this.n5 = n5;
		this.n10 = n10;
		this.n20 = n20;
		this.n50 = n50;
		this.n100 = n100;
	}
	
	public Caixa() {

	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN5() {
		return n5;
	}

	public void setN5(int n5) {
		this.n5 = n5;
	}

	public int getN10() {
		return n10;
	}

	public void setN10(int n10) {
		this.n10 = n10;
	}

	public int getN20() {
		return n20;
	}

	public void setN20(int n20) {
		this.n20 = n20;
	}

	public int getN50() {
		return n50;
	}

	public void setN50(int n50) {
		this.n50 = n50;
	}

	public int getN100() {
		return n100;
	}

	public void setN100(int n100) {
		this.n100 = n100;
	}

	@Override
	public String toString() {
		return "Caixa \nnotas de 2= " + n2 + "\nnotas de 5= " + n5 + "\nnotas de 10= " + n10 + "\nnotas de 20= " + n20 + "\nnotas de 50= " + n50 + "\nnotas de 100= " + n100;
	}
}