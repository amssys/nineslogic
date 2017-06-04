package nines.logic.main;

import java.util.HashMap;
import java.util.Map;

import nines.logic.util.Constant;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic extends AbstractCommonNineStar {

	public NinesResponse createDivine(NinesRequest req) {

		// 占い日付
		final String fortuneDate = req.getYmdhms();
		String fortuneYear = fortuneDate.substring(0, 4);
		String fortuneMonth = fortuneDate.substring(5, 7);

		String fortuneMonthT = fortuneDate.substring(5, 7);
		String fortuneDateT = fortuneDate.substring(8, 10);

		// 年家九星を取得
		CalculateYearNineStar clacYear = new CalculateYearNineStar();
		Integer fortuneYearStar = clacYear.getYearStar(fortuneYear);

		// 月家九星を取得
		CalculateMonthNineStar clacMonth = new CalculateMonthNineStar();
		Integer fortuneMonthStar = clacMonth.getMonthStar(fortuneYearStar, fortuneMonth);

		NinesResponse res = new NinesResponse();
		// 年をセット
		res.setYearStar(fortuneYearStar.toString());
		res.setYearStarName(getStarName(fortuneYearStar));
		// 月をセット
		res.setMonthStar(fortuneMonthStar.toString());
		res.setMonthStarName(getStarName(fortuneMonthStar));


		// TODO 暫定的に現在の年の状態をmapにセット
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(Integer.valueOf(res.getYearStar()), Integer.valueOf(res.getYearStar()));

		// 日家九星を取得
		CalculateDateNineStar date = new CalculateDateNineStar();
		Map<String, Integer> dateMap = null;
		try {
			dateMap = date.getDateStar();
		} catch (Exception e) {
			// TODO 例外処理後日対応
			e.printStackTrace();
		}
		Integer dateStar = dateMap.get(fortuneYear+fortuneMonthT+fortuneDateT);
		res.setDateStar(String.valueOf(dateStar));
		res.setDateStarName(getStarName(dateStar));

		// 生年月日
		final String birthday = req.getBirthYear();
		String birthYear = birthday.substring(0, 4);
		Integer birthYearStar = clacYear.getYearStar(birthYear);

		// 誕生年をセット
		res.setBirthYearStar(birthYearStar.toString());
		res.setBirthYearStarName(getStarName(birthYearStar));

		// 時間をセット
		res.setTimeStar("9");
		res.setTimeStarName(Constant.NAME_KYUSHI_KASEI);

		return res;
	}
}
