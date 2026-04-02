package greeter;

public class Greeter {
    private String formality;
    private GreeterString greeterString;

    public Greeter() {
        this.formality = "default";
        greeterString = GreeterStringFactory.create(formality);
    }

    public String greet() {
        return greeterString.greet();
    }

    public void setFormality(String formality) {
        if (formality == null) {
            this.formality = "";
        } else {
            this.formality = formality;
        }
        greeterString = GreeterStringFactory.create(this.formality);
    }
}