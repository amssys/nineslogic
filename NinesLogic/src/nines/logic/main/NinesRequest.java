package nines.logic;

/**
 * 九星リクエストクラス<BR>
 * @author Luv
 */
public class NinesRequest {
	/** 誕生年 */
	private String birthYear;
	/** 占い日時 */
	private String ymdhms;
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getYmdhms() {
		return ymdhms;
	}
	public void setYmdhms(String ymdhms) {
		this.ymdhms = ymdhms;
	}
}
