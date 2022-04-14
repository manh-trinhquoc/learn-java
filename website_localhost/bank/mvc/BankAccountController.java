public class BankAccountController {
 
    private BankAccountBoundary bankAccountBoundary;
    private BankAccountPresenter presenter;
 
    public BankAccountController(final BankAccountPresenter presenter) {
 
        this.presenter = presenter;
 
        this.bankAccountBoundary = DependencyResolver.getBankAccountBoundary();
    }
 
    public void withdraw(String acountNumber, BigDecimal amount) {
        // Create a request model
        BankAccountWithdrawRequestModel request = new BankAccountWithdrawRequestModel();
        request.setAccountNumber(acountNumber);
        request.setAmount(amount);
        // Delegate the request to boundary (or use-case) object
        BankAccountWithdrawResponseModel response = bankAccountBoundary.wihdraw(request);
        // Start data binding
        presenter.accept(response);
    }
 
}