public abstract class Hoagie {

    final void makeSandwich(){

        cutBun();

        if(wantsMeat()){
            addMeat();
        }

        if(wantsCheese()){
            addCheese();
        }

        if(wantsVegetables()){
            addVegetables();
        }

        if(wantsCondiments()){
            addCondiments();
        }

        wrapHoagie();
    }

    public void cutBun(){
        System.out.println("\nThe Bun is cut");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();


    boolean wantsMeat(){
        return true;
    }
    boolean wantsCheese(){
        return true;
    }
    boolean wantsVegetables(){
        return true;
    }
    boolean wantsCondiments(){
        return true;
    }

    public void wrapHoagie(){
        System.out.println("The Hoagie is wrapped and ready to be served\n");
    }

}
