public class Main {
    public static void main(String[] args) {


        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown

        // 1.c példányosítás, objektumok
        // 2.b paraméteres konstruktor
        BankAccount customerAccount = new BankAccount("77777777-77777777-77777777");
        customerAccount.setAccountNumber("11111111-11111111-11111111");
        customerAccount.setAccountHolder("Nagy Sándor");
        customerAccount.setBalance(57893333);
        System.out.println(customerAccount.getAccountNumber()+" a bankszámla száma.");
        System.out.println(customerAccount.getAccountHolder()+" a számlatulajdonos neve");
        System.out.println(customerAccount.getBalance()+" Ft van a számláján.");

        BankAccount myAccount = new BankAccount("0000000000000000", "Gipsz Jakab", 444444444);
        System.out.println(myAccount.getAccountHolder()+" a nevem "+
                myAccount.getAccountNumber()+" ez a számlaszámom "+
                myAccount.getBalance()+" és ez az egyenlegem ");



    }
}
