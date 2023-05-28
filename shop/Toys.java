package shop;

public class Toys {
    private String name;
    private int count;
    private int id;
    private int frequency;

    public Toys(String name, int count, int id, int frequency) {
        this.name = name;
        this.count = count;
        this.id = id;
        this.frequency = frequency;

    }

    @Override
    public String toString() {

        return "Toys{" +
                "name=" + name +
                ", count=" + count +
                ", id=" + id +
                '}';

    }

}
