public class Basket {
    private  int count;
    private int name;

    public Basket(int count, int name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public int getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "count=" + count +
                ", name=" + name +
                '}';
    }
}
