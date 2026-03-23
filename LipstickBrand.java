class LipstickBrand {

    public static void main(String[] args){

        String[] brands = {
            "Lakme","Maybelline","Loreal","MAC","Nykaa",
            "Sugar","Revlon","Faces","Colorbar","Chambor"
        };

        brands[3] = "Dior";

        System.out.println("Forward:");
        for(int i=0; i<brands.length; i++){
            System.out.println(brands[i]);
        }

        System.out.println("Reverse:");
        for(int i=brands.length-1; i>=0; i--){
            System.out.println(brands[i]);
        }
    }
}