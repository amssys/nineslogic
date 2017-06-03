package nines.logic.main;

import nines.logic.util.Constant;

/**
 * 年家九星を計算するクラス<BR>
 */
public class CalculateYearNineStar {


	/**
	 * 年家九星を取得します。<BR>
	 * @param year
	 */
	public Integer getYearStar(String year) {
		// 年の桁数チェック
		if (!checkDigitsOfYear(year)) throw new IllegalArgumentException("yearが不正です。");
		// 西暦を一桁づつ分解
		final int yearNum1 = Integer.valueOf(year.substring(0, 1));
		final int yearNum2 = Integer.valueOf(year.substring(1, 2));
		final int yearNum3 = Integer.valueOf(year.substring(2, 3));
		final int yearNum4 = Integer.valueOf(year.substring(3, 4));
		// 分解した数値を加算
		Integer yearSum = yearNum1 + yearNum2 + yearNum3 + yearNum4;
//		Logger logger = Logger.getRootLogger();
//		logger.debug("年の合計値は：" + yearSum);

		yearSum = calculateToTenLess(yearSum);

		return Constant.NUM_ELEVEN - yearSum;
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


}
