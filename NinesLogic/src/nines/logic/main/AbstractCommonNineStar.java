package nines.logic.main;

import nines.logic.util.Constant;

/**
 * 九星の抽象クラス<BR>
 */
public abstract class AbstractCommonNineStar {


	/**
	 * 星の名称を取得します。<BR>
	 * @param star
	 * @return
	 */
	protected String getStarName(Integer star) {
		switch (star) {
		case Constant.NUM_IPPAKU_SUISEI:
			return Constant.NAME_IPPAKU_SUISEI;
		case Constant.NUM_JIKOKU_DOSEI:
			return Constant.NAME_JIKOKU_DOSEI;
		case Constant.NUM_SAMPEKI_MOKUSEI:
			return Constant.NAME_SAMPEKI_MOKUSEI;
		case Constant.NUM_SHIROKU_MOKUSEI:
			return Constant.NAME_SHIROKU_MOKUSEI;
		case Constant.NUM_GOU_DOSEI:
			return Constant.NAME_GOU_DOSEI;
		case Constant.NUM_ROPPAKU_KINSEI:
			return Constant.NAME_ROPPAKU_KINSEI;
		case Constant.NUM_SHICHISEKI_KINSEI:
			return Constant.NAME_SHICHISEKI_KINSEI;
		case Constant.NUM_HAPPAKU_DOSEI:
			return Constant.NAME_HAPPAKU_DOSEI;
		case Constant.NUM_KYUSHI_KASEI:
			return Constant.NAME_KYUSHI_KASEI;
		default:
			throw new IllegalArgumentException();
		}
	}

}
