public class Cars {

    String cars;


    Cars(String car){
       cars = car;
        System.out.println( "Brand :" + cars);
    }
    public static void main(String[] args) {
        Cars bmw = new Cars("bmw");
        Cars benz = new Cars("benz");
        Cars audi = new Cars("audi");
        Cars mazda = new Cars("mazda");

    }
}
