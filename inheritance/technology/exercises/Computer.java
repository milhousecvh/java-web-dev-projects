public class Computer {
    private double screenSize;
    private double rAM;
    private boolean touchScreen;
    private double resolution;

    public Computer(double aScreenSize) {
    }

    //getters & setters//
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getRAM() {
        return rAM;
    }

    public void setRAM(double rAM) {
        this.rAM = rAM;
    }


    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }


    //constructors//
    public Computer (double aScreenSize,double aRAM, double aResolution) {
        screenSize = aScreenSize;
        rAM = aRAM;
        resolution = aResolution;
    }

    public Computer () {
        touchScreen = false;
    }
}
