public class Main {

    public static void main(String[] args) {
        char harf = 'ü';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce Harf");
                break;
            default:
                System.out.println("Geçersiz Harf Girdiniz");
        }


    }
}
