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

import test.dao.EmpDao;
import test.dto.EmpDto;
/*
emp 테이블과 dept 테이블을 이용한 프레임 만들기
JTable 에 출력할 내용은
사원번호 | 이름 | 급여 | 부서명 | 입사일 
*/
public class EmpFrame extends JFrame implements ActionListener {
	//필드
	DefaultTableModel model;
	//생성자
	public EmpFrame() {
		//레이아웃을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		//테이블의 칼럼명
		String[] colNames= {"사원번호", "이름", "급여", "부서명", "입사일"};
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
		JButton testBtn=new JButton("사원 목록 보기");
		//버튼을 패널에 붙이고
		northPanel.add(testBtn);
		//버튼 패널을 프레임의 북쪽에 배치
		add(northPanel, BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);
		
		add(scPane, BorderLayout.CENTER);
		setBounds(100, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] arg0) {
		new EmpFrame();
	}
	//버튼 눌렀을 때 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent arg0) {
		EmpDao dao=EmpDao.getInstance();
		List<EmpDto> list=dao.getList();
		for(EmpDto tmp:list) {
			Object[] data=new Object[5];
			data[0]=tmp.getEmpno();
			data[1]=tmp.getEname();
			data[2]=tmp.getSal();
			data[3]=tmp.getDname();
			data[4]=tmp.getHiredate();
			model.addRow(data);
		}
	}
}
