package nines.logic.main;

import nines.logic.util.Constant;
import nines.logic.util.TwelveZodiacSigns;

/**
 * 時の九星を計算するクラス<BR>
 */
public class CalculateTimeNineStar extends AbstractCommonCalculate {

	/**
	 * 時の九星を取得します。<BR>
	 * @param date
	 * @return
	 */
	public Integer getTimeStar(String date) {

		date = date.replaceAll("/", "");
		String yyyyMMdd = date.substring(0, 8);
		String time = date.substring(9);

		// 十二時辰を取得
		TwelveZodiacSigns zodiac = getJunijishin(time);

		CalculateDateNineStar c = new CalculateDateNineStar();
		NinesDate ninesDate = c.getNiesDate(yyyyMMdd);

		switch (ninesDate.getZodiac()) {
		case Constant.NAME_NE:
		case Constant.NAME_U:
		case Constant.NAME_UMA:
		case Constant.NAME_TORI:

			if (ninesDate.isYangFlg()) {
				// 陽遁の場合
				Constant.TimeNineStarYotonGr1 yotonGr = new Constant().new TimeNineStarYotonGr1();
				return yotonGr.get(zodiac);
			} else {
				// 陰遁の場合
				Constant.TimeNineStarIntonGr1 intonGr = new Constant().new TimeNineStarIntonGr1();
				return intonGr.get(zodiac);
			}

		case Constant.NAME_USHI:
		case Constant.NAME_TATSU:
		case Constant.NAME_HITSUJI:
		case Constant.NAME_INU:

			if (ninesDate.isYangFlg()) {
				// 陽遁の場合
				Constant.TimeNineStarYotonGr2 yotonGr = new Constant().new TimeNineStarYotonGr2();
				return yotonGr.get(zodiac);
			} else {
				// 陰遁の場合
				Constant.TimeNineStarIntonGr2 intonGr = new Constant().new TimeNineStarIntonGr2();
				return intonGr.get(zodiac);
			}

		case Constant.NAME_TORA:
		case Constant.NAME_MI:
		case Constant.NAME_SARU:
		case Constant.NAME_I:

			if (ninesDate.isYangFlg()) {
				// 陽遁の場合
				Constant.TimeNineStarYotonGr3 yotonGr = new Constant().new TimeNineStarYotonGr3();
				return yotonGr.get(zodiac);
			} else {
				// 陰遁の場合
				Constant.TimeNineStarIntonGr3 intonGr = new Constant().new TimeNineStarIntonGr3();
				return intonGr.get(zodiac);
			}

		default:
			throw new IllegalArgumentException();
		}

	}

}
