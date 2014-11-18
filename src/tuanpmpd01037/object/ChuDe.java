package tuanpmpd01037.object;

import java.util.List;

public class ChuDe {
	private String idChude;
	private int image;
	private List<TuVung> listTuVung;

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getIdChude() {
		return idChude;
	}

	public void setIdChude(String idChude) {
		this.idChude = idChude;
	}

	public List<TuVung> getListTuVung() {
		return listTuVung;
	}

	public void setListTuVung(List<TuVung> listTuVung) {
		this.listTuVung = listTuVung;
	}

	public ChuDe() {
	}

	public ChuDe(String idChude, int image, List<TuVung> listTuVung) {
		this.idChude = idChude;
		this.image = image;
		this.listTuVung = listTuVung;
	}

	public ChuDe(String idChude, List<TuVung> listTuVung) {
		this.idChude = idChude;
		this.listTuVung = listTuVung;
	}

	@Override
	public String toString() {
		return idChude;
	}
}
