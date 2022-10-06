import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı girin: ");
        month = inp.nextInt();

        System.out.print("Lütfen doğduğunuz günü girin: ");
        day = inp.nextInt();

        if (month == 1) {
            if ((day > 21) && (day <= 31)) {
                System.out.println("Kova burcusunuz.");
            } else if ((day <= 21) && (day >= 1)) {
                System.out.println("Oğlak burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 2) {
            if ((day > 19) && (day <= 29)) {
                System.out.println("Balık burcusunuz.");
            } else if ((day <= 19) && (day >= 1)) {
                System.out.println("Kova burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 3) {
            if ((day > 20) && (day <= 31)) {
                System.out.println("Koç burcusunuz.");
            } else if ((day <= 20) && (day >= 1)) {
                System.out.println("Balık burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 4) {
            if ((day > 20) && (day <= 30)) {
                System.out.println("Boğa burcusunuz.");
            } else if ((day <= 20) && (day >= 1)) {
                System.out.println("Koç burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 5) {
            if ((day > 21) && (day <= 31)) {
                System.out.println("İkizler burcusunuz.");
            } else if ((day <= 21) && (day >= 1)) {
                System.out.println("Boğa burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 6) {
            if ((day > 22) && (day <= 30)) {
                System.out.println("Yengeç burcusunuz.");
            } else if ((day <= 22) && (day >= 1)) {
                System.out.println("İkizler burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 7) {
            if ((day > 22) && (day <= 31)) {
                System.out.println("Aslan burcusunuz.");
            } else if ((day <= 22) && (day >= 1)) {
                System.out.println("Yengeç burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 8) {
            if ((day > 22) && (day <= 31)) {
                System.out.println("Başak burcusunuz.");
            } else if ((day <= 22) && (day >= 1)) {
                System.out.println("Aslan burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 9) {
            if ((day > 22) && (day <= 30)) {
                System.out.println("Terazi burcusunuz.");
            } else if ((day <= 22) && (day >= 1)) {
                System.out.println("Başak burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 10) {
            if ((day > 22) && (day <= 31)) {
                System.out.println("Akrep burcusunuz.");
            } else if ((day <= 22) && (day > 1)) {
                System.out.println("Terazi burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month == 11) {
            if ((day > 21) && (day <= 30)) {
                System.out.println("Yay burcusunuz.");
            } else if ((day<=21) && (day>=1)) {
                System.out.println("Akrep burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else if (month==12) {
            if ((day>21) && (day<=31)){
                System.out.println("Oğlak burcusunuz.");
            } else if ((day<=21) && (day>=1)) {
                System.out.println("Yay burcusunuz.");
            } else {
                System.out.println("Hatalı girdiniz.");
            }
        } else {
            System.out.println("Hatalı girdiniz.");
        }

        System.out.println("Doğduğunuz ay: "+month+". ay");
        System.out.println("Doğduğunuz gün: "+day);

    }
}
