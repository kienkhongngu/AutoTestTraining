package day5;

public class Doctor {
	private double luongcoban;
	private double hesoluong;
	private int sonamkinhnghiem;
	private double luong;
	private double luong2;
	private double luong3;
	private double luong4;
	private int loai1;
	private int loai2;

	public Doctor() {
	}

	public Doctor(double luongcoban, double hesoluong, int sonamkinhnghiem) {
		super();
		this.luongcoban = luongcoban;
		this.hesoluong = hesoluong;
		this.sonamkinhnghiem = sonamkinhnghiem;
	}

	public double getLuongcoban() {
		return luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}

	public double getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}

	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}

	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		this.sonamkinhnghiem = sonamkinhnghiem;
	}

	public double Tinhluong1() {
		luong = luongcoban * hesoluong;
		return luong;
	}

	public double Tinhluong2() {
		luong2 = luongcoban * hesoluong * sonamkinhnghiem;
		return luong2;
	}

	public double Tinhluong3(double d) {
		this.loai1 = loai1;
		luong3 = luongcoban * hesoluong * sonamkinhnghiem * d;
		return luong3;
	}

	public double Tinhluong4(double d) {
		this.loai2 = loai2;
		luong4 = luongcoban * hesoluong * sonamkinhnghiem * d;
		return luong4;
	}
}