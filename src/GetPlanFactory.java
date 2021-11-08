
class GetPlanFactory{
    public CaesarPrice getCaesarPrice(String coffeeType){
        if(coffeeType == null){
            return null;
        }
        if(coffeeType.equalsIgnoreCase("market")) {
            return new Market();
        }
        else if(coffeeType.equalsIgnoreCase("cafe")){
            return new Cafe();
        }
        else if(coffeeType.equalsIgnoreCase("restaurant")) {
            return new Restaurant();
        }
        return null;
    }
}
