package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame07 extends JFrame implements ActionListener {
	//필드
	JTextField tf_one, tf_two, tf_result;
	//생성자
	public TestFrame07() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		//문자열을 입력할 수 있는 텍스트 필드 객체
		JTextField tf_one=new JTextField(10);
		JTextField tf_two=new JTextField(10);
		JTextField tf_result=new JTextField(10);
		//버튼 객체
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		//라벨
		JLabel label=new JLabel("=");
		//패널
		JPanel panel=new JPanel();
		panel.add(tf_one);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiBtn);
		panel.add(divideBtn);
		panel.add(tf_two);
		panel.add(label);
		panel.add(tf_result);
		//패널을 프레임에 배치
		add(panel, BorderLayout.NORTH);
		//버튼에 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		//Action Command 설정
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		setBounds(100, 100, 800, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TestFrame07();
	}
	//버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼이 눌리는지 Action Command 를 읽어와서
		String command=e.getActionCommand();
		//입력한 문자열을 읽어온다.
		String one=tf_one.getText();
		String two=tf_two.getText();
		try {
			//문자열을 산술연산할 수 있는 실수로 바꾸기
			double num1=Double.parseDouble(one);
			double num2=Double.parseDouble(two);
			//연산의 결과를 담을 수 있는 변수 만들기
			double result=0;		
			if(command.equals("plus")) {
				result=num1+num2;
			} else if(command.equals("minus") ) {
				result=num1-num2;
			} else if(command.equals("multi") ) {
				result=num1*num2;
			} else if(command.equals("divide") ) {
				result=num1/num2;
			}
			//결과를 TextFiled 에 출력하기
			tf_result.setText(Double.toString(result));
		} catch(Exception exe) {
			exe.printStackTrace();
			JOptionPane.showMessageDialog(this, "숫자 형식을 확인하세요.");
		}
	}
}
