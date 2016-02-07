class EmergencyState implements State {
    private static EmergencyState singleton = new EmergencyState();
    private EmergencyState() {
    }
    public static EmergencyState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
    }
    public void doUse(Context context) {
        context.callSecurityCenter("非常時：通報");
    }
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常時：非常ベル");
    }
    public void doPhone(Context context) {
        context.callSecurityCenter("非常時：呼び出し");
    }
    public String toString() {
        return "[非常時]";
    }
}