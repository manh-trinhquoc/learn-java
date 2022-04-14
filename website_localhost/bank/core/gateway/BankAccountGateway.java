public interface BankAccountGateway extends EntityGateway {
 
    public BankAccount getByNumber(String number);
 
}