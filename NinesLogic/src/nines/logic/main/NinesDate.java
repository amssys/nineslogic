package nines.logic.main;

import java.util.Calendar;
import java.util.Date;

import nines.logic.util.SixtyZodiac;

public class NinesDate {

	/** 日付 */
	private Date date;

	/** 六十干支 */
	private SixtyZodiac sixtyZodiac;

	/** 日家九星の数値 */
	private Integer dateStar;

	/** 陽遁フラグ */
	private boolean yangFlg;

	public SixtyZodiac getSixtyZodiac() {
		return sixtyZodiac;
	}

	public void setSixtyZodiac(SixtyZodiac sixtyZodiac) {
		this.sixtyZodiac = sixtyZodiac;
	}

	public Integer getDateStar() {
		return dateStar;
	}

	public void setDateStar(Integer dateStar) {
		this.dateStar = dateStar;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public NinesDate getNextDate() {
		NinesDate newNinesDate = new NinesDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);

		// 次の日の日付を設定
		newNinesDate.setDate(cal.getTime());

		// 次の日の六十干支を設定
		newNinesDate.setSixtyZodiac(sixtyZodiac.getNext());

		return newNinesDate;
	}

	public boolean isYangFlg() {
		return yangFlg;
	}

	public void setYangFlg(boolean yangFlg) {
		this.yangFlg = yangFlg;
	}

	public String getZodiac() {
		return sixtyZodiac.getName().substring(sixtyZodiac.getName().length() - 1);
	}

}
