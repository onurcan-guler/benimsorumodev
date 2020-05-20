
package OzbaySayi;


public class OzbaySayi {
    public static int tersCevir(int sayi){
        int tersSayi=0;
        int ilkSayi=sayi;
        while(sayi>0){
            int kalan=sayi%10;
            sayi/=10;
            tersSayi=tersSayi*10+kalan;
        }
        return tersSayi;
    }
    private static boolean asalMi(int sayi){
        boolean kontrol=true;
        for(int i=2;i<sayi;i++){
            if(sayi%i!=0 && sayi==(i+1)){
                return kontrol;
            }else if(sayi%i==0){
                kontrol=false;
                return kontrol;
            }
        }
        return kontrol;
    }
    public static void main(String[] args) {
        for(int i=1;i<3050;i++){
          özbaysayi(i);
        }
    }
    public static void özbaysayi(int sayi){
        int sayac=0;
        while(sayac<101){
       if(tersCevir(sayi)!=sayi){
           if(asalMi(sayi) && asalMi(tersCevir(sayi))){
               sayac++;
               System.out.println("Özbay sayı: "+sayi);
               break;
           }else{
               break;
           }
       }else{
           break;
       }
            }
        }
}
    
    
    

