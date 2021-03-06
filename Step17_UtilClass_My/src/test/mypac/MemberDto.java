package test.mypac;
/*
회원 한 명의 정보를 담기 위한 MemberDto 클래스
*/
public class MemberDto {
	//필드
	private int num;
	private String name;
	private String addr;
	//default 생성자
	public MemberDto() {}
	public MemberDto(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
