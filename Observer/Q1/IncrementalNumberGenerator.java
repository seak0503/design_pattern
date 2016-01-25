public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int starting_number;
    private int terminate_number;
    private int incrementation_minute;
    public IncrementalNumberGenerator(int starting_number, int terminate_number, int incrementation_minute) {
        this.starting_number = starting_number;
        this.terminate_number = terminate_number;
        this.incrementation_minute = incrementation_minute;
    }
    public int getNumber() {
        return number;
    }
    public void execute() {
        for (int i = starting_number; i < terminate_number; i += incrementation_minute) {
            number = i;
            notifyObservers();
        }
    }
}