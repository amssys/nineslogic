package nines.logic.util;

/**
 * 二十四節気を求める際の補正値
 * @author uesr
 *
 */
public enum TwentyFourSection {
	SummerSolstice(22.2747, 0.241669),
	WinterSolstice(22.6587, 0.242752);

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
