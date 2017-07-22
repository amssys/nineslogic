package nines.logic.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import nines.logic.util.Constant;
import nines.logic.util.DateControll;
import nines.logic.util.TwentyFourSection;

/**
 * 日家九星を計算するクラス<BR>
 */
public class CalculateDateNineStar extends AbstractCommonNineStar {
	final int normalCycleNum = 20;
	final int uruuCycleNum = 3;

	/**
	 * 日家九星を取得します。
	 * @param map
	 * @param date
	 * @return
	 */
	public Map<String, Integer> getDateStar() {
		Map<String, Integer> dateMap = new HashMap<String, Integer>();

		for (DateControll d: DateControll.values()) {

			switch(d) {
			case NORMAL_TERM05:
			case NORMAL_TERM06:
			case NORMAL_TERM07:
			case NORMAL_TERM08:
			case NORMAL_TERM09:
			case NORMAL_TERM10:
			case NORMAL_TERM11:
			case NORMAL_TERM12:
				dateMap.putAll(getNormalTermMap(d));
				break;
			case URUU_TERM05:
			case URUU_TERM06:
			case URUU_TERM07:
			case URUU_TERM08:
			case URUU_TERM09:
			case URUU_TERM10:
			case URUU_TERM11:
			case URUU_TERM12:
				dateMap.putAll(getUruuTermMap(d));
				break;
			}

		}

		return dateMap;

	}

	/**
	 * 通常の期間の日家九星を求めます。
	 * @param dc
	 * @return
	 */
	private Map<String, Integer> getNormalTermMap(DateControll dc) {
		Map<String, Integer> retMap = new HashMap<String, Integer>();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		final int nextDate = 1;

		cal.setTime(dc.getStartDate());

		while (cal.getTime().before(dc.getEndDate())) {

			// 陽遁から開始する場合
			if (dc.isStartFromYangFlg()) {

				// 陽遁の日家九星を追加
				for (int i = 0; i < normalCycleNum; i++) {
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
				}

				// 隠遁の日家九星を追加
				for (int i = 0; i < normalCycleNum; i++) {
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
				}
			}

			// 隠遁から開始する場合
			else {

				// 隠遁の日家九星を追加
				for (int i = 0; i < normalCycleNum; i++) {
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
				}

				// 陽遁の日家九星を追加
				for (int i = 0; i < normalCycleNum; i++) {
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
					cal.add(Calendar.DATE, nextDate);
					retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
					cal.add(Calendar.DATE, nextDate);
				}
			}
		} // while end

		return retMap;
	}

	/**
	 * 九星の閏の期間の日家九星を求めます。
	 * @param dc
	 * @return
	 */
	private Map<String, Integer> getUruuTermMap(DateControll dc) {
		Map<String, Integer> retMap = new HashMap<String, Integer>();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		final int nextDate = 1;

		cal.setTime(dc.getStartDate());

		// 陽遁から開始する場合
		if (dc.isStartFromYangFlg()) {
			for (int i = 0; i < uruuCycleNum; i++) {
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
				cal.add(Calendar.DATE, nextDate);
			}
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
			cal.add(Calendar.DATE, nextDate);

			for (int i =0; i < uruuCycleNum; i++) {
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
				cal.add(Calendar.DATE, nextDate);
			}
		}

		// 隠遁から開始する場合
		else {
			for (int i = 0; i < uruuCycleNum; i++) {
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
				cal.add(Calendar.DATE, nextDate);
			}
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
			cal.add(Calendar.DATE, nextDate);
			retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
			cal.add(Calendar.DATE, nextDate);

			for (int i = 0;  i < uruuCycleNum; i++) {
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_IPPAKU_SUISEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_JIKOKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SAMPEKI_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHIROKU_MOKUSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_GOU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_ROPPAKU_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_SHICHISEKI_KINSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_HAPPAKU_DOSEI);
				cal.add(Calendar.DATE, nextDate);
				retMap.put(sdf.format(cal.getTime()), Constant.NUM_KYUSHI_KASEI);
				cal.add(Calendar.DATE, nextDate);
			}
		}

		return retMap;
	}

	/**
	 * 二十四節気の日付を求めます。
	 */
	private Date getSectionDate(Date date, TwentyFourSection sec) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);

		int day = (int) (sec.getDateCorrection() + (sec.getTimeCorrection() * (double)(year - 1900)))
				- (int) ((year - 1900) / 4);

		cal.set(Calendar.DATE, day);

		return cal.getTime();
	}

}
