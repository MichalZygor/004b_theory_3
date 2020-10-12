public class DiscountApp {
    public static void main(String[] args) {
        String firstName = "jan";
        String lastName = "kowalski";
        boolean clientPremium = true;
        double price = 1100; //PLN
        double discountPrice = price;

        if (clientPremium && price > 1000) {
            discountPrice *= 0.85;
        }else if (price > 1000){
            discountPrice *= 0.9;
        }else if (clientPremium){
            discountPrice *= 0.95;
        }

        System.out.println("Witaj " + firstName + " " + lastName);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Kwota po rabacie: " + discountPrice);


    }
}
