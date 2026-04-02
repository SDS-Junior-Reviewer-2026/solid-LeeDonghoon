package birds;

public class Penguin extends Bird implements Swimmable {
    String currentLocation;

    public Penguin(int initialFeatherCount) {
        super(initialFeatherCount);
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}