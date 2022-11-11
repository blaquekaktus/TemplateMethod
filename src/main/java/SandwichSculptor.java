public class SandwichSculptor{

    public static void main(String[] args) {
        Hoagie sonjaHoagie = new ItalianHoagie();
        sonjaHoagie.makeSandwich();

        Hoagie balazsHoagie = new VeggieHoagie();
        balazsHoagie.makeSandwich();

        Hoagie susiHoagie = new ItalianHoagie();
        susiHoagie.makeSandwich();

    }

}
