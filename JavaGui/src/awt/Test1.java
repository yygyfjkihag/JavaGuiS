package awt;

import java.awt.Button;
import java.awt.Frame;

public class Test1 extends Frame {
	
	private static final long serialVersionUID = 1L;
	private Button but=new Button("OK");

	public Test1(){
		super("First Winddows.");
		this.setSize(600, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Test1();
	}

}
