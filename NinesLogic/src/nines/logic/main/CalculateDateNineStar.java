package nines.logic.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import nines.logic.util.Constant;
import nines.logic.util.DateControll;
import nines.logic.util.SixtyZodiac;
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

	/**
	 * 九星の要素を持つ日付を求めます。
	 * @param dateStr 求める日付("yyyyMMdd" or "yyyy/MM/dd")
	 * @return 九星の要素を持つ日付
	 */
	public NinesDate getNiesDate(String dateStr) {
		NinesDate retNinesDate = new NinesDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		Map<String, Integer> dateMap = getDateStar();

		// 日付の"/"を除去
		dateStr = dateStr.replace("/", "");

		try {
			date = sdf.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (DateControll dc: DateControll.values()) {
			Date baseDate = dc.getStartDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(baseDate);

			// 対象の日付が、期間の開始日と同じ、またはそれより後である場合
			//  かつ、対象の日付が、期間の終了日と同じ、またはそれより前である場合
			if ((date.equals(dc.getStartDate()) || date.after(dc.getStartDate()))
					&& (date.equals(dc.getEndDate()) || date.before(dc.getEndDate()))) {

				// 初期設定
				retNinesDate.setDate(baseDate);
				retNinesDate.setSixtyZodiac(SixtyZodiac.KINOE_NE);

				// 対象の日付と一致する日付を探す
				while (!date.equals(retNinesDate.getDate())) {
					retNinesDate = retNinesDate.getNextDate();
				}

				if (date.equals(retNinesDate.getDate())) {
					// 日家九星の数値を設定する
					retNinesDate.setDateStar(dateMap.get(sdf.format(retNinesDate.getDate())));
					// 陽遁フラグを設定する
					retNinesDate.setYangFlg(getYangFlg(dc, date));
				}

			}
		}

		return retNinesDate;

	}

	/**
	 * 陽遁フラグを取得します。
	 */
	private boolean getYangFlg(DateControll dc, Date date) {
		boolean ret = false;

		switch(dc) {
		case NORMAL_TERM05:
		case NORMAL_TERM06:
		case NORMAL_TERM07:
		case NORMAL_TERM08:
		case NORMAL_TERM09:
		case NORMAL_TERM10:
		case NORMAL_TERM11:
		case NORMAL_TERM12:
			ret = getYangFlgInNormalTerm(dc, date);
			break;
		case URUU_TERM05:
		case URUU_TERM06:
		case URUU_TERM07:
		case URUU_TERM08:
		case URUU_TERM09:
		case URUU_TERM10:
		case URUU_TERM11:
		case URUU_TERM12:
			ret = getYangFlgInUruuTerm(dc, date);
			break;
		}

		return ret;

	}

	private boolean getYangFlgInNormalTerm(DateControll dc, Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dc.getStartDate());
		int nextDate = 1;
		boolean ret = false;


		// 期間が陽遁から開始する場合
		if (dc.isStartFromYangFlg()) {

			while (!cal.getTime().after(dc.getEndDate())) {

				// 陽遁の場合
				for (int i = 0; i < normalCycleNum; i++) {

					for (int j = 0; j < 9; j++) {

						if (date.equals(cal.getTime())) {
							return true;
						}
						cal.add(Calendar.DATE, nextDate);

					}
				}

				// 隠遁の場合
				for (int i = 0; i < normalCycleNum; i++) {

					for (int j = 0; j < 9; j++) {

						if (date.equals(cal.getTime())) {
							return false;
						}
						cal.add(Calendar.DATE, nextDate);

					}

				}
			} // while end

		}

		// 期間が隠遁から開始する場合
		else {

			while (!cal.getTime().after(dc.getEndDate())) {

				// 隠遁の場合
				for (int i = 0; i < normalCycleNum; i++) {

					for (int j = 0; j < 9; j++) {

						if (date.equals(cal.getTime())) {
							return false;
						}
						cal.add(Calendar.DATE, nextDate);

					}

				}

				// 陽遁の場合
				for (int i = 0; i < normalCycleNum; i++) {

					for (int j = 0; j < 9; j++) {

						if (date.equals(cal.getTime())) {
							return true;
						}
						cal.add(Calendar.DATE, nextDate);

					}
				}
			} // while end

		}

		return ret;

	}

	private boolean getYangFlgInUruuTerm(DateControll dc, Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dc.getStartDate());
		int nextDate = 1;
		boolean ret = false;


		// 期間が陽遁から開始する場合
		if (dc.isStartFromYangFlg()) {

			// 陽遁の場合
			for (int i = 0; i < uruuCycleNum; i++) {

				for (int j = 0; j < 9; j++) {

					if (date.equals(cal.getTime())) {
						return true;
					}
					cal.add(Calendar.DATE, nextDate);

				}
			}

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			// 隠遁の場合
			for (int i = 0; i < uruuCycleNum; i++) {

				for (int j = 0; j < 9; j++) {

					if (date.equals(cal.getTime())) {
						return false;
					}
					cal.add(Calendar.DATE, nextDate);

				}

			}

		}

		// 期間が隠遁から開始する場合
		else {

			// 隠遁の場合
			for (int i = 0; i < uruuCycleNum; i++) {

				for (int j = 0; j < 9; j++) {

					if (date.equals(cal.getTime())) {
						return false;
					}
					cal.add(Calendar.DATE, nextDate);

				}

			}

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return false;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			if (date.equals(cal.getTime())) {
				return true;
			}
			cal.add(Calendar.DATE, nextDate);

			// 陽遁の場合
			for (int i = 0; i < uruuCycleNum; i++) {

				for (int j = 0; j < 9; j++) {

					if (date.equals(cal.getTime())) {
						return true;
					}
					cal.add(Calendar.DATE, nextDate);

				}
			}

		}

		return ret;

	}
}
