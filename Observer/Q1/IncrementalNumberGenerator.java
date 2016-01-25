public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int terminate_number;
    private int incrementation_minute;
    public IncrementalNumberGenerator(int starting_number, int terminate_number, int incrementation_minute) {
        this.number = starting_number;
        this.terminate_number = terminate_number;
        this.incrementation_minute = incrementation_minute;
    }
    public int getNumber() {
        return number;
    }
    public void execute() {
        while (number < terminate_number) {
            notifyObservers();
            number += incrementation_minute;
        }
    }
}