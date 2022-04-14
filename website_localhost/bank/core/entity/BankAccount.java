public class BankAccount extends Entity {
 
    private String number;
 
    private BigDecimal balance;
 
    public BankAccount() {
        balance = BigDecimal.ZERO;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public BigDecimal getBalance() {
        return balance;
    }
 
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
 
    public boolean withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        balance = balance.subtract(amount);
        return true;
    }
 
    public boolean deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        balance = balance.add(amount);
        return true;
    }
 
}