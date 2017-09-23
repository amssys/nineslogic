package nines.logic.main;

import java.time.Month;

import nines.logic.util.Constant;
import nines.logic.util.TwelveZodiacSigns;
import nines.logic.util.TwentyFourSection;

/**
 * 共通の計算をする抽象クラス<BR>
 */
public abstract class AbstractCommonCalculate {


	/**
	 * 二十四節気を求めます。<BR>
	 * <p>
	 * 	<b>[日] ＝ INT(D + (A * (Y - 1900)) - INT((Y - 1900) / 4))</b><BR>
	 * 	<b><a href="http://www.h3.dion.ne.jp/~sakatsu/sekki24_topic.htm">参照元</a></b>
	 * </p>
	 * @param year
	 * @param tfs
	 * @return
	 */
	protected Integer getTwentyFourSeasonal(Integer year, TwentyFourSection tfs) {
		return (int)(tfs.getDateCorrection() + (tfs.getTimeCorrection() * (double)(year - Constant.BASE_YAER_1900))) - (int)((year - Constant.BASE_YAER_1900) / 4);
	}

	/**
	 * 二十四節気での月を取得します。<BR>
	 * @param month
	 * @param monthChangingDate
	 * @param day
	 * @return
	 */
	protected Month getTwentyFourSectionMonth(Month month, Integer monthChangingDate, Integer day) {
		if (day >= monthChangingDate) {
			return month;
		} else {
			return month.minus(1);
		}
	}

	/**
	 * 十二時辰を取得します。<BR>
	 * @param time
	 * @return
	 */
	protected TwelveZodiacSigns getJunijishin(String time) {
		// 時間
		Integer hour = null;
		String strHour = time.substring(0, time.indexOf(":"));

		if (time.contains("PM")) {
			hour = Integer.valueOf(strHour) +12;
		} else {
			hour = Integer.valueOf(strHour);
		}


		// TODO 23時から翌1時までは翌日の子の刻になる（後日対応）
		if (hour < 1) {

		} else if (hour < 3) {
			return TwelveZodiacSigns.OX;
		} else if (hour < 5) {
			return TwelveZodiacSigns.TIGER;
		} else if (hour < 7) {
			return TwelveZodiacSigns.RABBIT;
		} else if (hour < 9) {
			return TwelveZodiacSigns.DRAGON;
		} else if (hour < 11) {
			return TwelveZodiacSigns.SNAKE;
		} else if (hour < 13) {
			return TwelveZodiacSigns.HORSE;
		} else if (hour < 15) {
			return TwelveZodiacSigns.SHEEP;
		} else if (hour < 17) {
			return TwelveZodiacSigns.MONKEY;
		} else if (hour < 19) {
			return TwelveZodiacSigns.COCK;
		} else if (hour < 21) {
			return TwelveZodiacSigns.DOG;
		} else if (hour < 23) {
			return TwelveZodiacSigns.BOAR;

		}

		throw new IllegalArgumentException();
	}


}
