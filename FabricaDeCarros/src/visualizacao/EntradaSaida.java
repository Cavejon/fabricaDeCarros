package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {

		String[] opcoes = { "Contruir carro(s)", "Vender carro(s)", "Ver informa��es do(s) carro(s)",
				"Sair do programa" };

		JComboBox<String> menu = new JComboBox<String>(opcoes);

		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();

	}

	public static int solicitaQtdeCarros(String carro) {

		int solicitaQtde;
		
		solicitaQtde=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de " + carro));
		
		while(solicitaQtde<=0) {
			solicitaQtde=Integer.parseInt(JOptionPane.showInputDialog("Quantidade inv�lida!"
					+ "\nInforme a quantidade de " + carro));
		}
		return solicitaQtde;
	}

	public static String solicitaModelo(String carro, int ordem) {
		if (ordem <= 0) {
			return JOptionPane.showInputDialog("Informe o " + carro + " do carro");
		} else {
			return JOptionPane.showInputDialog("Informe o " + carro + " do " + ordem + "� carro");
		}

	}

	public static String solicitaCor() {

		return JOptionPane.showInputDialog("Informe a cor do carro");

	}

	public static int solicitaAno() {

		int resultadoAno;

		resultadoAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));

		while (resultadoAno <= 0) {

			resultadoAno = Integer
					.parseInt(JOptionPane.showInputDialog("Data inv�lida!" + "\n Digite novamente por favor!"));
		}
		return resultadoAno;
	}

	public static void exibeMsgEncerraPrograma() {

		JOptionPane.showMessageDialog(null, "O programa ser� encerrado");

	}

	public static void exibeCarroCriado() {

		JOptionPane.showMessageDialog(null, "O carro foi criado com sucesso!");

	}

	public static void exibeCarroVendido() {
		JOptionPane.showMessageDialog(null, "O carro foi vendido");
	}

	public static void exibeListaVazia() {
		JOptionPane.showMessageDialog(null, "A lista est� vazia");
	}

	public static void exibeCarroInexistente() {

		JOptionPane.showMessageDialog(null, "O carro n�o foi encontrado");
	}

}
