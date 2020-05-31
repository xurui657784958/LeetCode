package MyPractice.TencentA;

public class Card implements Comparable<Card>{
    private char number;// 号码
    private char flower;// 花色
    private int grade;// 等级

    public Card(char number, char flower, int grade) {
        super();
        this.number = number;
        this.flower = flower;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "[" + flower + number + "]";
    }

    public char getNumber() {
        return number;
    }

    public void setNumber(char number) {
        this.number = number;
    }

    public char getFlower() {
        return flower;
    }

    public void setFlower(char flower) {
        this.flower = flower;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Card o) {
        return o.grade - this.grade;
    }

}
