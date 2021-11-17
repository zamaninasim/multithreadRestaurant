package ir.maktab;

public class Food {
    public String name;
    public Integer count;

    public Food(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
