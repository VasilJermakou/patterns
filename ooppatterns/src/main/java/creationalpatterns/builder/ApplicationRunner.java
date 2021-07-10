package creationalpatterns.builder;

public class ApplicationRunner {
    public static void main(String[] args) {

        BankAccount alfaBankAccount = new BankAccount.BankAccountBuilder("Linus Torvalds", "BY56ALFA301211112222333344445555")
                                                     .withEmail("linux@gmail.com")
                                                     .build();

        System.out.println(alfaBankAccount.toString());

        System.out.println("------------------------");

        BankAccount swissBankAccount = new BankAccount.BankAccountBuilder("Uncle Bob", "BY56SWIS301211112222333344445555")
                                                      .build();
        System.out.println(swissBankAccount.toString());

    }
}
