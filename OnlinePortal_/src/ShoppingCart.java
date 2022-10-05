abstract class ShoppingCart implements Portal {

    int price;
    abstract void displayPrice();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
