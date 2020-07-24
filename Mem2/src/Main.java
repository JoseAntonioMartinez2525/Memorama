

public class Main {

	private static final int EXIT_ON_CLOSE = 0;

	public static void main(String[] args) {

		  Principal p = new Principal();
		  p.setVisible(true);
		  p.setBounds(0, 0, 800, 600);
		  p.setLocationRelativeTo(null);
		  p.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
