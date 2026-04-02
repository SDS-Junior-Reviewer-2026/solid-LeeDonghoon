package greeter;

public class Greeter {
    private String formality;
    private GreeterString greeterString;

    public Greeter() {
        this.formality = "Default";
        greeterString = GreeterStringFactory.create(formality);
    }

    public String greet() {
        return greeterString.greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
        greeterString = GreeterStringFactory.create(formality);
    }
}