package MyPractice.TencentA;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Poker {
    private LinkedList<Card> pokers = new LinkedList<>();
    private char[] flowers = { '♦', '♣', '♥', '♠' };
    private char[] numbers = { '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K', 'A', '2' };

    public Poker() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < flowers.length; j++) {
                pokers.add(new Card(numbers[i], flowers[j], j + i * flowers.length));
            }
        }

        pokers.add(new Card('王', '小', 99));
        pokers.add(new Card('王', '大', 100));

    }


    public static Poker getPoker() {
        return new Poker();
    }


    public void showPoker() {
        for (Card c : pokers) {
            System.out.println(c.toString());
        }
    }


    public List<Card> dealPoker(Collection<Card> play1, Collection<Card> play2, Collection<Card> play3) {
        Collections.shuffle(pokers);// 洗牌
        while (pokers.size() > 3) {
            play1.add(pokers.removeFirst());
            play2.add(pokers.removeFirst());
            play3.add(pokers.removeFirst());
        }
        return pokers;
    }

}
