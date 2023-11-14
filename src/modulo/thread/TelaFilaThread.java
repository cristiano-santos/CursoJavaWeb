package modulo.thread;

	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.Insets;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;

	import javax.swing.JButton;
	import javax.swing.JDialog;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class TelaFilaThread extends JDialog{


		private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de Componentes */

		private JLabel nomeUsuario = new JLabel("Nome");
		private JTextField mostrarNome = new JTextField();

		private JLabel emailUsuario = new JLabel("Email");
		private JTextField mostrarEmail = new JTextField();

		private JButton jButton = new JButton("Add Lista");
		private JButton jButton2 = new JButton("Stop");

		private ImplementacaoFila fila = new ImplementacaoFila();

		public TelaFilaThread() {
			// TODO Auto-generated constructor stub
			/* Construção da tela */
			setTitle("Minha Tela Thread");
			setSize(new Dimension(240, 240));
			setResizable(false);

			GridBagConstraints gridBagConstraints = new GridBagConstraints(); /* Controle de posicionamento dos elementos */
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.gridwidth = 2;
			gridBagConstraints.insets = new Insets(5, 10, 5, 5);
			gridBagConstraints.anchor = GridBagConstraints.WEST;

			nomeUsuario.setPreferredSize(new Dimension(200, 25));
			jPanel.add(nomeUsuario, gridBagConstraints);

			mostrarNome.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy++;
			jPanel.add(mostrarNome, gridBagConstraints);
			

			emailUsuario.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy++;
			jPanel.add(emailUsuario, gridBagConstraints);

			mostrarEmail.setPreferredSize(new Dimension(200, 25));
			gridBagConstraints.gridy++;
			jPanel.add(mostrarEmail, gridBagConstraints);
			gridBagConstraints.gridwidth = 1;

			jButton.setPreferredSize(new Dimension(92, 25));
			gridBagConstraints.gridy++;
			jPanel.add(jButton, gridBagConstraints);

			jButton2.setPreferredSize(new Dimension(92, 25));
			gridBagConstraints.gridx++;
			jPanel.add(jButton2, gridBagConstraints);

			jButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) { /*Executa ao clicar no botão*/
					
					if(fila == null) {
						fila = new ImplementacaoFila();
						fila.start();
					}
					for (int qtd = 0; qtd < 20; qtd++) {
						
						ObjetoFila filaThread = new ObjetoFila();
						filaThread.setNome(mostrarNome.getText());
						filaThread.setEmail(mostrarEmail.getText() + " - " + qtd);

						fila.add(filaThread);
					}
				}
			});

			jButton2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					fila.stop();
					fila = null;
				}
			});

			fila.start();
			
			add(jPanel, BorderLayout.WEST);

			setVisible(true);
		}

}
