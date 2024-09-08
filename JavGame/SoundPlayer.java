package JavGame;

import javax.sound.sampled.Clip;

public class SoundPlayer {

    // Play a sound from the beginning
    public static void playSound(Clip clip) {
        if (clip != null) {
            clip.setFramePosition(0);  // Rewind to the beginning
            clip.start();
        }
    }

    // Play a sound on loop
    public static void playSoundLoop(Clip clip, int loopCount) {
        if (clip != null) {
            clip.setFramePosition(0);  // Rewind to the beginning
            clip.loop(loopCount);
        }
    }

    // Stop a sound
    public static void stopSound(Clip clip) {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    // Check if a sound is playing
    public static boolean isSoundPlaying(Clip clip) {
        return clip != null && clip.isRunning();
    }
    
    // Pause a sound
    public static void pauseSound(Clip clip) {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    // Resume a paused sound
    public static void resumeSound(Clip clip) {
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }
}
