package nines.logic.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.junit.Test;

import nines.logic.main.AbstractCommonNineStar;
import nines.logic.main.CalculateDateNineStar;
import nines.logic.main.NinesDate;
import nines.logic.util.Constant;
import nines.logic.util.SixtyZodiac;

/**
 * 日家九星を求めるロジックのテストを行うクラス<BR>
 * @author Luv<BR>
 */
public class CalculateDateNineStarTest extends AbstractCommonNineStar {
	CalculateDateNineStar c = new CalculateDateNineStar();
	Map<String, Integer> dateMap = c.getDateStar();

	/**
	 * 期間05のチェック
	 */
	@Test
	public void testCalculateDateNinesStar05() {
		String[] testDates = {"19400122", "19510523", // NORMAL_TERM05
				                "19510524", "19510722", // URUU_TERM05
			                   };
		String[] expected = {Constant.NAME_IPPAKU_SUISEI, Constant.NAME_KYUSHI_KASEI,
				              Constant.NAME_IPPAKU_SUISEI, Constant.NAME_IPPAKU_SUISEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間06のチェック
	 */
	@Test
	public void testCalculateDateNinesStar06() {
		String[] testDates = {"19510723", "19621121", // NORMAL_TERM06
				                "19621122", "19630120", // URUU_TERM06
			                   };
		String[] expected = {Constant.NAME_KYUSHI_KASEI, Constant.NAME_IPPAKU_SUISEI,
				              Constant.NAME_KYUSHI_KASEI, Constant.NAME_KYUSHI_KASEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間07のチェック
	 */
	@Test
	public void testCalculateDateNinesStar07() {
		String[] testDates = {"19630121", "19740522", // NORMAL_TERM07
				                "19740523", "19740721", // URUU_TERM07
			                   };
		String[] expected = {Constant.NAME_IPPAKU_SUISEI, Constant.NAME_KYUSHI_KASEI,
				              Constant.NAME_IPPAKU_SUISEI, Constant.NAME_IPPAKU_SUISEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間08のチェック
	 */
	@Test
	public void testCalculateDateNinesStar08() {
		String[] testDates = {"19740722", "19851120", // NORMAL_TERM08
				                "19851121", "19860119", // URUU_TERM08
			                   };
		String[] expected = {Constant.NAME_KYUSHI_KASEI, Constant.NAME_IPPAKU_SUISEI,
				              Constant.NAME_KYUSHI_KASEI, Constant.NAME_KYUSHI_KASEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間09のチェック
	 */
	@Test
	public void testCalculateDateNinesStar09() {
		String[] testDates = {"19860120", "19970521", // NORMAL_TERM09
				                "19970522", "19970720", // URUU_TERM09
			                   };
		String[] expected = {Constant.NAME_IPPAKU_SUISEI, Constant.NAME_KYUSHI_KASEI,
				              Constant.NAME_IPPAKU_SUISEI, Constant.NAME_IPPAKU_SUISEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間10のチェック
	 */
	@Test
	public void testCalculateDateNinesStar10() {
		String[] testDates = {"19970721", "20081119", // NORMAL_TERM10
				                "20081120", "20090118", // URUU_TERM10
			                   };
		String[] expected = {Constant.NAME_KYUSHI_KASEI, Constant.NAME_IPPAKU_SUISEI,
				              Constant.NAME_KYUSHI_KASEI, Constant.NAME_KYUSHI_KASEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間11のチェック
	 */
	@Test
	public void testCalculateDateNinesStar11() {
		String[] testDates = {"20090119", "20200520", // NORMAL_TERM11
				                "20200521", "20200719", // URUU_TERM11
			                   };
		String[] expected = {Constant.NAME_IPPAKU_SUISEI, Constant.NAME_KYUSHI_KASEI,
				              Constant.NAME_IPPAKU_SUISEI, Constant.NAME_IPPAKU_SUISEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	/**
	 * 期間12のチェック
	 */
	@Test
	public void testCalculateDateNinesStar12() {
		String[] testDates = {"20200720", "20311119", // NORMAL_TERM12
				                "20311120", "20320118", // URUU_TERM12
			                   };
		String[] expected = {Constant.NAME_KYUSHI_KASEI, Constant.NAME_IPPAKU_SUISEI,
				              Constant.NAME_KYUSHI_KASEI, Constant.NAME_KYUSHI_KASEI
				              };

		for (int i = 0; i < testDates.length; i++) {
			assertEquals(expected[i], getStarName(dateMap.get(testDates[i])));
		}
	}

	@Test
	public void testGetNewNiesDate01() {
		NinesDate ninesDate = c.getNiesDate("1940/01/22");

		assertEquals("1940/01/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate02() {
		NinesDate ninesDate = c.getNiesDate("1951/05/23");

		assertEquals("1951/05/23", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate03() {
		NinesDate ninesDate = c.getNiesDate("1951/05/24");

		assertEquals("1951/05/24", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate04() {
		NinesDate ninesDate = c.getNiesDate("1951/07/22");

		assertEquals("1951/07/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate05() {
		NinesDate ninesDate = c.getNiesDate("1951/07/23");

		assertEquals("1951/07/23", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate06() {
		NinesDate ninesDate = c.getNiesDate("1962/11/21");

		assertEquals("1962/11/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate07() {
		NinesDate ninesDate = c.getNiesDate("1962/11/22");

		assertEquals("1962/11/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate08() {
		NinesDate ninesDate = c.getNiesDate("1963/01/20");

		assertEquals("1963/01/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate09() {
		NinesDate ninesDate = c.getNiesDate("1963/01/21");

		assertEquals("1963/01/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate10() {
		NinesDate ninesDate = c.getNiesDate("1974/05/22");

		assertEquals("1974/05/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate11() {
		NinesDate ninesDate = c.getNiesDate("1974/05/23");

		assertEquals("1974/05/23", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate12() {
		NinesDate ninesDate = c.getNiesDate("1974/07/21");

		assertEquals("1974/07/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate13() {
		NinesDate ninesDate = c.getNiesDate("1974/07/22");

		assertEquals("1974/07/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate14() {
		NinesDate ninesDate = c.getNiesDate("1985/11/20");

		assertEquals("1985/11/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate15() {
		NinesDate ninesDate = c.getNiesDate("1985/11/21");

		assertEquals("1985/11/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate16() {
		NinesDate ninesDate = c.getNiesDate("1986/01/19");

		assertEquals("1986/01/19", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate17() {
		NinesDate ninesDate = c.getNiesDate("1986/01/20");

		assertEquals("1986/01/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate18() {
		NinesDate ninesDate = c.getNiesDate("1997/05/21");

		assertEquals("1997/05/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate19() {
		NinesDate ninesDate = c.getNiesDate("1997/05/22");

		assertEquals("1997/05/22", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate20() {
		NinesDate ninesDate = c.getNiesDate("1997/07/20");

		assertEquals("1997/07/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate21() {
		NinesDate ninesDate = c.getNiesDate("1997/07/21");

		assertEquals("1997/07/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate22() {
		NinesDate ninesDate = c.getNiesDate("2008/11/19");

		assertEquals("2008/11/19", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate23() {
		NinesDate ninesDate = c.getNiesDate("2008/11/20");

		assertEquals("2008/11/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate24() {
		NinesDate ninesDate = c.getNiesDate("2009/01/18");

		assertEquals("2009/01/18", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate25() {
		NinesDate ninesDate = c.getNiesDate("2009/01/19");

		assertEquals("2009/01/19", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate26() {
		NinesDate ninesDate = c.getNiesDate("2020/05/20");

		assertEquals("2020/05/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate27() {
		NinesDate ninesDate = c.getNiesDate("2020/05/21");

		assertEquals("2020/05/21", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate28() {
		NinesDate ninesDate = c.getNiesDate("2020/07/19");

		assertEquals("2020/07/19", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate29() {
		NinesDate ninesDate = c.getNiesDate("2020/07/20");

		assertEquals("2020/07/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate30() {
		NinesDate ninesDate = c.getNiesDate("2031/11/19");

		assertEquals("2031/11/19", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_IPPAKU_SUISEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate31() {
		NinesDate ninesDate = c.getNiesDate("2031/11/20");

		assertEquals("2031/11/20", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(false, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.KINOE_NE, ninesDate.getSixtyZodiac());
		assertEquals("子", ninesDate.getZodiac());
	}

	@Test
	public void testGetNewNiesDate32() {
		NinesDate ninesDate = c.getNiesDate("2032/01/18");

		assertEquals("2032/01/18", sdf.format(ninesDate.getDate()));
		assertEquals(Constant.NAME_KYUSHI_KASEI, getStarName(ninesDate.getDateStar()));
		assertEquals(true, ninesDate.isYangFlg());
		assertEquals(SixtyZodiac.MIZUNOTO_I, ninesDate.getSixtyZodiac());
		assertEquals("亥", ninesDate.getZodiac());
	}
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
}
