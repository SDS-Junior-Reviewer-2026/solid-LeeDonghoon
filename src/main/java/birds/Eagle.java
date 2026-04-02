package birds;

public class Eagle extends Bird implements Flyable {
    String currentLocation;

    public Eagle(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    public void fly() {
        this.currentLocation = "in the air";
    }
}