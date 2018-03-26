public class Main {
    public static void main(String[] args){

        int accountNumber = 12345678;
        int securityCode = 1234;

        /*
        // instead of doing this...
        WelcomeToBank bankWelcome = new WelcomeToBank(); // prints welcome-text on initialization
        AccountNumberCheck acctChecker = new AccountNumberCheck();
        SecurityCodeCheck codeChecker = new SecurityCodeCheck();
        FundsCheck fundChecker = new FundsCheck();

        if(acctChecker.accountActive(accountNumber) &&
                codeChecker.isCodeCorrect(securityCode) &&
                fundChecker.haveEnoughMoney(50.00)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

        if(acctChecker.accountActive(accountNumber) &&
                codeChecker.isCodeCorrect(securityCode) &&
                fundChecker.haveEnoughMoney(990.00)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

        */
        ////////////////////////////////////////////////////////////////////////

        // we can do this!
        BankAccountFacade accessingBank = new BankAccountFacade(accountNumber, securityCode);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(990.00);

    }
}
