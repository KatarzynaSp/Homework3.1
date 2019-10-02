public class Test {
    public static void main(String[] args) {

        Commode commode1 = new Commode();
        commode1.name = "Komoda Agata ";
        commode1.color = "Szary ";
        commode1.price = 34.50;

        Commode commode2 = new Commode();
        commode2.name = "Komoda Beata ";
        commode2.color = "Czerwony ";
        commode2.price = 48.99;

        System.out.printf("Nazwa: %s, Kolor: %s, Cena: %2.2f, \n", commode1.name, commode1.color, commode1.price);
        System.out.printf("Nazwa: %s, Kolor: %s, Cena: %2.2f, \n", commode2.name, commode2.color, commode2.price);
    }
}
