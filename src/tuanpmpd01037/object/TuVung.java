package tuanpmpd01037.object;

public class TuVung {
	private String tu;
	private String loaiTu;
	private String nghiaTu;
	private String cauViDu;
	private String nghiaCauViDu;

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public String getLoaiTu() {
		return loaiTu;
	}

	public void setLoaiTu(String loaiTu) {
		this.loaiTu = loaiTu;
	}

	public String getNghiaTu() {
		return nghiaTu;
	}

	public void setNghiaTu(String nghiaTu) {
		this.nghiaTu = nghiaTu;
	}

	public String getCauViDu() {
		return cauViDu;
	}

	public void setCauViDu(String cauViDu) {
		this.cauViDu = cauViDu;
	}

	public String getNghiaCauViDu() {
		return nghiaCauViDu;
	}

	public void setNghiaCauViDu(String nghiaCauViDu) {
		this.nghiaCauViDu = nghiaCauViDu;
	}

	public TuVung() {
	}

	public TuVung(String tu, String loaiTu, String nghiaTu, String cauViDu,
			String nghiaCauViDu) {
		this.tu = tu;
		this.loaiTu = loaiTu;
		this.nghiaTu = nghiaTu;
		this.cauViDu = cauViDu;
		this.nghiaCauViDu = nghiaCauViDu;
	}

	@Override
	public String toString() {
		return tu + loaiTu + nghiaTu + cauViDu + nghiaCauViDu;
	}

}
