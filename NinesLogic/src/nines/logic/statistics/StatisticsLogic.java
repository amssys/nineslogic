package nines.logic.statistics;

import nines.logic.statistics.request.StatisticsFieldRequest;
import nines.logic.statistics.request.StatisticsPlayerRequest;
import nines.logic.statistics.response.StatisticsFieldResponse;
import nines.logic.statistics.response.StatisticsPlayerResponse;

public class StatisticsLogic {

	/**
	 * 誕生日<yyyy/MM/dd>から、生命数、誕生年、月、日の九星を求めます<BR>
	 * @param request
	 * @return
	 */
	public StatisticsPlayerResponse getPlayerNines(StatisticsPlayerRequest request) {
		StatisticsPlayerResponse response = new StatisticsPlayerResponse();
		
		/** ロジック */
		
		return response;
	}
	
	/**
	 * レース日時<yyyy/MM/dd HH:mm>から、時の九星を求めます<BR>
	 * @param request
	 * @return
	 */
	public StatisticsFieldResponse getFieldNines(StatisticsFieldRequest request) {
		StatisticsFieldResponse response = new StatisticsFieldResponse();
		
		/** ロジック */
		
		return response;
	}
}
