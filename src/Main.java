import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void demo_basic_interface() {
        System.out.println("basic interface demo");
        Sedan v1 = new Sedan();
        System.out.println(v1.paywithcase());
        System.out.println(v1.paywithEPass());

        Truck t1 = new Truck();
        System.out.println(t1.paywithcase());
        System.out.println(t1.paywithEPass());
        System.out.println("-".repeat(40));

    }

    public static void demo_dataType_interface() {
        Vehicle v = null; // Vehicle is as variable data type
        for (int i = 0; i < 20; i++) {
            int r = randomBetween(0, 2);
            switch (r) {
                case 0:
                    v = new Sedan();
                    break;
                case 1:
                    v = new Truck();
                    break;
                case 2:
                    v = new Bus();
                    break;
                default:
                    v = new Sedan();
            }
            int paymentType = randomBetween(0, 1);
            int rate = 0;
            if (paymentType == 0) {
                rate = v.paywithcase();
                System.out.printf("Vehicle type = %-20s, rate(cash) = %3d\n", v.getClass().getName(), rate);
            } else {
                rate = v.paywithEPass();
                System.out.printf("Vehicle type = %-20s, rate(Epass) = %3d\n", v.getClass().getName(), rate);
            }

        }
    }

    public static int randomBetween(int fromNumber, int toNumber) {
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
    }



    public static void main(String[] args) {
//        demo_basic_interface();
        demo_dataType_interface();

    }
}