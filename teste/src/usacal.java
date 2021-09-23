import java.awt.EventQueue;
public class usacal {
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc calcu = new calc();
					calcu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}