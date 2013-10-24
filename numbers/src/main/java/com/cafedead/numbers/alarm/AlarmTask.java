package com.cafedead.numbers.alarm;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.TimerTask;

public class AlarmTask extends TimerTask {
    String NAME_OF_FILE = "sheep.wav";

    @Override
    public void run() {
        URL filePath = Thread.currentThread().getContextClassLoader().getResource(NAME_OF_FILE);

        File soundFile = new File(filePath.toString());
        System.out.println(soundFile.isFile());
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Alarm");
    }
}
