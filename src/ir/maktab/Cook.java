package ir.maktab;

public class Cook implements Runnable{
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void run() {


    }

    @Override
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                '}';
    }
}
