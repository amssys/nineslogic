package nines.logic.statistics.response;

/**
 * 九星レスポンスクラス<BR>
 * @author Luv
 */
public class StatisticsPlayerResponse {

	/** 生命数 */
	private String lifeNumber;
	/** 年の九星 */
	private String yearStar;
	/** 月の九星 */
	private String monthStar;
	/** 日の九星 */
	private String dateStar;
	
	public String getLifeNumber() {
		return lifeNumber;
	}
	public void setLifeNumber(String lifeNumber) {
		this.lifeNumber = lifeNumber;
	}
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


}
