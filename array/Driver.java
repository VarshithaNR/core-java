class Driver {
    public static void main(String... values) {

        System.out.println("Input values: " + values);

        if (values.length == 2) {
            System.out.println("Length is valid");

            String name = values[0];
            String age = values[1];

            int convertedAge = Integer.valueOf(age);

            if (convertedAge >= 21) {
                System.out.println(name + " can apply for a driving license");
            } else {
                System.out.println(name + " cannot apply for a driving license");
            }

        } else {
            System.out.println("Invalid number of inputs");
        }
    }
}