
public class oop_hoadoncf {
	String tenCaPhe;
	double giaTien;
	double soLuong;
	
	public oop_hoadoncf(String tenCf, double giaT, double soL){
		this.tenCaPhe = tenCf;
		this.giaTien = giaT;
		this.soLuong = soL;
	}
	
	public double tinhTongTien() {
		double tongTien = this.giaTien*this.soLuong;
		return tongTien;
	}
	
	public boolean kiemTraTongTien() {
		if(this.tinhTongTien() > 500000)
			return true;
		return false;
	}
	
	public double giamGia(double x) {
		if(this.tinhTongTien() > 500000)
			return this.tinhTongTien()*(x/100) ;
		return 0;
	}
}


		
	