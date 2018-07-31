package test.mypac;

public class NoteBook {
	//필드
	public Cpu cpu;
	public Memory memory;
	/*
	default 생성자
	public NoteBook() {
		
	}
	*/
	
	//생성자
	public NoteBook(Cpu cpu, Memory memory) {
		this.cpu=cpu;
		this.memory=memory;
	}
}
