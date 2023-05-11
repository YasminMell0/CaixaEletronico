package principal;
import javax.swing.JOptionPane;


public class ValidacaoSenha { 
	public static boolean Adm(String sadm) {
		String s = JOptionPane.showInputDialog("Digite a senha de administrador:");
		boolean r = false;
		 
		if(s.equals(sadm)){
			r = true;
		}else{
			for(int i = 0; i < 2; i++) {
				s = JOptionPane.showInputDialog("Senha incorreta, insira novamente:");
				if(s.equals(sadm)){
					r = true;
					i = 100;
				}else{
					r = false;
				}
			} 
		}	
		return r;
	}
}
