package nines.logic.main;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import nines.logic.util.Constant;

/**
 * 日家九星を計算するクラス<BR>
 */
public class CalculateDateNineStar {


	/**
	 * 日家九星を取得します。
	 * @param map
	 * @param date
	 * @return
	 */
	public Map<Integer, String> getDateStar(Map<Integer, String> map, String date) {
		// 基準となる日付（甲子・一白水星）//TODO:一般的に求める
//		final Calendar baseCal = parseStrToCal("2009/01/19 00:00:00");
		final Calendar baseCal = parseStrToCal("2016/12/08 00:00:00");

		// 閏のない期間の終わり（仮）
		final Calendar endDateCal = parseStrToCal("2020/05/20 00:00:00");

		if (baseCal != null) {
			boolean isYangTerm = true;

			// 陽遁・隠遁の開始日リストを作成
			List<Calendar> yangStartDateList = getStartDateList(baseCal, isYangTerm);
			List<Calendar> yinStartDateList = getStartDateList(baseCal, !isYangTerm);

			final int nextDate = 1;

			while (baseCal.before(endDateCal)) {

				if (isInYangTerm(baseCal, yangStartDateList, yinStartDateList)) {
					map.put(getCalInteger(baseCal), Constant.NAME_IPPAKU_SUISEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.IPPAKU_SUISEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_JIKOKU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.JIKOKU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SAMPEKI_MOKUSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SAMPEKI_MOKUSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SHIROKU_MOKUSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SHIROKU_MOKUSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_GOU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.GOU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_ROPPAKU_KINSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.ROPPAKU_KINSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SHICHISEKI_KINSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SHICHISEKI_KINSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_HAPPAKU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.HAPPAKU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_KYUSHI_KASEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.KYUSHI_KASEI);
					baseCal.add(Calendar.DATE, nextDate);
				}
				else {
					map.put(getCalInteger(baseCal), Constant.NAME_KYUSHI_KASEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.KYUSHI_KASEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_HAPPAKU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.HAPPAKU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SHICHISEKI_KINSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SHICHISEKI_KINSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_ROPPAKU_KINSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.ROPPAKU_KINSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_GOU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.GOU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SHIROKU_MOKUSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SHIROKU_MOKUSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_SAMPEKI_MOKUSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.SAMPEKI_MOKUSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_JIKOKU_DOSEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.JIKOKU_DOSEI);
					baseCal.add(Calendar.DATE, nextDate);
					map.put(getCalInteger(baseCal), Constant.NAME_IPPAKU_SUISEI);
//					System.out.println(getCalInteger(baseCal) + " " + Constant.IPPAKU_SUISEI);
					baseCal.add(Calendar.DATE, nextDate);
				}

			} // while end

		}

//		for (Integer key: map.keySet())
//			System.out.println(key + " " + map.get(key));

		return map;

	}

	/**
	 * 陽遁・隠遁開始日のリストを作成して返します。
	 * @param base
	 * @param isYang
	 * @return
	 */
	private List<Calendar> getStartDateList(Calendar base, boolean isYang) {
		List<Calendar> retList = new ArrayList<Calendar>();
		final int cycle = 360; // 1サイクルの日数

		for (int i = 0; i < 11; i++) { // 11年分

			Calendar cal = (Calendar) base.clone();

			if (isYang) {
				if (i == 0) {
					// 陽遁開始日をリストに追加
					retList.add(cal);
				}
				else {
					// 陽遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle * i);
					retList.add(cal);
				}
			}
			else {
				if (i == 0) {
					// 隠遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle / 2);
					retList.add(cal);
				}
				else {
					// 隠遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle / 2 + cycle * i);
					retList.add(cal);
				}
			}
		}

		return retList;
	}

	/**
	 * Calendar型の日付をInteger型に変換して返します。
	 * @param cal
	 * @return
	 */
	private Integer getCalInteger(Calendar cal) {
		Date c = cal.getTime();
		return Integer.valueOf(String.format("%tY%tm%td", c, c, c));
	}

	/**
	 * 指定したCalendar型の日付が陽遁の期間であるか判定します。
	 * @param cal
	 * @param yangList
	 * @param yinList
	 * @return
	 */
	private boolean isInYangTerm(Calendar cal, List<Calendar> yangList, List<Calendar> yinList) {
		boolean ret = false;

		for (int i = 0; i < yangList.size(); i++) {
			if (cal.equals(yangList.get(i)) || cal.after(yangList.get(i))
					&& cal.before(yinList.get(i))) {
				ret = true;
			}
		}

		return ret;
	}

	/**
	 * String型の日付をCalendar型に変換します。
	 * @param date
	 * @return
	 */
	private Calendar parseStrToCal(String date) {
		Calendar cal = Calendar.getInstance();

		// yyyy/MM/dd HH:mm:ss のフォーマットを変換する
		if (date.length() == 19) {
			try {
				cal.setTime(DateFormat.getDateInstance().parse(date));
			} catch (Exception e) {
				cal = null;
			}
		} else {
			cal = null;
		}
		return cal;
	}

}
