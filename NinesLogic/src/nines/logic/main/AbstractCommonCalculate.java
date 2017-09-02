package nines.logic.main;

import java.time.Month;

import nines.logic.util.Constant;
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


}
