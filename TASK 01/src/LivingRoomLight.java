public class LivingRoomLight implements Light {
    private int brightnessLevel = 0;

    @Override
    public void on() {
        System.out.println("Living Room light is ON at full brightness.");
        brightnessLevel = 100;
    }

    @Override
    public void off() {
        System.out.println("Living Room light is OFF");
        brightnessLevel = 0;
    }

    @Override
    public void dim(int level) {
        System.out.println("Living room light is dimmed to " + level + "%");
        brightnessLevel = level;
    }

    @Override
    public int getBrightnessLevel() {
        return brightnessLevel;
    }
}