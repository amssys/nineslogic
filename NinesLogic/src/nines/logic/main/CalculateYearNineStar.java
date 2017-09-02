package nines.logic.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;

import nines.logic.util.Constant;
import nines.logic.util.TwentyFourSection;

/**
 * 年家九星を計算するクラス<BR>
 */
public class CalculateYearNineStar extends AbstractCommonCalculate {


	/**
	 * 年家九星を取得します。<BR>
	 * @param yearValue
	 * @param monthValue
	 * @param dayValue
	 * @return
	 */
	public Integer getYearStar(String yearValue, String monthValue, String dayValue) {

		// 年の桁数チェック
		if (!checkDigitsOfYear(yearValue)) throw new IllegalArgumentException("yearが不正です。");
		// 日付チェック
		try {
			checkDate(yearValue + monthValue + dayValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// 西暦を一桁づつ分解
		final int yearNum1 = Integer.valueOf(yearValue.substring(0, 1));
		final int yearNum2 = Integer.valueOf(yearValue.substring(1, 2));
		final int yearNum3 = Integer.valueOf(yearValue.substring(2, 3));
		final int yearNum4 = Integer.valueOf(yearValue.substring(3, 4));
		// 分解した数値を加算
		Integer yearSum = yearNum1 + yearNum2 + yearNum3 + yearNum4;
//		Logger logger = Logger.getRootLogger();
//		logger.debug("年の合計値は：" + yearSum);


		if (Month.JANUARY.getValue() == Integer.valueOf(monthValue)) {
			// 1月の場合は前年の星になる
			yearSum = calculateToTenLess(yearSum - 1);
		} else if (Month.FEBRUARY.getValue() == Integer.valueOf(monthValue)) {
			// 2月の場合は立春を求める
			Integer firstOfSpring = getTwentyFourSeasonal(Integer.valueOf(yearValue) -1, TwentyFourSection.FirstOfSpring);

			if (Integer.valueOf(dayValue) >= firstOfSpring) {
				// 立春を過ぎている場合
				yearSum = calculateToTenLess(yearSum);
			} else {
				// 立春より前の日の場合は前年の星になる
				yearSum = calculateToTenLess(yearSum - 1);
			}

		} else {
			// 3～12月はこちらの計算で求める
			yearSum = calculateToTenLess(yearSum);
		}

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
	 * 日付のチェックをします。<BR>
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private void checkDate(String date) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		format.setLenient(false);
		format.parse(date);
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
