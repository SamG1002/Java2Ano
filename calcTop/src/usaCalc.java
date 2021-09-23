import java.awt.EventQueue;
public class usaCalc {
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcOperation calc = new CalcOperation();
					calc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}