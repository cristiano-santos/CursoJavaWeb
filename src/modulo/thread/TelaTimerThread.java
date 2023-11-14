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

public class TelaTimerThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de Componentes */

	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostrarTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostrarTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			while (true) { /* fica rodando */
				mostrarTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	};
	
	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) { /* fica rodando */
				mostrarTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	};

	private Thread thread1Time;
	private Thread threadTime2;

	public TelaTimerThread() {
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

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostrarTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostrarTempo, gridBagConstraints);
		mostrarTempo.setEditable(false);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostrarTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostrarTempo2, gridBagConstraints);
		mostrarTempo2.setEditable(false);
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
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				threadTime2 = new Thread(thread2);
				threadTime2.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);

			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				threadTime2.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);

			}
		});

		jButton2.setEnabled(false);
		
		add(jPanel, BorderLayout.WEST);

		setVisible(true);
	}
}
