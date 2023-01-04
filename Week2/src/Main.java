import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Araç nesnelerinin tanımlanması
        Hatchback hatchback = new Hatchback(2006, "Black", 100, 180, 5);
        Sedan sedan = new Sedan(2016, "White", 120, 220, 400);
        Suv suv = new Suv(2021, "Grey", 150, 240, "4x4");
        Scanner scanner = new Scanner(System.in);
        // Giriş ve araç kiralama
        System.out.println("Araç kiralama sistemine hoş geldiniz.");
        System.out.println("Şirket hesabına giriş için 1'e kişisel hesaba giriş için 2'ye basınız :");
        int login = scanner.nextInt();
        if (login == 1) {
            Company company1 = new Company("Company1");
            System.out.println("Şirket hesabına giriş yaptınız.");
            System.out.println("Kiralayabileceğiniz araçlar :");
            System.out.println("1-SUV\n" + "2-Sedan\n" + "3-Hatchback");
            int selCar = scanner.nextInt();
            switch (selCar) {
                case 1:
                    System.out.println("1- Günlük kiralama\n" + "2- Aylık kiralama");
                    int rentType = scanner.nextInt();
                    if (rentType == 1) {
                        System.out.println("Kiralanacak gün sayısını giriniz :");
                        int day = scanner.nextInt();
                        company1.rentCarDaily(suv, day);
                    } else if (rentType == 2) {
                        System.out.println("Kiralanacak ay sayısını giriniz");
                        int month = scanner.nextInt();
                        company1.rentCarMonth(suv, month);
                    }
                    break;
                case 2:
                    System.out.println("1- Günlük kiralama\n" + "2- Aylık kiralama");
                    rentType = scanner.nextInt();
                    if (rentType == 1) {
                        System.out.println("Kiralanacak gün sayısını giriniz :");
                        int day = scanner.nextInt();
                        company1.rentCarDaily(sedan, day);
                    } else if (rentType == 2) {
                        System.out.println("Kiralanacak ay sayısını giriniz");
                        int month = scanner.nextInt();
                        company1.rentCarMonth(sedan, month);
                    }
                    break;
                case 3:
                    System.out.println("Hatchback aracı sadece günlük kiralayabilirisiniz.");
                    System.out.println("Kiralanacak gün sayısını giriniz :");
                    int day = scanner.nextInt();
                    company1.rentCarDaily(hatchback, day);
                    break;
            }
        } else if (login == 2) {
            Citizen citizen1 = new Citizen("Citizen1");
            System.out.println("Kişisel hesaba giriş yaptınız :");
            System.out.println("Sadece hatchback aracı günlük kiralayabilirsiniz.");
            System.out.println("Kiralanacak gün sayısını giriniz :");
            int day = scanner.nextInt();
            citizen1.rentCarDaily(hatchback, day);
        } else {
            System.out.println("Hatalı bir değer girdiniz.");
        }

    }
}