package Class;
    enum Experience {
        EASY,
        NORMAL,
        HARD
    }

public class Enum {
    public static void main(String[]args){
        Experience myEx = Experience.HARD;

        switch (myEx){
            case EASY:
                System.out.println("First Level");
                break;
            case NORMAL:
                System.out.println("Second Level");
                break;
            case HARD:
                System.out.println("Final Level");
        }
    }
}
