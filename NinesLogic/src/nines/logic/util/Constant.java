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

	/** 十二支：子 */
	public static final String NAME_NE 		= "子";
	/** 十二支：丑 */
	public static final String NAME_USHI 	= "丑";
	/** 十二支：寅 */
	public static final String NAME_TORA 	= "寅";
	/** 十二支：卯 */
	public static final String NAME_U			= "卯";
	/** 十二支：辰 */
	public static final String NAME_TATSU 	= "辰";
	/** 十二支：巳 */
	public static final String NAME_MI 		= "巳";
	/** 十二支：午 */
	public static final String NAME_UMA 		= "午";
	/** 十二支：未 */
	public static final String NAME_HITSUJI 	= "未";
	/** 十二支：申 */
	public static final String NAME_SARU 	= "申";
	/** 十二支：酉 */
	public static final String NAME_TORI 	= "酉";
	/** 十二支：戌 */
	public static final String NAME_INU 		= "戌";
	/** 十二支：亥 */
	public static final String NAME_I 		= "亥";


	/**
	 * 月家九星のグループ1クラス<BR>
	 * <b>グループ1は年家九星が<BR>
	 *    一白水星、四緑木星、七赤金星
	 * </b>
	 */
	public class MonthNineStarGr1 {

		private EnumMap<Month, Integer> monthNineStarGr1;

		public MonthNineStarGr1() {
			monthNineStarGr1 = new EnumMap<Month, Integer>(Month.class);
			monthNineStarGr1.put(Month.JANUARY, NUM_ROPPAKU_KINSEI);
			monthNineStarGr1.put(Month.FEBRUARY, NUM_HAPPAKU_DOSEI);
			monthNineStarGr1.put(Month.MARCH, NUM_SHICHISEKI_KINSEI);
			monthNineStarGr1.put(Month.APRIL, NUM_ROPPAKU_KINSEI);
			monthNineStarGr1.put(Month.MAY, NUM_GOU_DOSEI);
			monthNineStarGr1.put(Month.JUNE, NUM_SHIROKU_MOKUSEI);
			monthNineStarGr1.put(Month.JULY, NUM_SAMPEKI_MOKUSEI);
			monthNineStarGr1.put(Month.AUGUST, NUM_JIKOKU_DOSEI);
			monthNineStarGr1.put(Month.SEPTEMBER, NUM_IPPAKU_SUISEI);
			monthNineStarGr1.put(Month.OCTOBER, NUM_KYUSHI_KASEI);
			monthNineStarGr1.put(Month.NOVEMBER, NUM_HAPPAKU_DOSEI);
			monthNineStarGr1.put(Month.DECEMBER, NUM_SHICHISEKI_KINSEI);
		}


		public Integer get(Month month) {
			return this.monthNineStarGr1.get(month);
		}
	}

	/**
	 * 月家九星のグループ2クラス<BR>
	 * <b>グループ2は年家九星が<BR>
	 *    三碧木星、六白金星、九紫火星
	 * </b>
	 */
	public class MonthNineStarGr2 {

		private EnumMap<Month, Integer> monthNineStarGr2;

		public MonthNineStarGr2() {
			monthNineStarGr2 = new EnumMap<Month, Integer>(Month.class);

			monthNineStarGr2.put(Month.JANUARY, NUM_SAMPEKI_MOKUSEI);
			monthNineStarGr2.put(Month.FEBRUARY, NUM_GOU_DOSEI);
			monthNineStarGr2.put(Month.MARCH, NUM_SHIROKU_MOKUSEI);
			monthNineStarGr2.put(Month.APRIL, NUM_SAMPEKI_MOKUSEI);
			monthNineStarGr2.put(Month.MAY, NUM_JIKOKU_DOSEI);
			monthNineStarGr2.put(Month.JUNE, NUM_IPPAKU_SUISEI);
			monthNineStarGr2.put(Month.JULY, NUM_KYUSHI_KASEI);
			monthNineStarGr2.put(Month.AUGUST, NUM_HAPPAKU_DOSEI);
			monthNineStarGr2.put(Month.SEPTEMBER, NUM_SHICHISEKI_KINSEI);
			monthNineStarGr2.put(Month.OCTOBER, NUM_ROPPAKU_KINSEI);
			monthNineStarGr2.put(Month.NOVEMBER, NUM_GOU_DOSEI);
			monthNineStarGr2.put(Month.DECEMBER, NUM_SHIROKU_MOKUSEI);
		}

		public Integer get(Month month) {
			return this.monthNineStarGr2.get(month);
		}
	}

	/**
	 * 月家九星のグループ3クラス<BR>
	 * <b>グループ3は年家九星が<BR>
	 *    二黒土星、五黄土星、八白土星
	 * </b>
	 */
	public class MonthNineStarGr3 {

		private EnumMap<Month, Integer> monthNineStarGr3;

		public MonthNineStarGr3() {
			monthNineStarGr3 = new EnumMap<Month, Integer>(Month.class);
			monthNineStarGr3.put(Month.JANUARY, NUM_KYUSHI_KASEI);
			monthNineStarGr3.put(Month.FEBRUARY, NUM_JIKOKU_DOSEI);
			monthNineStarGr3.put(Month.MARCH, NUM_IPPAKU_SUISEI);
			monthNineStarGr3.put(Month.APRIL, NUM_KYUSHI_KASEI);
			monthNineStarGr3.put(Month.MAY, NUM_HAPPAKU_DOSEI);
			monthNineStarGr3.put(Month.JUNE, NUM_SHICHISEKI_KINSEI);
			monthNineStarGr3.put(Month.JULY, NUM_ROPPAKU_KINSEI);
			monthNineStarGr3.put(Month.AUGUST, NUM_GOU_DOSEI);
			monthNineStarGr3.put(Month.SEPTEMBER, NUM_SHIROKU_MOKUSEI);
			monthNineStarGr3.put(Month.OCTOBER, NUM_SAMPEKI_MOKUSEI);
			monthNineStarGr3.put(Month.NOVEMBER, NUM_JIKOKU_DOSEI);
			monthNineStarGr3.put(Month.DECEMBER, NUM_IPPAKU_SUISEI);
		}


		public Integer get(Month month) {
			return this.monthNineStarGr3.get(month);
		}
	}

	/**
	 * 時の九星陽遁グループ1クラス<BR>
	 * <b>グループ1は日家九星が<BR>
	 *    子、卯、午、酉
	 * </b>
	 */
	public class TimeNineStarYotonGr1 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarYotonGr1;

		public TimeNineStarYotonGr1() {
			timeNineStarYotonGr1 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.MOUSE, NUM_IPPAKU_SUISEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.OX, NUM_JIKOKU_DOSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.TIGER, NUM_SAMPEKI_MOKUSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.RABBIT, NUM_SHIROKU_MOKUSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.DRAGON, NUM_GOU_DOSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.SNAKE, NUM_ROPPAKU_KINSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.HORSE, NUM_SHICHISEKI_KINSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.SHEEP, NUM_HAPPAKU_DOSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.MONKEY, NUM_KYUSHI_KASEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.COCK, NUM_IPPAKU_SUISEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.DOG, NUM_JIKOKU_DOSEI);
			timeNineStarYotonGr1.put(TwelveZodiacSigns.BOAR, NUM_SAMPEKI_MOKUSEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarYotonGr1.get(zodiac);
		}
	}

	/**
	 * 時の九星陽遁グループ2クラス<BR>
	 * <b>グループ2は日家九星が<BR>
	 *    丑、辰、未、戌
	 * </b>
	 */
	public class TimeNineStarYotonGr2 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarYotonGr2;

		public TimeNineStarYotonGr2() {
			timeNineStarYotonGr2 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.MOUSE, NUM_SHIROKU_MOKUSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.OX, NUM_GOU_DOSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.TIGER, NUM_ROPPAKU_KINSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.RABBIT, NUM_SHICHISEKI_KINSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.DRAGON, NUM_HAPPAKU_DOSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.SNAKE, NUM_KYUSHI_KASEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.HORSE, NUM_IPPAKU_SUISEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.SHEEP, NUM_JIKOKU_DOSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.MONKEY, NUM_SAMPEKI_MOKUSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.COCK, NUM_SHIROKU_MOKUSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.DOG, NUM_GOU_DOSEI);
			timeNineStarYotonGr2.put(TwelveZodiacSigns.BOAR, NUM_ROPPAKU_KINSEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarYotonGr2.get(zodiac);
		}
	}

	/**
	 * 時の九星陽遁グループ3クラス<BR>
	 * <b>グループ3は日家九星が<BR>
	 *    寅、巳、申、亥
	 * </b>
	 */
	public class TimeNineStarYotonGr3 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarYotonGr3;

		public TimeNineStarYotonGr3() {
			timeNineStarYotonGr3 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.MOUSE, NUM_SHICHISEKI_KINSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.OX, NUM_HAPPAKU_DOSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.TIGER, NUM_KYUSHI_KASEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.RABBIT, NUM_IPPAKU_SUISEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.DRAGON, NUM_JIKOKU_DOSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.SNAKE, NUM_SAMPEKI_MOKUSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.HORSE, NUM_SHIROKU_MOKUSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.SHEEP, NUM_GOU_DOSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.MONKEY, NUM_ROPPAKU_KINSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.COCK, NUM_SHICHISEKI_KINSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.DOG, NUM_HAPPAKU_DOSEI);
			timeNineStarYotonGr3.put(TwelveZodiacSigns.BOAR, NUM_KYUSHI_KASEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarYotonGr3.get(zodiac);
		}
	}

	/**
	 * 時の九星陰遁グループ1クラス<BR>
	 * <b>グループ1は日家九星が<BR>
	 *    子、卯、午、酉
	 * </b>
	 */
	public class TimeNineStarIntonGr1 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarIntoGr1;

		public TimeNineStarIntonGr1() {
			timeNineStarIntoGr1 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.MOUSE, NUM_KYUSHI_KASEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.OX, NUM_HAPPAKU_DOSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.TIGER, NUM_SHICHISEKI_KINSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.RABBIT, NUM_ROPPAKU_KINSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.DRAGON, NUM_GOU_DOSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.SNAKE, NUM_SHIROKU_MOKUSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.HORSE, NUM_SAMPEKI_MOKUSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.SHEEP, NUM_JIKOKU_DOSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.MONKEY, NUM_IPPAKU_SUISEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.COCK, NUM_KYUSHI_KASEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.DOG, NUM_HAPPAKU_DOSEI);
			timeNineStarIntoGr1.put(TwelveZodiacSigns.BOAR, NUM_SHICHISEKI_KINSEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarIntoGr1.get(zodiac);
		}
	}

	/**
	 * 時の九星陰遁グループ2クラス<BR>
	 * <b>グループ2は日家九星が<BR>
	 *    丑、辰、未、戌
	 * </b>
	 */
	public class TimeNineStarIntonGr2 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarIntonGr2;

		public TimeNineStarIntonGr2() {
			timeNineStarIntonGr2 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.MOUSE, NUM_ROPPAKU_KINSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.OX, NUM_GOU_DOSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.TIGER, NUM_SHIROKU_MOKUSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.RABBIT, NUM_SAMPEKI_MOKUSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.DRAGON, NUM_JIKOKU_DOSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.SNAKE, NUM_IPPAKU_SUISEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.HORSE, NUM_KYUSHI_KASEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.SHEEP, NUM_HAPPAKU_DOSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.MONKEY, NUM_SHICHISEKI_KINSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.COCK, NUM_ROPPAKU_KINSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.DOG, NUM_GOU_DOSEI);
			timeNineStarIntonGr2.put(TwelveZodiacSigns.BOAR, NUM_SHIROKU_MOKUSEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarIntonGr2.get(zodiac);
		}
	}

	/**
	 * 時の九星陽遁グループ3クラス<BR>
	 * <b>グループ3は日家九星が<BR>
	 *    寅、巳、申、亥
	 * </b>
	 */
	public class TimeNineStarIntonGr3 {

		private EnumMap<TwelveZodiacSigns, Integer> timeNineStarIntonGr3;

		public TimeNineStarIntonGr3() {
			timeNineStarIntonGr3 = new EnumMap<TwelveZodiacSigns, Integer>(TwelveZodiacSigns.class);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.MOUSE, NUM_SAMPEKI_MOKUSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.OX, NUM_JIKOKU_DOSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.TIGER, NUM_IPPAKU_SUISEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.RABBIT, NUM_KYUSHI_KASEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.DRAGON, NUM_HAPPAKU_DOSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.SNAKE, NUM_SHICHISEKI_KINSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.HORSE, NUM_ROPPAKU_KINSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.SHEEP, NUM_GOU_DOSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.MONKEY, NUM_SHIROKU_MOKUSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.COCK, NUM_SAMPEKI_MOKUSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.DOG, NUM_JIKOKU_DOSEI);
			timeNineStarIntonGr3.put(TwelveZodiacSigns.BOAR, NUM_IPPAKU_SUISEI);
		}


		public Integer get(TwelveZodiacSigns zodiac) {
			return this.timeNineStarIntonGr3.get(zodiac);
		}
	}


}
