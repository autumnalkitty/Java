package test.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaTest extends JFrame implements ActionListener {
	//필드
	private JTextArea ta;
	//생성자
	public JTextAreaTest() {
		//여러 줄의 문자열을 입력할 수 있는 JTextArea 객체 생성
		ta=new JTextArea("Welcome!");
		//위치와 크기 정하기
		ta.setBounds(10, 10, 300, 300);
		//배경색 지정
		ta.setBackground(Color.YELLOW);
		//JFrame 에 JTextArea 추가
		add(ta);
		
		JButton sendBtn=new JButton("전송");
		sendBtn.setBounds(10, 310, 300, 50);
		//버튼에 ActionListener 등록
		sendBtn.addActionListener(this);
		
		add(sendBtn);
		//레이아웃 메니저 없이 배치
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
	//버튼 눌렀을 때 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextArea 에 입력한 문자열을 읽어와서
		String msg=ta.getText();
		//콘솔에 출력하기
		System.out.println(msg);
	}
}
