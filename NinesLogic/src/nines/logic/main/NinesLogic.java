package nines.logic.main;

import java.util.HashMap;
import java.util.Map;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic extends AbstractCommonNineStar {

	public NinesResponse createDivine(NinesRequest req) {

		// 占い日付
		final String fortuneDate = req.getYmdhms();
		// 年
		String fortuneYear = fortuneDate.substring(0, fortuneDate.indexOf("/"));
		// 月
		String fortuneMonth = fortuneDate.substring(fortuneDate.indexOf("/") +1, fortuneDate.indexOf("/") +3);
		// 日
		String fortuneDay = fortuneDate.substring(fortuneDate.lastIndexOf("/") +1, fortuneDate.lastIndexOf("/") +3);

		String fortuneMonthT = fortuneDate.substring(5, 7);
		String fortuneDateT = fortuneDate.substring(8, 10);

		// 年家九星を取得
		CalculateYearNineStar clacYear = new CalculateYearNineStar();
		Integer fortuneYearStar = clacYear.getYearStar(fortuneYear, fortuneMonth, fortuneDay);

		// 月家九星を取得
		CalculateMonthNineStar clacMonth = new CalculateMonthNineStar();
		Integer fortuneMonthStar = clacMonth.getMonthStar(fortuneYear, fortuneMonth, fortuneDay, fortuneYearStar);

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

		// 時の九星を取得
		CalculateTimeNineStar clacTime = new CalculateTimeNineStar();
		Integer fortuneTimeStar = clacTime.getTimeStar(fortuneDate);

		// 時をセット
		res.setTimeStar(fortuneTimeStar.toString());
		res.setTimeStarName(getStarName(fortuneTimeStar));

		// 生年月日
		final String birthday = req.getBirthYear();
		// 年
		String birthYear = birthday.substring(0, birthday.indexOf("/"));
		// 月
		String birthMonth = birthday.substring(birthday.indexOf("/") +1, birthday.indexOf("/") +3);
		// 日
		String birthDay = birthday.substring(birthday.lastIndexOf("/") +1, birthday.lastIndexOf("/") +3);
		// 誕生年の九星取得
		Integer birthYearStar = clacYear.getYearStar(birthYear, birthMonth, birthDay);

		// 誕生年をセット
		res.setBirthYearStar(birthYearStar.toString());
		res.setBirthYearStarName(getStarName(birthYearStar));
		return res;
	}
}
