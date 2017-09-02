package nines.logic.util;

/**
 * 二十四節気を求める際の補正値
 */
public enum TwentyFourSection {

	/** 夏至 */
	SummerSolstice(22.2747, 0.241669)
	/** 冬至 */
	, WinterSolstice(22.6587, 0.242752)
	/** 2月：立春 */
	, FirstOfSpring(4.8693, 0.242713)
	/** 3月：啓蟄(けいちつ) */
	, Keichitsu(6.3968, 0.242512)
	/** 4月：清明 */
	, Seimei(5.6280, 0.242231)
	/** 5月：立夏 */
	, Rikka(6.3771, 0.241945)
	/** 6月：芒種(ぼうしゅ) */
	, Boshu(6.5733, 0.241642)
	/** 7月：小暑 */
	, Shosho(8.0091, 0.241642)
	/** 8月：立秋 */
	, Risshu(8.4102, 0.241703)
	/** 9月：白露 */
	, Hakuro(8.5186, 0.241898)
	/** 10月：寒露 */
	, Kanro(9.1414, 0.242179)
	/** 11月：立冬 */
	, Ritto(8.2396, 0.242469)
	/** 12月：大雪 */
	, Taisetsu(7.9152, 0.242179)
	/** 1月：小寒 */
	, Shokan(6.3811, 0.242689)
	;

	// 補正値
	private double dateCorrection; // 日の補正値
	private double timeCorrection; // 時間の補正値

	// コンストラクタ
	private TwentyFourSection(double date, double time) {
		this.dateCorrection = date;
		this.timeCorrection = time;
	}

	// 補正値取得メソッド
	public double getDateCorrection() {
		return this.dateCorrection;
	}

	public double getTimeCorrection() {
		return this.timeCorrection;
	}
}
