package nines.logic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import nines.logic.main.NinesLogic;
import nines.logic.main.NinesRequest;
import nines.logic.main.NinesResponse;
import nines.logic.util.Constant;

/**
 * ロジックのテストを行うクラス<BR>
 * @author Luv<BR>
 */
public class NinesLogicTest {

	@Test
	public void testNinesLogic1() {
		NinesRequest req = new NinesRequest();
		req.setBirthYear("1988/03/22");
		req.setYmdhms("2018/01/05 4:00 PM");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_IPPAKU_SUISEI, res.getYearStar());
//		assertEquals("1", res.getYearStar());
//		assertEquals("4", res.getMonthStar());
//		assertEquals("7", res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

	@Test
	public void testNinesLogic02() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2017/12/03 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_IPPAKU_SUISEI, res.getYearStarName());
		assertEquals(Constant.NAME_SHICHISEKI_KINSEI, res.getMonthStarName());
//		assertEquals("4", res.getMonthStar());
		assertEquals(Constant.NAME_IPPAKU_SUISEI, res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

	@Test
	public void testNinesLogic03() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2018/11/28 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_KYUSHI_KASEI, res.getYearStar());
//		assertEquals("1", res.getYearStar());
//		assertEquals("4", res.getMonthStar());
		assertEquals(Constant.NAME_IPPAKU_SUISEI, res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

	@Test
	public void testNinesLogic04() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2019/11/23 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_HAPPAKU_DOSEI, res.getYearStar());
//		assertEquals("1", res.getYearStar());
//		assertEquals("4", res.getMonthStar());
		assertEquals(Constant.NAME_IPPAKU_SUISEI, res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

	@Test
	public void testNinesLogic05() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2020/05/20 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_SHICHISEKI_KINSEI, res.getYearStar());
//		assertEquals("1", res.getYearStar());
//		assertEquals("4", res.getMonthStar());
		assertEquals(Constant.NAME_KYUSHI_KASEI, res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

	@Test
	public void testNinesLogic06() {
		NinesRequest req = new NinesRequest();
		req.setYmdhms("2018/05/01 18:30:00");
		NinesLogic logic = new NinesLogic();
		NinesResponse res = logic.createDivine(req);
		assertEquals(Constant.NAME_KYUSHI_KASEI, res.getYearStar());
//		assertEquals("1", res.getYearStar());
//		assertEquals("4", res.getMonthStar());
		assertEquals(Constant.NAME_ROPPAKU_KINSEI, res.getDateStar());
//		assertEquals("9", res.getTimeStar());
	}

}
