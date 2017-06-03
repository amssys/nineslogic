package nines.logic.main;

import org.apache.log4j.Logger;

import nines.logic.util.Constant;
import nines.logic.util.Constant.Month;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic extends AbstractCommonNineStarKi {

	public NinesResponse createDivine(NinesRequest req) {

		final String ymdhms = req.getYmdhms();
		String year = ymdhms.substring(0, 4);
		String month = ymdhms.substring(6, 7);

		// 年家九星を取得
		Integer yearStar = getYearStar(year);
//		Map<Integer, String> map = getYearStar(year);

		getMonthStar(yearStar, month);
//		getMonthStar(map.get(Integer.valueOf(year)), month);


		NinesResponse res = new NinesResponse();
		setNineStarName(res, yearStar);





//		res.setYearStar(map.get(Integer.valueOf(year)));


		Logger logger = Logger.getRootLogger();
		logger.info("aaaaaaaaaaaaaaaa");



		/** ロジック部 */

		return res;
	}

	/**
	 * 年家九星を取得します。<BR>
	 * @param year
	 */
	private Integer getYearStar(String year) {
//	private Map<Integer, String> getYearStar(String year) {
		// 年の桁数チェック
		if (!checkDigitsOfYear(year)) throw new IllegalArgumentException("yearが不正です。");
		// 西暦を一桁づつ分解
		final int yearNum1 = Integer.valueOf(year.substring(0, 1));
		final int yearNum2 = Integer.valueOf(year.substring(1, 2));
		final int yearNum3 = Integer.valueOf(year.substring(2, 3));
		final int yearNum4 = Integer.valueOf(year.substring(3, 4));
		// 分解した数値を加算
		Integer yearSum = yearNum1 + yearNum2 + yearNum3 + yearNum4;
		Logger logger = Logger.getRootLogger();
		logger.debug("年の合計値は：" + yearSum);

		yearSum = calculateToTenLess(yearSum);

//		Integer yearStarNum = Constant.NUM_ELEVEN - yearSum;

		return Constant.NUM_ELEVEN - yearSum;

		// TODO 一時コメントアウト
//		Map<Integer, String> starMap = new HashMap<Integer, String>();
//		switch(yearStarNum) {
//		case Constant.NUM_IPPAKU_SUISEI:
//			starMap.put(yearStarNum, Constant.IPPAKU_SUISEI);
//			break;
//		case Constant.NUM_JIKOKU_DOSEI:
//			starMap.put(yearStarNum, Constant.JIKOKU_DOSEI);
//			break;
//		case Constant.NUM_SAMPEKI_MOKUSEI:
//			starMap.put(yearStarNum, Constant.SAMPEKI_MOKUSEI);
//			break;
//		case Constant.NUM_SHIROKU_MOKUSEI:
//			starMap.put(yearStarNum, Constant.SHIROKU_MOKUSEI);
//			break;
//		case Constant.NUM_GOU_DOSEI:
//			starMap.put(yearStarNum, Constant.GOU_DOSEI);
//			break;
//		case Constant.NUM_ROPPAKU_KINSEI:
//			starMap.put(yearStarNum, Constant.ROPPAKU_KINSEI);
//			break;
//		case Constant.NUM_SHICHISEKI_KINSEI:
//			starMap.put(yearStarNum, Constant.SHICHISEKI_KINSEI);
//			break;
//		case Constant.NUM_HAPPAKU_DOSEI:
//			starMap.put(yearStarNum, Constant.HAPPAKU_DOSEI);
//			break;
//		case Constant.NUM_KYUSHI_KASEI:
//			starMap.put(yearStarNum, Constant.KYUSHI_KASEI);
//			break;
//		default:
//			break;
//		}
//
//		logger.debug("年家九星は：" + starMap.get(yearStarNum));
//		return starMap;
	}

	/**
	 * 年の桁数チェックをします。<BR>
	 * @param year
	 * @return true→合格、false→不合格
	 */
	private boolean checkDigitsOfYear(String year) {
		// yearがNULLの場合は不合格
		if (year == null) return false;
		// yearの桁数が4桁以外なら不合格
		if (year.length() != 4) return false;
		// ここまでくれば合格
		return true;
	}

	/**
	 * 10以下になるよう計算します。<BR>
	 * @param yearSum
	 * @return
	 */
	private Integer calculateToTenLess(int yearSum) {
		if (Constant.NUM_TEN < yearSum) {
			String num1 = String.valueOf(yearSum).substring(0, 1);
			String num2 = String.valueOf(yearSum).substring(1, 2);
			yearSum = Integer.valueOf(num1) + Integer.valueOf(num2);
			calculateToTenLess(yearSum);
		}
		return yearSum;
	}

	/**
	 * 月家九星を取得します。<BR>
	 * @param yearStar
	 * @param month
	 */
	private void getMonthStar(Integer yearStar, String month) {
//	private void getMonthStar(String yearStar, String month) {




		Month aaa = getMonth(Integer.valueOf(month));

		yearStar = 1;

		switch (yearStar) {
		case Constant.NUM_IPPAKU_SUISEI:
		case Constant.NUM_SHIROKU_MOKUSEI:
		case Constant.NUM_SHICHISEKI_KINSEI:

			Constant.MonthStarGr1 map = new Constant().new MonthStarGr1();

			map.get(Month.FEBRUARY);


			Logger logger = Logger.getRootLogger();
			logger.debug(map.get(Month.FEBRUARY));


			break;

		case Constant.NUM_SAMPEKI_MOKUSEI:
		case Constant.NUM_ROPPAKU_KINSEI:
		case Constant.NUM_KYUSHI_KASEI:
			break;

		case Constant.NUM_JIKOKU_DOSEI:
		case Constant.NUM_GOU_DOSEI:
		case Constant.NUM_HAPPAKU_DOSEI:
			break;

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



		switch(month) {

		case 1:
			return Month.JANUARY;

		}


		return null;
	}
}
