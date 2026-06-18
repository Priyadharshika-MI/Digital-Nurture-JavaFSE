public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer computer1 =
                new Computer.Builder()
                        .setCPU("Intel i7")
                        .setRAM("16 GB")
                        .setStorage("512 GB SSD")
                        .build();

        Computer computer2 =
                new Computer.Builder()
                        .setCPU("AMD Ryzen 9")
                        .setRAM("32 GB")
                        .setStorage("1 TB SSD")
                        .build();

        System.out.println("Computer 1");

        computer1.display();

        System.out.println();

        System.out.println("Computer 2");

        computer2.display();

    }
}