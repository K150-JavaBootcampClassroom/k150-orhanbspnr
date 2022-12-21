import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random();
        int number = random.nextInt(500);

        while (number < 50 || number > 100) {
            System.out.println("Rastgele Sayı : " + number);
            counter++;
            number = random.nextInt(500);
        }
        System.out.println(number + " sayısı, 50 ile 100 arasındadır.");
        System.out.println("50 ile 100 arasındaki sayı " + counter + ". seçimde bulundu.");


    }
}