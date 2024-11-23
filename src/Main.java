public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .processor("Intel i9")
                .ram(32)
                .graphicsCard("NVIDIA RTX 3080")
                .build();
    }
}