public class Bankaccount {
    public String owner;
    private double balance;
    protected int age;

    public double getBalance() {....}

    public void deposit (double dollars) {....}

    public void withdraw (double dollars) {....}

    protected void  setBalance( double dollars) {....}

    protected void  transfer (Bankaccount other, double amount) {....}

    private String getOwner() {.....}

}
