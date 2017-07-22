package nines.logic.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import nines.logic.main.AbstractCommonNineStar;
import nines.logic.main.CalculateDateNineStar;
import nines.logic.util.Constant;

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
}
