package greeter;

public class GreeterStringFactory {
    public static GreeterString create(String formality) {
        switch (formality) {
            case "formal": return new FormalGreeterString();
            case "casual": return new CasualGreeterString();
            case "intimate": return new IntimateGreeterString();
            case "goHome": return new GoHomeGreeterString();
            default: return new DefaultGreeterString();
        }
    }
}
