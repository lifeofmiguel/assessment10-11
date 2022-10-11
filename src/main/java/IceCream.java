public class IceCream extends Product implements Consumable,LickAble{
    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {

    }
}
