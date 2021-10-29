public class Testprice {
    public static void main(String[] args)
    {
        Dishes d1=new Dishes(5,50);
        Dishes d2=new Dishes(7,20);
        Food f1=new Food(2,53);
        System.out.println(d1+"Final price: "+d1.getPrice());
        System.out.println(d2+"Final price: "+d2.getPrice());
        System.out.println(f1+"Final price: "+f1.getPrice());
    }
}
