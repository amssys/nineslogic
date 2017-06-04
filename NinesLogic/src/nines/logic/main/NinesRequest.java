package nines.logic.main;

/**
 * 九星リクエストクラス<BR>
 * @author Luv
 */
public class NinesRequest {

	/** 誕生年 */
	private String birthYear;
	/** 占い日時 */
	private String ymdhms;

	/**
	 * ymdhmsを取得します。<BR>
	 * @return ymdhms
	 */
	public String getYmdhms() {
		return ymdhms;
	}

	/**
	 * ymdhmsを設定します。<BR>
	 * @param ymdhms
	 */
	public void setYmdhms(String ymdhms) {
		this.ymdhms = ymdhms;
	}

	/**
	 * birthYearを取得します。<BR>
	 * @return birthYear
	 */
	public String getBirthYear() {
		return birthYear;
	}

	/**
	 * birthYearを設定します。<BR>
	 * @param birthYear
	 */
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
