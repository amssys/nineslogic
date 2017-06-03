package nines.logic.main;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import nines.logic.util.Constant;

/**
 * 九星のロジッククラス<BR>
 * @author Luv
 */
public class NinesLogic extends AbstractCommonNineStar {

	private LambdaLogger logger;
	/**
	 * コンストラクタ<BR>
	 * @param logger
	 */
	public NinesLogic(LambdaLogger logger) {
		this.logger = logger;
	}
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
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(Integer.valueOf(res.getYearStar()), Integer.valueOf(res.getYearStar()));

		// 日家九星を取得
		CalculateDateNineStar date = new CalculateDateNineStar();
		Map<String, Integer> dateMap = null;
		try {
			dateMap = date.getDateStar();
		} catch (Exception e) {
			logger.log(e.getMessage());
		}
		logger.log("After getDateStar");
		logger.log("ymdhms=" + ymdhms);
		logger.log("map=" + dateMap == null || dateMap.isEmpty() ? "map is empty" : "map size =" + dateMap.size());
		for(String key : dateMap.keySet()) {
			logger.log("key=" + key);
			logger.log("value=" + dateMap.get(key));
		}
		Integer dateStar = dateMap.get(year+monthT+dateT);
		res.setDateStar(String.valueOf(dateStar));
		res.setDateStarName(getStarName(dateStar));

		res.setBirthYearStar("1");
		res.setBirthYearStarName(Constant.NAME_IPPAKU_SUISEI);
		res.setTimeStar("9");
		res.setTimeStarName(Constant.NAME_KYUSHI_KASEI);

		return res;
	}
}
