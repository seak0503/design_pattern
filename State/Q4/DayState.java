public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {
    }
    public static State getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (context.getInstance() == EmergencyState.getInstance()) {
        } else if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("金庫使用(昼間)");
    }
    public void doAlarm(Context context) {
        context.changeState(EmergencyState.getInstance());
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("通常の電話(昼間)");
    }
    public String toString() {
        return "[昼間]";
    }
}