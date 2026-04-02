package birds;

public abstract class Bird {
    int numberOfFeathers;

    public Bird(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}