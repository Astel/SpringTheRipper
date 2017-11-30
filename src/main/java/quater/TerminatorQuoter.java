package quater;

import lombok.Setter;

public class TerminatorQuoter implements Quater {

    @InjectRandomInt(min = 1, max = 4)
    private int repeat;

    @Override
    public void sayQuote() {
        for( int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    @Setter
    private String message;
}
