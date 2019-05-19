public class TemperatureDriver {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No Command line arguments entered.");
        } else {
            String arg1 = args[0];
            String arg2 = args[1];
            System.out.println("This is " + arg1 + " and " + arg2);
        }
        float val = -12.0f;

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(val);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(23,'F');

        System.out.println("Temp in C is " + t4.getTempC());
        System.out.println("Temp in F is " + t4.getTempF());

        System.out.println("Temp in C is " + t2.getTempC());
        System.out.println("Temp in F is " + t2.getTempF());

        System.out.println(" ");
        System.out.println("A: " + t1.getTempF() + " B: " + t2.getTempF() + "    " + Temperature.compare(t1,t2));
        System.out.println("A: " + t3.getTempF() + " B: " + t4.getTempF() + "    " + Temperature.compare(t3,t4));
    }
}
