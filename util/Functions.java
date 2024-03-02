package util;

public class Functions {

    private double account;

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public static String mensHora(int hora, String name) {
        if (hora < 12) {
            return "Bom dia, " + name + "! Seja bem-vindo(a)!";
        } if (hora >= 12 && hora < 18) {
            return "Boa tarde, " + name + "! Seja bem-vindo(a)!";
        } else {
            return "Boa noite, " + name + "! Seja bem-vindo(a)!";
        }
    
    }

    public void increaseValue(double value) {
        account += value;
    }
}