import java.util.Objects;

public class word {

    String w;
    int count;

    public word(String w) {
        this.w = w;
    }

    public word(String w, int count) {
        this.w = w;
        this.count=count;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        word word = (word) o;
        return Objects.equals(w, word.w);
    }

    @Override
    public int hashCode() {
        return Objects.hash(w);
    }

    @Override
    public String toString() {
        return "word{" +
                "w='" + w + '\'' +
                ", count=" + count +
                '}';
    }
}
