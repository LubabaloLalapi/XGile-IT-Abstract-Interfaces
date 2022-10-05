class Cloth extends ShoppingCart implements OnlineShop {

    @Override
    public void displayUtility(){ //Overides method from Portal Interface
        System.out.println("This is the cloth section");
    }
    @Override
    public void displayPrice() { //Overides abstract method from ShoppingCart abstract class
        System.out.println("Price =" + "R"+price);
    }
}