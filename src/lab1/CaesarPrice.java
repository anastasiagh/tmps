package lab1;

abstract class CaesarPrice{
    protected double price;
    abstract void getCaesarPrice();

    public void calculateBill(int units){
        System.out.println(units*price);
    }
}
