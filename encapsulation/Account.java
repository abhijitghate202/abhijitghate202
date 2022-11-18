package encapsulation;

public class Account {
    private int accountNo;
    private String name;
    private Double amount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

class accountImpl {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(89503);
        account.setAmount(55499.5);
        account.setName("Abhijit Ghate");
        System.out.println("Account Number : " + account.getAccountNo());
        System.out.println("Amount : " + account.getAmount());
        System.out.println("Name : " + account.getName());
    }
}