package JProgressBar;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class Cour1 extends JFrame{
	JProgressBar jprogess;
	int i=0;
	int num =0;
	Cour1(){
		jprogess=new JProgressBar(0,1000);
		jprogess.setBounds(30, 30,300,40);
		jprogess.setStringPainted(true);
		add(jprogess);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
		while(i<1000) {
			jprogess.setValue(i);
			i=i+10;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
//	public void count() {
//		while(i<1000) {
//			jprogess.setValue(i);
//			i=i+10;
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		}
//	}
	public static void main(String[] args) {
		Cour1 m=new Cour1();
//		m.count();
		
	}

}
