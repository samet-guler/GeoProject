public  class Geo {


    /* 1-asagidaki hiyararsiye gore class creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare
     sekil <--Üçgen

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
    3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
    */


  public double alanDikdortgen(double a, double b){
         return a*b;
     }
     public double cevreDikdortgen(double a, double b){
         return 2*(a+b);
     }

   public double cemberVeKareAlan(double a){
        return Math.PI*a*a;
    }


   public double cemberVeKareCevre(double a){
        return 2*Math.PI*a;
    }

    public double ucgenCevre(double a, double b, double c){
      return a+b+c;
    }


















}
