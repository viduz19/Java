public class Company {
 String name;
    public Company(){

      name = "OpenIT";
    }

    public static class Subsidiary {

        public static void main(String[] args) {
          Company c = new Company();
            System.out.println("Company Name : " + c.name);

        }

    }

}
