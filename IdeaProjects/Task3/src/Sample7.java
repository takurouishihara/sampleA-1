import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        final String MALE = "男性";
        final String WOMEN = "女性";
        list.add("千尋" + "は" + WOMEN);
        list.add("ハク" + "は" + MALE);
        list.add("湯婆婆" + "は" + WOMEN);
        list.add("釜爺" + "は" + MALE);
        list.add("リン" + "は" + WOMEN);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("-----------あア亜のあいうえお順リスト------------");
        System.out.println(list);
    }
}
