public class Runner {

    public static void main(String[] args) {
        Cember cember = new Cember();
        System.out.println(cember.cemberVeKareAlan(5));
        System.out.println(cember.cemberVeKareCevre(5));
        Kare kare = new Kare();
        System.out.println(kare.cemberVeKareAlan(5));
        System.out.println(kare.cemberVeKareCevre(5));
        Dikdörtgen dikdörtgen = new Dikdörtgen();
        System.out.println(dikdörtgen.cevreDikdortgen(5, 5));
        System.out.println(dikdörtgen.alanDikdortgen(5, 5));
        Ücgen üçgen = new Ücgen();
        System.out.println(üçgen.ucgenCevre(5, 5, 5));
        System.out.println(üçgen.alanDikdortgen(5, 5));
    }



















}
