public class Tester {
    public static void main(String[] args) {
        //Cloth object
        Cloth cloth = new Cloth();
        cloth.setPrice(25); //Setting cloth price to R25
        cloth.getPrice();
        if (cloth instanceof OnlineShop) {
            cloth.displayUtility();
            cloth.displayPrice();
        }
        //Toy object
        Toys doll = new Toys();
        doll.setPrice(50); //Setting doll price to R50
        doll.getPrice();
        if (doll instanceof OnlineShop) {
            doll.displayUtility();
            doll.displayPrice();
        }
        //Electronics Object
        Electronics charger=new Electronics();
        charger.setPrice(70);//Setting charger price to R70
        charger.getPrice();
        if (charger instanceof OnlineShop) {
            charger.displayUtility();
            charger.displayPrice();
        }
    }
}



