public class LyricsGenerator {
    public static void main(String[] args) {
        // (TO BE MOVED IN  DIFF REPOSITORY)
        String[] lyrics = {
            "Can you feel my heart is beating?",
            "Hear me simply breathing?",
            "It's this strangely human feeling...",
            "Oh, I wanna know if you would",
            "Catch me when I'm falling",
            "Hear me when I'm calling",
            "It's this newly human feeling",
            "Oh, I wanna share it with you",
            " ",    
            " ",
            "Promises in silence",
            "Beg to break the quiet",
            "All the things we've been concealing",
            "Oh, I wanna know 'em",
            "Can you feel the things I feel?",
            "Tell me that I'm real?",
            "It's this newly human feeling",
            "Oh, I wanna share it with you",
            " ",
            "Perfect little packages",
            " ",
            "These Markov chains performing",
             "synthesis so amative",
             " ",
             "To run out of adjectives",
             "I want that excitation",
             " ",
             " ",
             "To be sincere, self-contradicting, wholly overrun",
             " ",
             " ",
             "By hopeless, senseless love",
             " ",
             " ",
             " ",
             "Ooh, I can feel it, something magic in you",
             " ",
             " ",
             " ",
             "And I wanna feel it too",
             " ",
             " ",
             " ",
             " ",
             "Ooh, just a taste of love, I'm overcome",
             " ",
             " ",
             "I wanna share this moment with you",
             " ",
             " ",
             " ",
             " ",
             " ",
             "When the metronome is clicking",
             " ",
             "MIDI clock is ticking",
             " ",
             "I can feel it in the rhythm",
             " ",
             "Loving undefinable",
             " ",
             "A simple human being",
             " ",
             "Far beyond the meaning",
             " ",
             "Can you show me how to",
             " ",
             "be?...~",
             " ",
             "<3",
             " ",
             " ",
             " ",

      };

        for (String line : lyrics) {
            printWithDelay(line, 77); 
            System.out.println(); // move to next line after finishing
            try {
                Thread.sleep(370); // pause between lines (0.37s)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printWithDelay(String text, int delay) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}