public class Main {
    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println("Sum: " + calc.add(5, 3));
        }

    }
}