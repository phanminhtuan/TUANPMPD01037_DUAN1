package tuanpmpd01037.object;

public class Word {
	private String _id;
	private String tu;
	private String nghiaTu;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public String getNghiaTu() {
		return nghiaTu;
	}

	public void setNghiaTu(String nghiaTu) {
		this.nghiaTu = nghiaTu;
	}

	public Word() {
	}

	public Word(String tu, String nghiaTu) {
		this.tu = tu;
		this.nghiaTu = nghiaTu;
	}

	public Word(String _id, String tu, String nghiaTu) {
		this._id = _id;
		this.tu = tu;
		this.nghiaTu = nghiaTu;
	}

	@Override
	public String toString() {
		return tu + nghiaTu;
	}

}
