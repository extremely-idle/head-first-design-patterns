package mvc.controller;

/**
 * Created by Ross on 12/06/2017.
 */
public interface Controller {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
