public class Dishes implements Priceable {
    private int count;
    private int pricec;
    Dishes(int count,int pricec){
        this.count=count;
        this.pricec=pricec;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPricec(int pricec) {
        this.pricec = pricec;
    }

    public int getCount() {
        return count;
    }

    public int getPricec() {
        return pricec;
    }
    @Override
    public String toString() {
        return "Dishes{" +
                "count=" + count +
                ", pricec=" + pricec +
                '}';
    }


    @Override
    public double getPrice() {
        return count*pricec;
    }
}
