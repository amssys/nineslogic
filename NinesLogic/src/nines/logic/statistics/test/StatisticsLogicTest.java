package nines.logic.statistics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import nines.logic.statistics.StatisticsLogic;
import nines.logic.statistics.request.StatisticsFieldRequest;
import nines.logic.statistics.request.StatisticsPlayerRequest;
import nines.logic.statistics.response.StatisticsFieldResponse;
import nines.logic.statistics.response.StatisticsPlayerResponse;

/**
 * ロジックのテストを行うクラス<BR>
 * @author Luv<BR>
 */
public class StatisticsLogicTest {

	/**
	 * 騎手の生命数、年、月、日の九星を求めるロジックのテスト<BR>
	 */
	@Test
	public void testPlayerNines() {
		StatisticsPlayerRequest req = new StatisticsPlayerRequest();
		req.setBirthday("1988/03/22");
		StatisticsLogic logic = new StatisticsLogic();
		StatisticsPlayerResponse res = logic.getPlayerNines(req);
		// 生命数
		assertEquals("5", res.getLifeNumber());
		// 年の九星
		assertEquals("3", res.getYearStar());
		// 月の九星
		assertEquals("4", res.getMonthStar());
		// 日の九星
		assertEquals("1", res.getDateStar());
	}
	
	/**
	 * レース時間における九星を求めるロジックのテスト<BR>
	 */
	@Test
	public void testFieldNines() {
		StatisticsFieldRequest req = new StatisticsFieldRequest();
		req.setFieldDate("2017/06/10 15:30");
		StatisticsLogic logic = new StatisticsLogic();
		StatisticsFieldResponse res = logic.getFieldNines(req);
		// 生命数
		assertEquals("7", res.getTimeStar());
	}

}
