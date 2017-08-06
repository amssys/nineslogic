package nines.logic.util;

public enum SixtyZodiac {

	KINOE_NE
	(0, "甲子"),
	KINOTO_USHI
	(1, "乙丑"),
	HINOE_TORA
	(2, "丙寅"),
	HINOTO_U
	(3, "丁卯"),
	TUCHINOE_TATU
	(4, "戊辰"),
	TUCHINOTO_MI
	(5, "己巳"),
	KANOE_UMA
	(6, "庚午"),
	KANOTO_HITUJI
	(7, "辛未"),
	MIZUNOE_SARU
	(8, "壬申"),
	MIZUNOTO_TORI
	(9, "癸酉"),

	KINOE_INU
	(10, "甲戌"),
	KINOTO_I
	(11, "乙亥"),
	HINOE_NE
	(12, "丙子"),
	HINOTO_USHI
	(13, "丁丑"),
	TUCHINOE_TORA
	(14, "戊寅"),
	TUCHINOTO_U
	(15, "己卯"),
	KANOE_TATU
	(16, "庚辰"),
	KANOTO_MI
	(17, "辛巳"),
	MIZUNOE_UMA
	(18, "壬午"),
	MIZUNOTO_HITUJI
	(19, "癸未"),

	KINOE_SARU
	(20, "甲申"),
	KINOTO_TORI
	(21, "乙酉"),
	HINOE_INU
	(22, "丙戌"),
	HINOTO_I
	(23, "丁亥"),
	TUCHINOE_NE
	(24, "戊子"),
	TUCHINOTO_USHI
	(25, "己丑"),
	KANOE_TORA
	(26, "庚寅"),
	KANOTO_U
	(27, "辛卯"),
	MIZUNOE_TATU
	(28, "壬辰"),
	MIZUNOTO_MI
	(29, "癸巳"),

	KINOE_UMA
	(30, "甲午"),
	KINOTO_HITUJI
	(31, "乙未"),
	HINOE_SARU
	(32, "丙申"),
	HINOTO_TORI
	(33, "丁酉"),
	TUCHINOE_INU
	(34, "戊戌"),
	TUCHINOTO_I
	(35, "己亥"),
	KANOE_NE
	(36, "庚子"),
	KANOTO_USHI
	(37, "辛丑"),
	MIZUNOE_TORA
	(38, "壬寅"),
	MIZUNOTO_U
	(39, "癸卯"),

	KINOE_TATU
	(40, "甲辰"),
	KINOTO_MI
	(41, "乙巳"),
	HINOE_UMA
	(42, "丙午"),
	HINOTO_HITUJI
	(43, "丁未"),
	TUCHINOE_SARU
	(44, "戊申"),
	TUCHINOTO_TORI
	(45, "己酉"),
	KANOE_INU
	(46, "庚戌"),
	KANOTO_I
	(47, "辛亥"),
	MIZUNOE_NE
	(48, "壬子"),
	MIZUNOTO_USHI
	(49, "癸丑"),

	KINOE_TORA
	(50, "甲寅"),
	KINOTO_U
	(51, "乙卯"),
	HINOE_TATU
	(52, "丙辰"),
	HINOTO_MI
	(53, "丁巳"),
	TUCHINOE_UMA
	(54, "戊午"),
	TUCHINOTO_HITUJI
	(55, "己未"),
	KANOE_SARU
	(56, "庚申"),
	KANOTO_TORI
	(57, "辛酉"),
	MIZUNOE_INU
	(58, "壬戌"),
	MIZUNOTO_I
	(59, "癸亥");

	private int order;
	private String name;

	private SixtyZodiac(int order, String name) {
		this.order = order;
		this.name= name;
	}

	public int getOrder() {
		return order;
	}

	public String getName() {
		return name;
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
