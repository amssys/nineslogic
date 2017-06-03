package nines.logic.main;

import nines.logic.util.Constant;
import nines.logic.util.Constant.Month;

/**
 * 月家九星を計算するクラス<BR>
 */
public class CalculateMonthNineStar {


	/**
	 * 月家九星を取得します。<BR>
	 * @param yearStar
	 * @param monthValue
	 * @return
	 */
	public Integer getMonthStar(Integer yearStar, String monthValue) {

		Month month = getMonth(Integer.valueOf(monthValue));

		switch (yearStar) {
		case Constant.NUM_IPPAKU_SUISEI:
		case Constant.NUM_SHIROKU_MOKUSEI:
		case Constant.NUM_SHICHISEKI_KINSEI:

			Constant.MonthStarGr1 mapGr1 = new Constant().new MonthStarGr1();
			return mapGr1.get(month);

		case Constant.NUM_SAMPEKI_MOKUSEI:
		case Constant.NUM_ROPPAKU_KINSEI:
		case Constant.NUM_KYUSHI_KASEI:
			Constant.MonthStarGr2 mapGr2 = new Constant().new MonthStarGr2();
			return mapGr2.get(month);

		case Constant.NUM_JIKOKU_DOSEI:
		case Constant.NUM_GOU_DOSEI:
		case Constant.NUM_HAPPAKU_DOSEI:
			Constant.MonthStarGr3 mapGr3 = new Constant().new MonthStarGr3();
			return mapGr3.get(month);

		default:
			throw new IllegalArgumentException();
		}

	}

	/**
	 * 月を取得します。<BR>
	 * @param month
	 * @return
	 */
	private Month getMonth(Integer month) {

		switch (month) {
		case 1:
			return Month.JANUARY;
		case 2:
			return Month.FEBRUARY;
		case 3:
			return Month.MARCH;
		case 4:
			return Month.APRIL;
		case 5:
			return Month.MAY;
		case 6:
			return Month.JUNE;
		case 7:
			return Month.JULY;
		case 8:
			return Month.AUGUST;
		case 9:
			return Month.SEPTEMBER;
		case 10:
			return Month.OCTOBER;
		case 11:
			return Month.NOVEMBER;
		case 12:
			return Month.DECEMBER;

		}

		return null;
	}

}
