public class Food implements Priceable {
    private double weight;
    private int pricekg;
    Food(double weight,int pricekg){
        this.weight = weight;
        this.pricekg=pricekg;
    }

    public void setPricekg(int pricekg) {
        this.pricekg = pricekg;
    }

    public int getPricekg() {
        return pricekg;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return pricekg*weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                ", pricekg=" + pricekg +
                '}';
    }
}
