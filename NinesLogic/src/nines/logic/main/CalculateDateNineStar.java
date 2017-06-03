package nines.logic.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nines.logic.util.Constant;

/**
 * 日家九星を計算するクラス<BR>
 */
public class CalculateDateNineStar {
	final String strBaseDate = "2016/12/08 00:00:00";
	final String strEndDate = "2020/05/20 00:00:00";

	/**
	 * 日家九星を取得します。
	 * @param map
	 * @param date
	 * @return
	 */
	public Map<String, Integer> getDateStar() throws Exception {
		// 基準となる日付（甲子・一白水星）//TODO:一般的に求める
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		Map<String, Integer> dateMap = new HashMap<String, Integer>();
		Date baseDate = sdf.parse(strBaseDate);
		Date endDate = sdf.parse(strEndDate);
		Calendar cal = Calendar.getInstance();
		if (baseDate != null) {
			boolean isYangTerm = true;

			// 陽遁・隠遁の開始日リストを作成
			List<Date> yangStartDateList = getStartDateList(baseDate, isYangTerm);
			List<Date> yinStartDateList = getStartDateList(baseDate, !isYangTerm);
			cal.setTime(baseDate);
			final int nextDate = 1;
			while (cal.getTime().before(endDate)) {
				if (isInYangTerm(baseDate, yangStartDateList, yinStartDateList)) {
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
				}
				else {
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					dateMap.put(sdf2.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
				}

			} // while end
		}
		return dateMap;

	}

	/**
	 * 陽遁・隠遁開始日のリストを作成して返します。
	 * @param base
	 * @param isYang
	 * @return
	 */
	private List<Date> getStartDateList(Date base, boolean isYang) {
		List<Date> retList = new ArrayList<Date>();
		final int cycle = 360; // 1サイクルの日数

		for (int i = 0; i < 11; i++) { // 11年分

			Calendar cal = Calendar.getInstance();
			cal.setTime(base);

			if (isYang) {
				if (i == 0) {
					// 陽遁開始日をリストに追加
					retList.add(cal.getTime());
				}
				else {
					// 陽遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle * i);
					retList.add(cal.getTime());
				}
			}
			else {
				if (i == 0) {
					// 隠遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle / 2);
					retList.add(cal.getTime());
				}
				else {
					// 隠遁開始日をリストに追加
					cal.add(Calendar.DATE, cycle / 2 + cycle * i);
					retList.add(cal.getTime());
				}
			}
		}

		return retList;
	}

	/**
	 * 指定したCalendar型の日付が陽遁の期間であるか判定します。
	 * @param cal
	 * @param yangList
	 * @param yinList
	 * @return
	 */
	private boolean isInYangTerm(Date cal, List<Date> yangList, List<Date> yinList) {
		boolean ret = false;

		for (int i = 0; i < yangList.size(); i++) {
			if (cal.equals(yangList.get(i)) || cal.after(yangList.get(i))
					&& cal.before(yinList.get(i))) {
				ret = true;
			}
		}

		return ret;
	}
}
