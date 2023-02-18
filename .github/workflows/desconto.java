package java;

import java.awt.Component;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		// Variáveis
		Double venda;
		String mensagem;

		// Janelas iniciais
		venda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda: "));
		if (venda > 500) {
			Double percentual;
			percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do percentual de desconto: "));
			double valorFinal = venda - (percentual / 100 * venda);
			JOptionPane.showMessageDialog(null, "O valor total é " + valorFinal + " reais");
		} else {
			JOptionPane.showMessageDialog(null, "O valor total é " + venda + " reais");
		}
	}
}
