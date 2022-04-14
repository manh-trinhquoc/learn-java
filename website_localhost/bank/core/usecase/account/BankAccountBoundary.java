/*
 * Outer component (like MVC Controller) only know and work this boundary (with two use-cases, currently)
 *
 */
public interface BankAccountBoundary {
 
    public BankAccountWithdrawResponseModel wihdraw(BankAccountWithdrawRequestModel request);
 
    public BankAccountDepositResponseModel deposit(BankAccountDepositRequestModel request);
 
}
