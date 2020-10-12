public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price = 1100; //PLN
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Kwota po rabacie: " + discountPrice);


        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100; //PLN
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);

        System.out.println("Witaj " + client2.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Kwota po rabacie: " + discountPrice2);


    }
}
