package nines.logic.main;

import java.util.HashMap;
import java.util.Map;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic extends AbstractCommonNineStar {

	public NinesResponse createDivine(NinesRequest req) {

		final String ymdhms = req.getYmdhms();
		String year = ymdhms.substring(0, 4);
		String month = ymdhms.substring(5, 7);

		String monthT = ymdhms.substring(5, 7);
		String dateT = ymdhms.substring(8, 10);

		// 年家九星を取得
		CalculateYearNineStar clacYear = new CalculateYearNineStar();
		Integer yearStar = clacYear.getYearStar(year);

		// 月家九星を取得
		CalculateMonthNineStar clacMonth = new CalculateMonthNineStar();
		Integer monthStar = clacMonth.getMonthStar(yearStar, month);

		NinesResponse res = new NinesResponse();
		// 年をセット
		res.setYearStar(yearStar.toString());
		res.setYearStarName(getStarName(yearStar));
		// 月をセット
		res.setMonthStar(monthStar.toString());
		res.setMonthStarName(getStarName(monthStar));


		// TODO 暫定的に現在の年の状態をmapにセット
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(res.getYearStar()), res.getYearStarName());

		// 日家九星を取得
		CalculateDateNineStar dateStar = new CalculateDateNineStar();
		map = dateStar.getDateStar(map, ymdhms);
		res.setDateStar(map.get(Integer.valueOf(year+monthT+dateT)));

//		Logger logger = Logger.getRootLogger();
//		logger.info("aaaaaaaaaaaaaaaa");

		return res;
	}


}
