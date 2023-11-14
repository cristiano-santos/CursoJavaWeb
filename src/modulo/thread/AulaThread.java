package modulo.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/*------------------Divisão das Threads----------------------------*/

		Thread threadEnviarNF = new Thread(thread2);
		threadEnviarNF.start();

		System.out.println("Final da execução!");
		JOptionPane.showMessageDialog(null, "Sistema excutando para o usuario");
	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int pos = 0; pos < 10; pos++) {

				/* Executar o envio com um tempo de parada, ou com tempo determinado. */

				System.out.println("Executando rotina, envio de nota fiscal.");

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* dá um tempo na execução */
			}
		};

	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int pos = 0; pos < 10; pos++) {

				/* Executar o envio com um tempo de parada, ou com tempo determinado. */

				System.out.println("Executando rotina, envio de email.");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* dá um tempo na execução */
			}
		}
	};

}
