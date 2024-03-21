package tp5GastoPublico;

public class Impuesto {
	private int imp1;
	private int imp2;
	private int imp3;
	private int imp4;
	private int imp5;
	public Impuesto(int imp1, int imp2, int imp3, int imp4, int imp5) {
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;
		this.imp4 = imp4;
		this.imp5 = imp5;
	}
	public int getImp1() {
		return imp1;
	}
	public void setImp1(int imp1) {
		this.imp1 = imp1;
	}
	public int getImp2() {
		return imp2;
	}
	public void setImp2(int imp2) {
		this.imp2 = imp2;
	}
	public int getImp3() {
		return imp3;
	}
	public void setImp3(int imp3) {
		this.imp3 = imp3;
	}
	public int getImp4() {
		return imp4;
	}
	public void setImp4(int imp4) {
		this.imp4 = imp4;
	}
	public int getImp5() {
		return imp5;
	}
	public void setImp5(int imp5) {
		this.imp5 = imp5;
	}
	
	public int getAll() {
		return imp1 + imp2 + imp3 + imp4 + imp5;
	}
	
	
	
}

