public class VeggieHoagie extends Hoagie{
    String [] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String [] condimentsUsed = {"Oil", "Vinegar"};

    boolean wantsMeat(){ return false;}
    boolean wantsCheese(){ return false;}

    @Override
    void addMeat(){}

    @Override
    void addCheese(){}

    @Override
    void addVegetables() {
        System.out.println("\nAdding the Veggies");
        for(String vegetable:vegetablesUsed){
            System.out.println(vegetable + " " );
        }
    }

    @Override
    void addCondiments() {
        System.out.println("\nAdding the Condiments");
        for(String condiment:condimentsUsed){
            System.out.println(condiment + " " );
        }
    }
}
