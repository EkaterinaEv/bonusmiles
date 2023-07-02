public class Main {
    public static void main(String[] args) {
        int ticketprice = 13676; // стоимость билета
        int bonusprice = 20; // количество рублей для одной бонусной мили

        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println(ticketprice / bonusprice);
    }
}