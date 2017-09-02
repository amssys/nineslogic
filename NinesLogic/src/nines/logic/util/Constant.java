package nines.logic.util;

import java.time.Month;
import java.util.EnumMap;

/**
 * 定数定義クラス<BR>
 */
public class Constant {

	/** 一白水星 */
	public static final String NAME_IPPAKU_SUISEI 		= "一白水星";
	/** 二黒土星 */
	public static final String NAME_JIKOKU_DOSEI 		= "二黒土星";
	/** 三碧木星 */
	public static final String NAME_SAMPEKI_MOKUSEI 	= "三碧木星";
	/** 四緑木星 */
	public static final String NAME_SHIROKU_MOKUSEI 	= "四緑木星";
	/** 五黄土星 */
	public static final String NAME_GOU_DOSEI 			= "五黄土星";
	/** 六白金星 */
	public static final String NAME_ROPPAKU_KINSEI		= "六白金星";
	/** 七赤金星 */
	public static final String NAME_SHICHISEKI_KINSEI	= "七赤金星";
	/** 八白土星 */
	public static final String NAME_HAPPAKU_DOSEI 		= "八白土星";
	/** 九紫火星 */
	public static final String NAME_KYUSHI_KASEI 		= "九紫火星";

	/** 一白水星 */
	public static final int NUM_IPPAKU_SUISEI		= 1;
	/** 二黒土星 */
	public static final int NUM_JIKOKU_DOSEI 		= 2;
	/** 三碧木星 */
	public static final int NUM_SAMPEKI_MOKUSEI 	= 3;
	/** 四緑木星 */
	public static final int NUM_SHIROKU_MOKUSEI 	= 4;
	/** 五黄土星 */
	public static final int NUM_GOU_DOSEI			= 5;
	/** 六白金星 */
	public static final int NUM_ROPPAKU_KINSEI		= 6;
	/** 七赤金星 */
	public static final int NUM_SHICHISEKI_KINSEI	= 7;
	/** 八白土星 */
	public static final int NUM_HAPPAKU_DOSEI		= 8;
	/** 九紫火星 */
	public static final int NUM_KYUSHI_KASEI		= 9;

	/** 10 */
	public static final int NUM_TEN					= 10;
	/** 11 */
	public static final int NUM_ELEVEN 				= 11;

	/** 基準年 */
	public static final int BASE_YAER_1900 = 1900;


	/**
	 * 月家九星のグループ1クラス<BR>
	 * <b>グループ1は年家九星が<BR>
	 *    一白水星、四緑木星、七赤金星
	 * </b>
	 */
	public class MonthStarGr1 {

		private EnumMap<Month, Integer> monthStarGr1;

		public MonthStarGr1() {
			monthStarGr1 = new EnumMap<Month, Integer>(Month.class);
			monthStarGr1.put(Month.JANUARY, NUM_ROPPAKU_KINSEI);
			monthStarGr1.put(Month.FEBRUARY, NUM_HAPPAKU_DOSEI);
			monthStarGr1.put(Month.MARCH, NUM_SHICHISEKI_KINSEI);
			monthStarGr1.put(Month.APRIL, NUM_ROPPAKU_KINSEI);
			monthStarGr1.put(Month.MAY, NUM_GOU_DOSEI);
			monthStarGr1.put(Month.JUNE, NUM_SHIROKU_MOKUSEI);
			monthStarGr1.put(Month.JULY, NUM_SAMPEKI_MOKUSEI);
			monthStarGr1.put(Month.AUGUST, NUM_JIKOKU_DOSEI);
			monthStarGr1.put(Month.SEPTEMBER, NUM_IPPAKU_SUISEI);
			monthStarGr1.put(Month.OCTOBER, NUM_KYUSHI_KASEI);
			monthStarGr1.put(Month.NOVEMBER, NUM_HAPPAKU_DOSEI);
			monthStarGr1.put(Month.DECEMBER, NUM_SHICHISEKI_KINSEI);
		}


		public Integer get(Month month) {
			return this.monthStarGr1.get(month);
		}
	}

	/**
	 * 月家九星のグループ2クラス<BR>
	 * <b>グループ2は年家九星が<BR>
	 *    三碧木星、六白金星、九紫火星
	 * </b>
	 */
	public class MonthStarGr2 {

		private EnumMap<Month, Integer> monthStarGr2;

		public MonthStarGr2() {
			monthStarGr2 = new EnumMap<Month, Integer>(Month.class);
			monthStarGr2.put(Month.JANUARY, NUM_ROPPAKU_KINSEI);
			monthStarGr2.put(Month.FEBRUARY, NUM_HAPPAKU_DOSEI);
			monthStarGr2.put(Month.MARCH, NUM_SHICHISEKI_KINSEI);
			monthStarGr2.put(Month.APRIL, NUM_ROPPAKU_KINSEI);
			monthStarGr2.put(Month.MAY, NUM_GOU_DOSEI);
			monthStarGr2.put(Month.JUNE, NUM_SHIROKU_MOKUSEI);
			monthStarGr2.put(Month.JULY, NUM_SAMPEKI_MOKUSEI);
			monthStarGr2.put(Month.AUGUST, NUM_JIKOKU_DOSEI);
			monthStarGr2.put(Month.SEPTEMBER, NUM_IPPAKU_SUISEI);
			monthStarGr2.put(Month.OCTOBER, NUM_KYUSHI_KASEI);
			monthStarGr2.put(Month.NOVEMBER, NUM_HAPPAKU_DOSEI);
			monthStarGr2.put(Month.DECEMBER, NUM_SHICHISEKI_KINSEI);
		}

		public Integer get(Month month) {
			return this.monthStarGr2.get(month);
		}
	}

	/**
	 * 月家九星のグループ3クラス<BR>
	 * <b>グループ3は年家九星が<BR>
	 *    二黒土星、五黄土星、八白土星
	 * </b>
	 */
	public class MonthStarGr3 {

		private EnumMap<Month, Integer> monthStarGr3;

		public MonthStarGr3() {
			monthStarGr3 = new EnumMap<Month, Integer>(Month.class);
			monthStarGr3.put(Month.JANUARY, NUM_KYUSHI_KASEI);
			monthStarGr3.put(Month.FEBRUARY, NUM_JIKOKU_DOSEI);
			monthStarGr3.put(Month.MARCH, NUM_IPPAKU_SUISEI);
			monthStarGr3.put(Month.APRIL, NUM_KYUSHI_KASEI);
			monthStarGr3.put(Month.MAY, NUM_HAPPAKU_DOSEI);
			monthStarGr3.put(Month.JUNE, NUM_SHICHISEKI_KINSEI);
			monthStarGr3.put(Month.JULY, NUM_ROPPAKU_KINSEI);
			monthStarGr3.put(Month.AUGUST, NUM_GOU_DOSEI);
			monthStarGr3.put(Month.SEPTEMBER, NUM_SHIROKU_MOKUSEI);
			monthStarGr3.put(Month.OCTOBER, NUM_SAMPEKI_MOKUSEI);
			monthStarGr3.put(Month.NOVEMBER, NUM_JIKOKU_DOSEI);
			monthStarGr3.put(Month.DECEMBER, NUM_IPPAKU_SUISEI);
		}


		public Integer get(Month month) {
			return this.monthStarGr3.get(month);
		}
	}


}
