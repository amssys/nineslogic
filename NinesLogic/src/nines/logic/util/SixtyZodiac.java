package nines.logic.util;

public enum SixtyZodiac {

	KINOE_NE(0),
	KINOTO_USHI(1),

	MIZUNOTO_I(59);

	private int order;

	private SixtyZodiac(int order) {
		this.order = order;
	}

	public int getOrder() {
		return order;
	}

	public SixtyZodiac getNext() {
		SixtyZodiac ret = null;
		for (SixtyZodiac sz: values()) {
			if (ordinal() == values().length - 1) {
				ret = KINOE_NE;
			}
			else if (ordinal() + 1 == sz.ordinal()) {
				ret = sz;
				break;
			}
		}
		return ret;
	}
}
