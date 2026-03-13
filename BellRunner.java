class BellRunner{

    public static void main(String[] args){

        System.out.println("\nImplicit declaration:\n");
        Bell.details(500.0, 20.0, 300, 6.0, 'B');

        System.out.println("\nExplicit declaration:\n");

        double weight = 600.0;
        double height = 25.0;
        int price = 250;
        double radius = 7.0;
        char material = 'I';

        Bell.details(weight, height, price, radius, material);
    }
}