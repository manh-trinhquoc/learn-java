
class BankAccountBoundaryImpl implements BankAccountBoundary {
 
    /*
     * This is a gateway to account database
     */
    private BankAccountGateway accountGateway;
 
    public BankAccountBoundaryImpl() {
        accountGateway = DependencyResolver.getBankAccountGateway();
    }
 
    @Override
    public BankAccountWithdrawResponseModel wihdraw(BankAccountWithdrawRequestModel request) {
 
        BankAccount account = accountGateway.getByNumber(request.getAccountNumber());
 
        boolean withdrawResult = account.withdraw(request.getAmount());
 
        BankAccountWithdrawResponseModel response = new BankAccountWithdrawResponseModel();
 
        if(withdrawResult) {
            accountGateway.save(account);
            response.setResult("Withdraw Successfully");
        }
        else {
            response.setResult("Insufficient amount");
        }
 
        return response;
    }
 
    @Override
    public BankAccountDepositResponseModel deposit(BankAccountDepositRequestModel request) {
        // ...
    }
 
}