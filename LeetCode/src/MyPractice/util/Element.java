package MyPractice.util;

public class Element implements Comparable<Element> {
    private String num;
    private Integer count;

    public Element(String num, Integer count) {
        this.num = num;
        this.count = count;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @Override
    public int compareTo(Element o) {
        return o.count.compareTo(this.count);
    }

}
