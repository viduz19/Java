public class Programming {

    String name;

    Programming() {

        System.out.println("Constructor called:");
        name = "Programmer";

    }

    public static void main(String[] args) {
        Programming vidusha = new Programming();
        System.out.println("Name is :- "+ vidusha.name );

    }
}
