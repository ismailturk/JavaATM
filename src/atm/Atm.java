package atm;

import java.util.Scanner;

public class Atm {
	static int bakiye;
	static Scanner scan=new Scanner(System.in);
   public static void login()
    {
	 
       
        System.out.println("************ TÜRK BANKASINA HOÞGELDÝNÝZ ************");
        System.out.println("\n Lütfen kullanýcý adýnýzý giriniz ");
        String kullanici_adi=scan.nextLine().trim();
        System.out.println("Lütfen þifrenizi giriniz");
        String sifre=scan.nextLine().trim();
        System.out.println("\n********** HESAP AYRINTILARI ***********");
        if(kullanici_adi.equals ("ismailturk") && sifre.equals("191141006"))
        {
            String isim="Ýsmail Türk";
            bakiye=115000;
            System.out.println("\nHoþgeldiniz " + isim );
        }
        else if(kullanici_adi.equals("furkanaydin") && sifre.equals("191141009"))
        {
            String isim="Furkan Aydýn";   
            bakiye=56000;
            System.out.println("\nHoþgeldiniz " + isim );
        }
        else if(kullanici_adi.equals("mertciril") && sifre.equals("191141023"))
        {
            String isim="Mert Çiril";
            bakiye=87000;
            System.out.println("\nHoþgeldiniz " + isim );
        }
        else if(kullanici_adi.equals("tugruluzun") && sifre.equals("191141008"))
        {
            String isim="Tuðrul Uzun";   
            bakiye=150000;
            System.out.println("\nHoþgeldiniz " + isim  );
        } 
        else if(kullanici_adi .equals("halithamioz") && sifre.equals("123456789"))
        {
            String isim="Halit Hami Öz";
            bakiye=97000;
            System.out.println("\nHoþgeldiniz " + isim );
        }
        else
        {
            System.out.println("HESAP BULUNAMADI.LÜTFEN TEKRAR DENEYÝNÝZ..");
            System.exit(0);
        }
    }
   public static void menu() {

    	   System.out.println("\n** MENÜ **\n");
    	   System.out.println("1-Para Yatýrma");
    	   System.out.println("2-Para Çekme ");
    	   System.out.println("3-Bakiye Görüntüle ");
    	   System.out.println("4-Para Gönderme ");
    	   System.out.println("5-Çýkýþ ");
    	   System.out.println();
    }
   public static int secenekAl() {
    	   System.out.println("Yapmak istediðiniz iþlemi seçiniz");
    	   int secenek=scan.nextInt();
    	   
    	   return secenek;
       }
   public static void secenekKontrol(int secenek) {
    	   if(secenek==1) {
    		   
    		   paraYatir();
    	   }
    	   else	if(secenek==2) {
    		   
    		   paraCekme();
    	   }
    	   	else if(secenek==3) {
     		   
     		   bakiyeSor();
     	   }
    	   	else if(secenek==4) {
    		   
    		   
    	   }
    		else if(secenek==5) {
     		   
     		   cikis();
     	   }
    		else {
    			System.out.println("Yanlýþ seçenek seçtiniz.Lütfen yeniden deneyiniz.");
    		}
    	   
    	   
       }
   public static void paraYatir() {
    	   
    	   int yatirilanPara;
    	   System.out.println("Seçilen iþlem--> Para Yatýrma ");
    	   
    	   System.out.println("Hesaptaki Paranýz:"+bakiye+" TL");
    	   
    	  do { System.out.println("Yatýrmak istediðiniz parayý giriniz:");
    	   yatirilanPara=scan.nextInt();
    	   
    	   
    	   if(yatirilanPara<0) {
    		   System.out.println("HATALI  DEÐER GÝRÝÞÝ YAPTINIZ TEKRAR DENEYÝN ");
    	   }
    	   
    	   
    	  }
    	  while(yatirilanPara<0);
    	  
    	  bakiye=bakiye+yatirilanPara;
    	  System.out.println("Hesabýnýza Para Yatýrýldý Yeni Bakiyeniz: "+bakiye+ "TL");
    	  
    	  
       }
   public static void paraCekme() {
    	   int cekilenPara;
    	   System.out.println("Seçilen iþlem--> Para Çekme ");
    	   System.out.println("Hesaptaki Paranýz:"+bakiye+" TL");
    	   do {
    	   System.out.println("Çekmek Ýstediðiniz Tutarý Giriniz: ");
    	   cekilenPara=scan.nextInt();
    	   if(cekilenPara>bakiye) {
    		   
    		   System.out.println("Yetersiz Bakiye...Lütfen tekrar deðer giriþi yapýnýz.");
    	   }
    	   
    	   }
    	   while(cekilenPara>bakiye);
    	   
    	   bakiye=bakiye-cekilenPara;
    	   
    	   System.out.println("Hesabýnýzdan Para Çekildi Yeni Bakiyeniz: "+bakiye+"TL");
       }
   public static void bakiyeSor() {
	   
	   System.out.println("Seçilen iþlem--> Bakiye Görüntüleme ");
	   System.out.println("Hesaptaki Paranýz:"+bakiye+" TL");
	   
}
   public static void cikis() {

       			System.out.println("Çýkýþ Yapýldý. Ýyi Günler Dileriz...");
       		}
   public static void menuYonlendirme() {
       			System.out.println("\n Menüye tekrar Yönlendiriliyorsunuz...\n");
       		}
      
   
   
   
   
   
   public static void main(String[] args) {
    	   int secenek;
		Atm giris=new Atm();
			giris.login();
			
			do {
				menu();
				secenek=secenekAl();
				secenekKontrol(secenek);
				if(secenek == 5) {
					break;
				}
			menuYonlendirme();
			}while(secenek != 5);
	}

}
