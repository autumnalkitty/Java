package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class JTableTest extends JFrame implements ActionListener {
	//필드
	DefaultTableModel model;
	//생성자
	public JTableTest() {
		//레이아웃을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		//테이블의 칼럼명
		String[] colNames= {"번호", "이름", "주소"};
		//테이블에 연결할 모델 객체
		model=new DefaultTableModel(colNames, 0);
		//테이블 객체 생성
		JTable table=new JTable();
		//모델 연결
		table.setModel(model);
		//테이블을 스코롤 패널에 붙이고
		add(table, BorderLayout.CENTER);
		//스크롤 패널을 프레임의 가운데에 배치
		JScrollPane scPane=new JScrollPane(table);
		//패널 객체 생성
		JPanel northPanel=new JPanel();
		//버튼 객체 생성
		JButton testBtn=new JButton("테스트");
		//버튼을 패널에 붙이고
		northPanel.add(testBtn);
		//버튼 패널을 프레임의 북쪽에 배치
		add(northPanel, BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);
		
		add(scPane, BorderLayout.CENTER);
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTableTest();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		/*
		Object[] data1= {1, "김구라", "노량진"};
		Object[] data2= {2, "해골", "행신동"};
		Object[] data3=new Object[3];
		data3[0]=3;
		data3[1]="원숭이";
		data3[2]="상도동";
		
		model.addRow(data1);
		model.addRow(data2);
		model.addRow(data3);
		*/
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> list=dao.getList();
		//반복문 돌면서 MemberDto 객체를 하나씩 참조해서
		for(MemberDto tmp:list) {
			//Object 객체에 회원 한 명의 정보를 담아서
			//Object[] data= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			Object[] data=new Object[3];
			data[0]=tmp.getNum();
			data[1]=tmp.getName();
			data[2]=tmp.getAddr();
			//모델에 추가하기
			model.addRow(data);
		}
	}
}
