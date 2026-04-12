class Gym {
    public static void main(String... values) {

        System.out.println("Input values: " + values);

        if (values.length == 2) {
            System.out.println("Length is valid");

            String name = values[0];
            String weight = values[1];

            double convertedWeight = Double.valueOf(weight);

            if (convertedWeight >= 50.0) {
                System.out.println(name + " is eligible for gym training");
            } else {
                System.out.println(name + " is not eligible for gym training");
            }

        } else {
            System.out.println("Invalid number of inputs");
        }
    }
}