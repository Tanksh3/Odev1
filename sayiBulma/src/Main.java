public class Main {

    public static void main(String[] args) {
	int[] sayilar = new int [] {1,2,3,4,5,6 };
	int aranacak=12;
boolean varMi=false;

	for (int sayi : sayilar){
	    if(sayi == aranacak){
	        varMi=true;
	        break;
        }
    }
	     if (varMi){
	         System.out.println("Sayı Mevcuttur");
         }
	     else {
	         System.out.println("Sayı Mevcut Değildir");
         }
    }
}
