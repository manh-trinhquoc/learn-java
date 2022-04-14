public class BankAccountPresenter implements ResponseModelConsummer {
 
    @Override
    public void accept(BankAccountWithdrawResponseModel response) {
        String result = response.getResult();
        // Format then pass the result to View (Web page)
        System.out.println(String.format("Output to View: %s", result));
    }
 
}