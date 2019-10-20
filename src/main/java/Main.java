public class Main {
    public static void main(String[] args) {
        // width of int = 32 (4bytes)
        int myIntValue = 5 / 3;
        // width of int = 32 (4bytes)
        float myFloatValue = 5f / 3f;
        float myFloatValue2 = (float) 5.4 / 3;
        // width of int = 64 (8bytes)
        double myDoubleValue = 5.25 / 3d;
        double myDoubleValue2 = (double) 5 / 3;

        System.out.println("myIntValue =" + myIntValue + "\n" + "\n");
        System.out.println("myFloatValue =" + myFloatValue + "\n");
        System.out.println("myFloatValue2 =" + myFloatValue2 + "\n" + "\n");
        System.out.println("myDoubleValue =" + myDoubleValue + "\n");
        System.out.println("myDoubleValue2 =" + myDoubleValue2 + "\n");

        //Convert a given number of punds to kilograms.
        double pound = 200d;
        double kilogram = 0;

        double kilogramsToPOUNDS = (double) kilogram * (1 / 0.45359237);
        double poundToKILOGRAMS = (double) pound * 0.45359237;
        System.out.println("200 pounds is equal to " + poundToKILOGRAMS + " kilograms.");
    }
}
