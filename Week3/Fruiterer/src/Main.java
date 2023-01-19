public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("customer");
        ShopManagement shopManagement = new ShopManagement();
        shopManagement.shopping(customer, FruitType.APPLE, 9);
        shopManagement.shopping(customer, FruitType.APPLE, 3);
        shopManagement.shopping(customer, FruitType.PEAR, 5);
        shopManagement.shopping(customer, FruitType.PEAR, 2);
        shopManagement.shopping(customer, FruitType.CHERRY, 4);
        shopManagement.showStore();


    }
}