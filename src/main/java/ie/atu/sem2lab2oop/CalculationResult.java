package ie.atu.sem2lab2oop;

public class CalculationResult {

        private String operation;
        private double total;

        public CalculationResult(String operation, double total) {
            this.operation = operation;
            this.total = total;
        }

        public String getOperation() {
            return operation;
        }

        public double getTotal() {
            return total;
        }
    }

