import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int select;
        boolean isCheck = true;
        System.out.println("Bankamatiğe Hoşgeldiniz.");
        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
            System.out.println("1-Para Çekme\n" +
                    "2-Para Yatırma\n" +
                    "3-Bakiye Öğrenme\n" +
                    "4-Çıkış Yap");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Çekmek istediğiniz tutar :");
                    int price = scanner.nextInt();
                    if (price > balance) {
                        System.out.println("Yetersiz bakiye !");
                    } else {
                        balance -= price;
                        System.out.println("Para Çekildi.");
                    }
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutar :");
                    price = scanner.nextInt();
                    balance += price;
                    System.out.println("Para Yatırıldı.");
                    break;
                case 3:
                    System.out.println("Bakiye : " + balance);
                    break;
                case 4:
                    System.out.println("Çıkış Yapıldı.");
                    isCheck = false;
                    break;
            }
        } while (isCheck);


    }
}