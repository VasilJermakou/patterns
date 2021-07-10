package creationalpatterns.builder;

public class BankAccount {

    /* outer class fields */
    private String name;
    private String accountNumber;
    private String email;

    /* constructors */
    private BankAccount(){
        this.name = "John Doe";
        this.accountNumber = "BY56ALFA30123333444455556666";
        this.email = "jdou@gmail.com";
    }

    private BankAccount(String name, String accountNumber, String email){
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
    }

    private BankAccount(BankAccountBuilder builder){
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* object methods */
    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /* inner static class */
    public static class BankAccountBuilder{

        /* inner class fields */
        private String name;
        private String accountNumber;
        private String email;

        /* inner class constructor */
        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        /* builder methods */
        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccount build(){
            return  new BankAccount(this);
        }
    }//ends of inner class
}
