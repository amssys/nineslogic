package nines.logic.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public enum DateControll {
//	NORMAL_TERM01("1894/07/21", "1905/11/20", false),
//	URUU_TERM01("1905/11/21", "1906/01/19", false),
//
//	NORMAL_TERM02("1906/01/20", "1916/11/22", true),
//	URUU_TERM02("1916/11/23", "1917/01/21", false),
//
//	NORMAL_TERM03("1917/01/22", "1928/05/23", true),
//	URUU_TERM03("1928/05/24", "1928/07/22", true),
//
//	NORMAL_TERM04("1928/07/23", "1939/11/22", false),
//	URUU_TERM04("1939/11/23", "1940/01/21", false),

	NORMAL_TERM05("1940/01/22", "1951/05/23", true),
	URUU_TERM05("1951/05/24", "1951/07/22", true),

	NORMAL_TERM06("1951/07/23", "1962/11/21", false),
	URUU_TERM06("1962/11/22", "1963/01/20", false),

	NORMAL_TERM07("1963/01/21", "1974/05/22", true),
	URUU_TERM07("1974/05/23", "1974/07/21", true),

	NORMAL_TERM08("1974/07/22", "1985/11/20", false),
	URUU_TERM08("1985/11/21", "1986/01/19", false),

	NORMAL_TERM09("1986/01/20", "1997/05/21", true),
	URUU_TERM09("1997/05/22", "1997/07/20", true),

	NORMAL_TERM10("1997/07/21", "2008/11/19", false),
	URUU_TERM10("2008/11/20", "2009/01/18", false),

	NORMAL_TERM11("2009/01/19", "2020/05/20", true),
	URUU_TERM11("2020/05/21", "2020/07/19", true),

	NORMAL_TERM12("2020/07/20", "2031/11/19", false),
	URUU_TERM12("2031/11/20", "2032/01/18", false),
	;

	// 開始日
	private Date startDate;
	// 終了日
	private Date endDate;
	// 陽遁から開始フラグ
	private boolean startFromYangFlg;

	private DateControll(String startDate, String endDate, boolean startFromYangFlg) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			this.startDate = sdf.parse(startDate);
			this.endDate = sdf.parse(endDate);
			this.startFromYangFlg = startFromYangFlg;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public boolean isStartFromYangFlg() {
		return startFromYangFlg;
	}
}
