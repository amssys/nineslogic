package nines.logic.main.simple;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import nines.logic.main.CalculateDateNineStar;
import nines.logic.main.CalculateMonthNineStar;
import nines.logic.main.CalculateYearNineStar;
import nines.logic.main.NinesDate;

public class SimpleCalculateNineStars {

	public Map<String, Integer> getNineStars(String ymd) throws ParseException {
		Map<String, Integer> ret = new HashMap<>();
		CalculateMonthNineStar m = new CalculateMonthNineStar();
		CalculateYearNineStar y = new CalculateYearNineStar();
		CalculateDateNineStar d = new CalculateDateNineStar();
		String year = ymd.substring(0, 4);
		String month = ymd.substring(5, 7);
		String date = ymd.substring(8, 10);
		Integer yearStar = y.getYearStar(year, month, date);
		Integer monthStar = m.getMonthStar(year, month, date, yearStar);
		NinesDate dateStar = d.getNiesDate(ymd);
		ret.put("year", yearStar);
		ret.put("month", monthStar);
		ret.put("date", dateStar.getDateStar());
		ret.put("lifenumber", getLifeNumber(ymd));
		return ret;
	}

	private Integer getLifeNumber(String ymd) {
		int year = stringCut(ymd, 0, 4);
		int month = stringCut(ymd, 5, 7);
		int day = stringCut(ymd, 8, 10);
		String sumstr = String.valueOf(year + month + day);
		int leftnum = stringCut(sumstr, 0, 1) + stringCut(sumstr, 1, 2);
		int lightnum = stringCut(sumstr, 2, 3) + stringCut(sumstr, 3, 4);
		int cutnum = 0;
		String answer = String.valueOf(leftnum + lightnum);
		if (answer.length() == 2) {
			cutnum = stringCut(String.valueOf(leftnum + lightnum), 0, 1)
					+ stringCut(String.valueOf(leftnum + lightnum), 1, 2);
			answer = String.valueOf(cutnum - 1);
		} else {
			answer = String.valueOf(leftnum + lightnum - 1);
		}
		// 「0」の場合は9に読み替え
		if("0".equals(answer)) {
			answer = "9";
		}
		return Integer.valueOf(answer);
	}

	/**
	 * Stringを切り出します<BR>
	 *
	 * @param str
	 * @param stratcut
	 * @param endcut
	 * @return
	 */
	private int stringCut(String str, int stratcut, int endcut) {
		int num = Integer.parseInt(str.substring(stratcut, endcut));
		return num;
	}
}
