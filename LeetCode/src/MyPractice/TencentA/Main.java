package MyPractice.TencentA;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();

        poker.getPoker();
        TreeSet<Card> p1 = new TreeSet<>();
        TreeSet<Card> p2 = new TreeSet<>();
        TreeSet<Card> p3 = new TreeSet<>();
        List<Card> dealPoker = poker.dealPoker(p1, p2, p3);

        // 删除牌
        System.err.println("玩家一：" + p1);
        System.err.println("玩家二：" + p2);
        System.err.println("玩家三：" + p3);
        System.out.println("底牌    ：" + dealPoker);
    }

}
