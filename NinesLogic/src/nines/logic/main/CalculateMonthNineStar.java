package nines.logic.main;

import java.time.Month;

import nines.logic.util.Constant;
import nines.logic.util.TwentyFourSection;

/**
 * 月家九星を計算するクラス<BR>
 */
public class CalculateMonthNineStar extends AbstractCommonCalculate {


	/**
	 * 月家九星を取得します。<BR>
	 * @param yearStar
	 * @param monthValue
	 * @param dayValue
	 * @return
	 */
	public Integer getMonthStar(String yearValue, String monthValue, String dayValue, Integer yearStar) {

		Month month = getMonth(Integer.valueOf(yearValue), Integer.valueOf(monthValue), Integer.valueOf(dayValue));

		switch (yearStar) {
		case Constant.NUM_IPPAKU_SUISEI:
		case Constant.NUM_SHIROKU_MOKUSEI:
		case Constant.NUM_SHICHISEKI_KINSEI:
			Constant.MonthNineStarGr1 mapGr1 = new Constant().new MonthNineStarGr1();
			return mapGr1.get(month);

		case Constant.NUM_SAMPEKI_MOKUSEI:
		case Constant.NUM_ROPPAKU_KINSEI:
		case Constant.NUM_KYUSHI_KASEI:
			Constant.MonthNineStarGr2 mapGr2 = new Constant().new MonthNineStarGr2();
			return mapGr2.get(month);

		case Constant.NUM_JIKOKU_DOSEI:
		case Constant.NUM_GOU_DOSEI:
		case Constant.NUM_HAPPAKU_DOSEI:
			Constant.MonthNineStarGr3 mapGr3 = new Constant().new MonthNineStarGr3();
			return mapGr3.get(month);

		default:
			throw new IllegalArgumentException();
		}

	}

	/**
	 * 月を取得します。<BR>
	 * @param month
	 * @param month
	 * @param day
	 * @return
	 */
	private Month getMonth(Integer year, Integer month, Integer day) {
		// 月の切替わり日
		Integer monthChangingDate = null;
		switch (month) {
		case 1:
			monthChangingDate = getTwentyFourSeasonal(year - 1, TwentyFourSection.Shokan);
			return getTwentyFourSectionMonth(Month.JANUARY, monthChangingDate, day);
		case 2:
			monthChangingDate = getTwentyFourSeasonal(year - 1, TwentyFourSection.FirstOfSpring);
			return getTwentyFourSectionMonth(Month.FEBRUARY, monthChangingDate, day);
		case 3:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Keichitsu);
			return getTwentyFourSectionMonth(Month.MARCH, monthChangingDate, day);
		case 4:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Seimei);
			return getTwentyFourSectionMonth(Month.APRIL, monthChangingDate, day);
		case 5:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Rikka);
			return getTwentyFourSectionMonth(Month.MAY, monthChangingDate, day);
		case 6:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Boshu);
			return getTwentyFourSectionMonth(Month.JUNE, monthChangingDate, day);
		case 7:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Shosho);
			return getTwentyFourSectionMonth(Month.JULY, monthChangingDate, day);
		case 8:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Risshu);
			return getTwentyFourSectionMonth(Month.AUGUST, monthChangingDate, day);
		case 9:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Hakuro);
			return getTwentyFourSectionMonth(Month.SEPTEMBER, monthChangingDate, day);
		case 10:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Kanro);
			return getTwentyFourSectionMonth(Month.OCTOBER, monthChangingDate, day);
		case 11:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Ritto);
			return getTwentyFourSectionMonth(Month.NOVEMBER, monthChangingDate, day);
		case 12:
			monthChangingDate = getTwentyFourSeasonal(year, TwentyFourSection.Taisetsu);
			return getTwentyFourSectionMonth(Month.DECEMBER, monthChangingDate, day);

		}

		return null;
	}

}
