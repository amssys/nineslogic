package nines.logic;

/**
 * 九星レスポンスクラス<BR>
 * @author Luv
 */
public class NinesResponse {
	/** 年の九星 */
	private String yearStar;
	/** 月の九星 */
	private String monthStar;
	/** 日の九星 */
	private String dateStar;
	/** 時の九星 */
	private String timeStar;
	/** 誕生年の九星 */
	private String birthYearStar;
	public String getYearStar() {
		return yearStar;
	}
	public void setYearStar(String yearStar) {
		this.yearStar = yearStar;
	}
	public String getMonthStar() {
		return monthStar;
	}
	public void setMonthStar(String monthStar) {
		this.monthStar = monthStar;
	}
	public String getDateStar() {
		return dateStar;
	}
	public void setDateStar(String dateStar) {
		this.dateStar = dateStar;
	}
	public String getTimeStar() {
		return timeStar;
	}
	public void setTimeStar(String timeStar) {
		this.timeStar = timeStar;
	}
	public String getBirthYearStar() {
		return birthYearStar;
	}
	public void setBirthYearStar(String birthYearStar) {
		this.birthYearStar = birthYearStar;
	}

}
