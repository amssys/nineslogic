package nines.logic.test;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import nines.logic.main.AbstractCommonNineStar;
import nines.logic.main.simple.SimpleCalculateNineStars;

/**
 * 日家九星を求めるロジックのテストを行うクラス<BR>
 * @author Luv<BR>
 */
public class LocalInputTest extends AbstractCommonNineStar {

	@Test
	public void test() throws ParseException {

		Map<String, String> dates = new HashMap<>();
		dates.put("小坂 忠士", "1983/02/07");
		dates.put("江田 照男", "1972/02/08");
		dates.put("江田 勇亮", "1978/09/04");
		dates.put("大江原 圭", "1990/02/26");
		dates.put("大庭 和弥", "1982/09/13");
		dates.put("幸 英明", "1976/01/12");
		dates.put("水口 優也", "1991/03/22");
		dates.put("大下 智", "1986/05/12");
		dates.put("黛 弘人", "1985/11/12");
		dates.put("Ｍ．デムーロ", "1979/01/11");
		dates.put("荻野 極", "1997/09/23");
		dates.put("岩崎 翼", "1994/05/30");
		dates.put("丸山 元気", "1990/10/03");
		dates.put("村田 一誠", "1978/12/20");
		dates.put("岩部 純二", "1976/03/25");
		dates.put("石川 裕紀人", "1995/09/22");
		dates.put("松岡 正海", "1984/07/18");
		dates.put("荻野 琢真", "1988/07/28");
		dates.put("松若 風馬", "1995/09/04");
		dates.put("松田 大作", "1978/09/13");
		dates.put("岩田 康誠", "1974/03/12");
		dates.put("石橋 脩", "1984/04/03");
		dates.put("武藤 雅", "1998/01/10");
		dates.put("三浦 皇成", "1989/12/19");
		dates.put("松山 弘平", "1990/03/01");
		dates.put("五十嵐 雄祐", "1984/02/16");
		dates.put("和田 竜二", "1977/06/23");
		dates.put("池添 謙一", "1979/07/23");
		dates.put("井上 敏樹", "1994/12/05");
		dates.put("伊藤 工真", "1990/02/26");
		dates.put("宮崎 北斗", "1989/03/12");
		dates.put("内田 博幸", "1970/07/26");
		dates.put("森 一馬", "1993/03/13");
		dates.put("三津谷 隼人", "1996/12/25");
		dates.put("上野 翔", "1985/12/23");
		dates.put("石神 深一", "1982/06/03");
		dates.put("秋山 真一郎", "1979/02/09");
		dates.put("蛯名 正義", "1969/03/19");
		dates.put("大野 拓弥", "1986/09/08");
		dates.put("植野 貴也", "1975/07/01");
		dates.put("岡田 祥嗣", "1971/10/16");
		dates.put("小野寺 祐太", "1990/03/12");
		dates.put("的場 勇人(マトバ ハヤト)", "1987/11/28");
		dates.put("丸田 恭介(マルタ キョウスケ)", "1986/05/20");
		dates.put("蓑島 靖典 (ミノシマ ヤスノリ)", "1982/11/14");
		dates.put("森 裕太朗 (モリ ユウタロウ)", "1997/03/02");

		System.out.println("Map Size = " + dates.size());
		SimpleCalculateNineStars s = new SimpleCalculateNineStars();
		for(String key : dates.keySet()) {
			Map<String, Integer> stars = s.getNineStars(dates.get(key));
			System.out.print(key);
			System.out.print(" (");
			System.out.print(stars.get("lifenumber") + ",");
			System.out.print(stars.get("date") + ",");
			System.out.print(stars.get("month") + ",");
			System.out.print(stars.get("year") + ")\n");
		}
	}

}
