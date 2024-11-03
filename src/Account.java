public class Account {

    private String id;
    private String name;
    private int balance;


    public Account() {

    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String credit(int amount) {
        if(amount < 0){
            return "you can't enter negative amount";
        }else{

            balance += amount;
            return "transaction for " + name +" Credit "+amount+" balance:"+ balance;
        }
    }
    public String debit(int amount) {
        if(amount > balance){
            return "transaction for " + name +" ("+amount+") the amount is over the balance ("+balance+")";
        }else if(amount < 0){
           return "you can't enter negative amount";
        }else{
            balance -= amount;
            return "transaction for " + name +" Debit "+amount+" balance:"+ balance;
        }

    }
    public String transferTo(Account another, int amount) {
        if(amount > this.balance){
            return "transaction for " + name +" ("+amount+") the amount is over the balance ("+balance+")";
        }else if(amount < 0){
            return "you can't enter negative amount";
        }else{
            another.balance += amount;
            this.balance -= amount;
            return "transaction for " + name +" Transfer "+amount+" balance:"+ this.balance;
        }
    }
    public String toString() {
        return "Account info:"+"\nid : "+this.id +"\nName : "+this.name +"\nBalance : "+this.balance;
    }
}
