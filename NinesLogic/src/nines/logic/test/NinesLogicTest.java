package nines.logic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import nines.logic.NinesLogic;
import nines.logic.NinesRequest;
import nines.logic.NinesResponse;

/**
 * ロジックのテストを行うクラス<BR>
 * @author Luv<BR>
 */
public class NinesLogicTest {

	@Test
	public void testNinesLogic1() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2017/06/09 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals("1", res.getYearStar());
		assertEquals("4", res.getMonthStar());
		assertEquals("7", res.getDateStar());
		assertEquals("9", res.getTimeStar());
	}

}
