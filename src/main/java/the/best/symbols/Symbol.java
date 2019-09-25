package the.best.symbols;

public class Symbol {
    private String token;

    public Symbol(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return token;
    }
}
