package test.ui;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListTest extends JFrame {
	//생성자
	public JListTest() {
		//JList 에 연결할 model 객체 생성
		DefaultListModel<String> model=new DefaultListModel<>();
		model.addElement("김구라");
		model.addElement("해골");
		model.addElement("원숭이");
		//문자열 목록을 출력할 수 있는 JList 생성
		JList<String> list=new JList<>();
		//JList 에 모델 연결
		list.setModel(model);
		//배경 색상
		list.setBackground(Color.YELLOW);
		
		this.add(list);
		
		setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을 때 process 가 종료되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListTest();
	}
}
