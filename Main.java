public class Main {
    public static void main(String[] args) {
        NoGenericMethods one = new NoGenericMethods("Em", "dic", "Ana");
        System.out.println(one.getObjecte1());
        System.out.println(one.getObjecte2());
        System.out.println(one.getObjecte3());

        NoGenericMethods two = new NoGenericMethods("Em", "dic", "Ana");
        System.out.println("\n"+ two.getObjecte1());
        System.out.println(two.getObjecte2());
        System.out.println(two.getObjecte3());
    }

}

