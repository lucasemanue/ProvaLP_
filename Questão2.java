package lucas_LP;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Color;

	public class Questão2 extends JFrame {

		private JPanel contentPane;
		private JTextField txtValor;
		private JTextField txtQuantidade;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Questão2 frame = new Questão2();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Questão2() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel txt_nome = new JLabel("Calculadora BOVINA");
			txt_nome.setBounds(157, 39, 142, 31);
			contentPane.add(txt_nome);
			
			JLabel txt_valor = new JLabel("Valor da Arroba");
			txt_valor.setForeground(Color.BLUE);
			txt_valor.setBackground(Color.WHITE);
			txt_valor.setBounds(31, 111, 98, 14);
			contentPane.add(txt_valor);
			
			JLabel txt_quantidade = new JLabel("Quantidade de Arrobas");
			txt_quantidade.setForeground(Color.BLUE);
			txt_quantidade.setBounds(31, 165, 133, 14);
			contentPane.add(txt_quantidade);
			
			txtValor = new JTextField();
			txtValor.setBounds(217, 108, 160, 20);
			contentPane.add(txtValor);
			txtValor.setColumns(10);
			
			txtQuantidade = new JTextField();
			txtQuantidade.setBounds(217, 162, 160, 20);
			contentPane.add(txtQuantidade);
			txtQuantidade.setColumns(10);
			
			JButton btnCalcular = new JButton("Calcular Total a Pagar");
			btnCalcular.setForeground(Color.RED);
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double valor = Double.parseDouble(txtValor.getText());
					double quantidade = Double.parseDouble(txtQuantidade.getText());
					double total = valor * quantidade;
					JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + total);
				}
			});
			btnCalcular.setBounds(139, 215, 160, 23);
			contentPane.add(btnCalcular);
		}
	}

