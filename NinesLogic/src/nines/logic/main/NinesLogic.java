package nines.logic.main;

import java.util.HashMap;
import java.util.Map;

import nines.logic.util.Constant;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic {

	public NinesResponse createDivine(NinesRequest req) {

		final String ymdhms = req.getYmdhms();
		String year = ymdhms.substring(0, 4);
		String month = ymdhms.substring(6, 7);

		// 年家九星を取得
		Map<Integer, String> map = getYearStar(year);

		getMonthStar(map.get(Integer.valueOf(year)), month);


		NinesResponse res = new NinesResponse();
		res.setYearStar(map.get(Integer.valueOf(year)));

		System.out.println(map.get(Integer.valueOf(year)));


		/** ロジック部 */

		return res;
	}

	/**
	 * 年家九星を取得します。<BR>
	 * @param year
	 */
	private Map<Integer, String> getYearStar(String year) {

		Map<Integer, String> starMap = new HashMap<Integer, String>();

		Integer yearNum = null;
		Integer yaerCounter = 1;

		do {
			if (yearNum == null) {
				yearNum = Constant.BASE_YAER;
			} else {
				yearNum = yearNum + 1;
			}

			switch(yaerCounter) {
			case Constant.NUM_IPPAKU_SUISEI:
				starMap.put(yearNum, Constant.IPPAKU_SUISEI);
				break;
			case Constant.NUM_JIKOKU_DOSEI:
				starMap.put(yearNum, Constant.KYUSHI_KASEI);
				break;
			case Constant.NUM_SAMPEKI_MOKUSEI:
				starMap.put(yearNum, Constant.HAPPAKU_DOSEI);
				break;
			case Constant.NUM_SHIROKU_MOKUSEI:
				starMap.put(yearNum, Constant.SHICHISEKI_KINSEI);
				break;
			case Constant.NUM_GOU_DOSEI:
				starMap.put(yearNum, Constant.ROPPAKU_KINSEI);
				break;
			case Constant.NUM_ROPPAKU_KINSEI:
				starMap.put(yearNum, Constant.GOU_DOSEI);
				break;
			case Constant.NUM_SHICHISEKI_KINSEI:
				starMap.put(yearNum, Constant.SHIROKU_MOKUSEI);
				break;
			case Constant.NUM_HAPPAKU_DOSEI:
				starMap.put(yearNum, Constant.SAMPEKI_MOKUSEI);
				break;
			case Constant.NUM_KYUSHI_KASEI:
				starMap.put(yearNum, Constant.JIKOKU_DOSEI);
				break;
			default:
				break;

			}
			yaerCounter++;

			if (yaerCounter == 10) {
				yaerCounter = Constant.NUM_IPPAKU_SUISEI;
			}

		} while (yearNum.equals(Integer.valueOf(year)) == false);

		return starMap;
	}


	/**
	 * 月家九星を取得します。<BR>
	 * @param yearStar
	 * @param month
	 */
	private void getMonthStar(String yearStar, String month) {

		switch (yearStar) {
		case Constant.IPPAKU_SUISEI:
		case Constant.SHIROKU_MOKUSEI:
		case Constant.SHICHISEKI_KINSEI:

			break;

		case Constant.SAMPEKI_MOKUSEI:
		case Constant.ROPPAKU_KINSEI:
		case Constant.KYUSHI_KASEI:
			break;

		case Constant.JIKOKU_DOSEI:
		case Constant.GOU_DOSEI:
		case Constant.HAPPAKU_DOSEI:
			break;

		default:
			throw new IllegalArgumentException();
		}

	}
}
