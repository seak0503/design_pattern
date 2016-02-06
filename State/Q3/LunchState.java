public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState() {
    }
    public static State getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 12)  {
            context.changeState(DayState.getInstance());
        } else if (13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.recordLog("非常：昼食時の金庫資料！");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル(昼食時)");
    }
    public void doPhone(Context context) {
        context.recordLog("昼食時の通話録音");
    }
    public String toString() {
        return "[ランチ]";
    }
}