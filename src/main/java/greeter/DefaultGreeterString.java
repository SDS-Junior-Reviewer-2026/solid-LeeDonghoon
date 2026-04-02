package greeter;

public class DefaultGreeterString implements GreeterString {

    @Override
    public String greet() {
        return "Hello.";
    }
}
