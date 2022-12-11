public class Ücgen extends Geo{


    @Override
    public double ucgenCevre(double a, double b, double c) {
        return a+b+c;
    }


    @Override
    public double alanDikdortgen(double taban, double yükseklik) {
        return taban*yükseklik/2;
    }
}
