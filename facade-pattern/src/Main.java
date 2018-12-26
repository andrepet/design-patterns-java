public class Main {
    public static void main(String[] args){

        int accountNumber = 12345678;
        int securityCode = 1234;

// instead of doing all of this....

        // create all necessary bank-entities
        WelcomeToBank bankWelcome = new WelcomeToBank(); // prints welcome-text on initialization
        AccountNumberCheck acctChecker = new AccountNumberCheck();
        SecurityCodeCheck codeChecker = new SecurityCodeCheck();
        FundsCheck fundChecker = new FundsCheck();

        // try to withdraw 50:- from our static account, contains 950:-
        if(acctChecker.accountActive(accountNumber) &&
                codeChecker.isCodeCorrect(securityCode) &&
                fundChecker.haveEnoughMoney(50.00)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

        // try to withdraw 990:- from our static account, contains 950:-
        if(acctChecker.accountActive(accountNumber) &&
                codeChecker.isCodeCorrect(securityCode) &&
                fundChecker.haveEnoughMoney(990.00)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }













        ////////////////////////////////////////////////////////////////////////



// we can hide the entire sub-system using a facade class and use a more convenient API
        System.out.println();
        System.out.println("Using a facade-class...");
        System.out.println();
        BankAccountFacade accessingBank = new BankAccountFacade(accountNumber, securityCode);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(990.00);

    }
}
