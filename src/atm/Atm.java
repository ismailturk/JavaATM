package atm;

import java.util.Scanner;

public class Atm {
	static int bakiye;
	static Scanner scan=new Scanner(System.in);
   public static void login()
    {
	 
       
        System.out.println("************ T�RK BANKASINA HO�GELD�N�Z ************");
        System.out.println("\n L�tfen kullan�c� ad�n�z� giriniz ");
        String kullanici_adi=scan.nextLine().trim();
        System.out.println("L�tfen �ifrenizi giriniz");
        String sifre=scan.nextLine().trim();
        System.out.println("\n********** HESAP AYRINTILARI ***********");
        if(kullanici_adi.equals ("ismailturk") && sifre.equals("191141006"))
        {
            String isim="�smail T�rk";
            bakiye=115000;
            System.out.println("\nHo�geldiniz " + isim );
        }
        else if(kullanici_adi.equals("furkanaydin") && sifre.equals("191141009"))
        {
            String isim="Furkan Ayd�n";   
            bakiye=56000;
            System.out.println("\nHo�geldiniz " + isim );
        }
        else if(kullanici_adi.equals("mertciril") && sifre.equals("191141023"))
        {
            String isim="Mert �iril";
            bakiye=87000;
            System.out.println("\nHo�geldiniz " + isim );
        }
        else if(kullanici_adi.equals("tugruluzun") && sifre.equals("191141008"))
        {
            String isim="Tu�rul Uzun";   
            bakiye=150000;
            System.out.println("\nHo�geldiniz " + isim  );
        } 
        else if(kullanici_adi .equals("halithamioz") && sifre.equals("123456789"))
        {
            String isim="Halit Hami �z";
            bakiye=97000;
            System.out.println("\nHo�geldiniz " + isim );
        }
        else
        {
            System.out.println("HESAP BULUNAMADI.L�TFEN TEKRAR DENEY�N�Z..");
            System.exit(0);
        }
    }
   public static void menu() {

    	   System.out.println("\n** MEN� **\n");
    	   System.out.println("1-Para Yat�rma");
    	   System.out.println("2-Para �ekme ");
    	   System.out.println("3-Bakiye G�r�nt�le ");
    	   System.out.println("4-Para G�nderme ");
    	   System.out.println("5-��k�� ");
    	   System.out.println();
    }
   public static int secenekAl() {
    	   System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
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
    			System.out.println("Yanl�� se�enek se�tiniz.L�tfen yeniden deneyiniz.");
    		}
    	   
    	   
       }
   public static void paraYatir() {
    	   
    	   int yatirilanPara;
    	   System.out.println("Se�ilen i�lem--> Para Yat�rma ");
    	   
    	   System.out.println("Hesaptaki Paran�z:"+bakiye+" TL");
    	   
    	  do { System.out.println("Yat�rmak istedi�iniz paray� giriniz:");
    	   yatirilanPara=scan.nextInt();
    	   
    	   
    	   if(yatirilanPara<0) {
    		   System.out.println("HATALI  DE�ER G�R��� YAPTINIZ TEKRAR DENEY�N ");
    	   }
    	   
    	   
    	  }
    	  while(yatirilanPara<0);
    	  
    	  bakiye=bakiye+yatirilanPara;
    	  System.out.println("Hesab�n�za Para Yat�r�ld� Yeni Bakiyeniz: "+bakiye+ "TL");
    	  
    	  
       }
   public static void paraCekme() {
    	   int cekilenPara;
    	   System.out.println("Se�ilen i�lem--> Para �ekme ");
    	   System.out.println("Hesaptaki Paran�z:"+bakiye+" TL");
    	   do {
    	   System.out.println("�ekmek �stedi�iniz Tutar� Giriniz: ");
    	   cekilenPara=scan.nextInt();
    	   if(cekilenPara>bakiye) {
    		   
    		   System.out.println("Yetersiz Bakiye...L�tfen tekrar de�er giri�i yap�n�z.");
    	   }
    	   
    	   }
    	   while(cekilenPara>bakiye);
    	   
    	   bakiye=bakiye-cekilenPara;
    	   
    	   System.out.println("Hesab�n�zdan Para �ekildi Yeni Bakiyeniz: "+bakiye+"TL");
       }
   public static void bakiyeSor() {
	   
	   System.out.println("Se�ilen i�lem--> Bakiye G�r�nt�leme ");
	   System.out.println("Hesaptaki Paran�z:"+bakiye+" TL");
	   
}
   public static void cikis() {

       			System.out.println("��k�� Yap�ld�. �yi G�nler Dileriz...");
       		}
   public static void menuYonlendirme() {
       			System.out.println("\n Men�ye tekrar Y�nlendiriliyorsunuz...\n");
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
