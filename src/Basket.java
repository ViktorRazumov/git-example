public class Basket {
    private  int count;
    private int name;

    public Basket(int name) {
        count += 1;
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
