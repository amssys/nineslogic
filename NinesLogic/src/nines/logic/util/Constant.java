package nines.logic.util;

import java.util.EnumMap;

/**
 * 定数定義クラス<BR>
 */
public class Constant {

	/** 一白水星 */
	public static final String IPPAKU_SUISEI 		= "一白水星";
	/** 二黒土星 */
	public static final String JIKOKU_DOSEI 		= "二黒土星";
	/** 三碧木星 */
	public static final String SAMPEKI_MOKUSEI 	= "三碧木星";
	/** 四緑木星 */
	public static final String SHIROKU_MOKUSEI 	= "四緑木星";
	/** 五黄土星 */
	public static final String GOU_DOSEI 			= "五黄土星";
	/** 六白金星 */
	public static final String ROPPAKU_KINSEI		= "六白金星";
	/** 七赤金星 */
	public static final String SHICHISEKI_KINSEI 	= "七赤金星";
	/** 八白土星 */
	public static final String HAPPAKU_DOSEI 		= "八白土星";
	/** 九紫火星 */
	public static final String KYUSHI_KASEI 		= "九紫火星";

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
	public static final int NUM_ROPPAKU_KINSEI	= 6;
	/** 七赤金星 */
	public static final int NUM_SHICHISEKI_KINSEI	= 7;
	/** 八白土星 */
	public static final int NUM_HAPPAKU_DOSEI		= 8;
	/** 九紫火星 */
	public static final int NUM_KYUSHI_KASEI		= 9;


	/** 基準年 */
	public static final int BASE_YAER = 1909;

	/** 月 */
	public static enum Month {
		JANUARY(1)
		, FEBRUARY(2)
		, MARCH(3)
		, APRIL(4)
		, MAY(5)
		, JUNE(6)
		, JULY(7)
		, AUGUST(8)
		, SEPTEMBER(9)
		, OCTOBER(10)
		, NOVEMBER(11)
		, DECEMBER(12);


		private final int month;

		private Month(final int month) {
			this.month = month;
		}

		public int getInt() {
			return this.month;
		}
	}


	/**
	 * 月家九星のグループ1クラス<BR>
	 * <b>グループ1は年家九星が<BR>
	 *    一白水星、四緑木星、七赤金星
	 * </b>
	 */
	public class MonthStarGr1 {

		private EnumMap<Month, String> monthStarGr1;

		public MonthStarGr1() {
			monthStarGr1 = new EnumMap<Month, String>(Month.class);
			monthStarGr1.put(Month.JANUARY, ROPPAKU_KINSEI);
			monthStarGr1.put(Month.FEBRUARY, HAPPAKU_DOSEI);
			monthStarGr1.put(Month.MARCH, SHICHISEKI_KINSEI);
			monthStarGr1.put(Month.APRIL, ROPPAKU_KINSEI);
			monthStarGr1.put(Month.MAY, GOU_DOSEI);
			monthStarGr1.put(Month.JUNE, SHIROKU_MOKUSEI);
			monthStarGr1.put(Month.JULY, SAMPEKI_MOKUSEI);
			monthStarGr1.put(Month.AUGUST, JIKOKU_DOSEI);
			monthStarGr1.put(Month.SEPTEMBER, IPPAKU_SUISEI);
			monthStarGr1.put(Month.OCTOBER, KYUSHI_KASEI);
			monthStarGr1.put(Month.NOVEMBER, HAPPAKU_DOSEI);
			monthStarGr1.put(Month.DECEMBER, SHICHISEKI_KINSEI);
		}
	}

	/**
	 * 月家九星のグループ2クラス<BR>
	 * <b>グループ2は年家九星が<BR>
	 *    三碧木星、六白金星、九紫火星
	 * </b>
	 */
	public class MonthStarGr2 {

		private EnumMap<Month, String> monthStarGr2;

		public MonthStarGr2() {
			monthStarGr2 = new EnumMap<Month, String>(Month.class);
			monthStarGr2.put(Month.JANUARY, SAMPEKI_MOKUSEI);
			monthStarGr2.put(Month.FEBRUARY, GOU_DOSEI);
			monthStarGr2.put(Month.MARCH, SHIROKU_MOKUSEI);
			monthStarGr2.put(Month.APRIL, SAMPEKI_MOKUSEI);
			monthStarGr2.put(Month.MAY, JIKOKU_DOSEI);
			monthStarGr2.put(Month.JUNE, IPPAKU_SUISEI);
			monthStarGr2.put(Month.JULY, KYUSHI_KASEI);
			monthStarGr2.put(Month.AUGUST, HAPPAKU_DOSEI);
			monthStarGr2.put(Month.SEPTEMBER, SHICHISEKI_KINSEI);
			monthStarGr2.put(Month.OCTOBER, ROPPAKU_KINSEI);
			monthStarGr2.put(Month.NOVEMBER, GOU_DOSEI);
			monthStarGr2.put(Month.DECEMBER, SHIROKU_MOKUSEI);
		}
	}

	/**
	 * 月家九星のグループ3クラス<BR>
	 * <b>グループ3は年家九星が<BR>
	 *    二黒土星、五黄土星、八白土星
	 * </b>
	 */
	public class MonthStarGr3 {

		private EnumMap<Month, String> monthStarGr3;

		public MonthStarGr3() {
			monthStarGr3 = new EnumMap<Month, String>(Month.class);
			monthStarGr3.put(Month.JANUARY, KYUSHI_KASEI);
			monthStarGr3.put(Month.FEBRUARY, JIKOKU_DOSEI);
			monthStarGr3.put(Month.MARCH, IPPAKU_SUISEI);
			monthStarGr3.put(Month.APRIL, KYUSHI_KASEI);
			monthStarGr3.put(Month.MAY, HAPPAKU_DOSEI);
			monthStarGr3.put(Month.JUNE, SHICHISEKI_KINSEI);
			monthStarGr3.put(Month.JULY, ROPPAKU_KINSEI);
			monthStarGr3.put(Month.AUGUST, GOU_DOSEI);
			monthStarGr3.put(Month.SEPTEMBER, SHIROKU_MOKUSEI);
			monthStarGr3.put(Month.OCTOBER, SAMPEKI_MOKUSEI);
			monthStarGr3.put(Month.NOVEMBER, JIKOKU_DOSEI);
			monthStarGr3.put(Month.DECEMBER, IPPAKU_SUISEI);
		}
	}


}
