class Penny {
    public static void VerseOne() {
        final String lyrics = "I found you\nBy the heel of my shoe\nYou were hiding\nUnderneath my sole";
        System.out.println(lyrics);
    }
    public static void VerseThree() {
        final String lyrics = "\nI wonder\n Will you stay in my pocket?" + "\nWhen I need you"
                + "\nWill you come out for me?" + "\nHope I don't lose you" + "\nBeing careless with my spending"
                + "\nI've been known to" + "\nBut that's gonna change.";
        System.out.println(lyrics);
    }
    public static void singChorusFirst() {
        final String refrain = "You're my perfect, \nMy perfect little Penny.";
        System.out.println(refrain);
    }
    public static void singChorus() {
        singChorusFirst();
        String bridge = "\nPromise I'll never lose you\nPromise I'll never let you go";
        System.out.println(bridge);
    }
    public static void main(final String[] args) {
        VerseOne();
        singChorus();
    }
}