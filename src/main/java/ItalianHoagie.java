public class ItalianHoagie extends Hoagie{
    String [] meatUsed = {"Salami", "Pepporini", "Capiola Ham"};
    String [] cheeseUsed = {"Provolone"};
    String [] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String [] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void addMeat() {
        System.out.println("\nAdding the Meat");
        for(String meat:meatUsed){
            System.out.println(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.println("\nadding the Cheese");
        for(String cheese:cheeseUsed){
            System.out.println(cheese + " " );
        }
    }

    @Override
    void addVegetables() {
        System.out.println("\nAdding the Vegetables");
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
