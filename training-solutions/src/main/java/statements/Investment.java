package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return fund * interestRate / 100.0 / 365 * days;
    }

    public double close(int days){
        double b = active ? (fund + getYield(days)) * (1.0 - cost/100) : 0;
        return b;
    }


}
