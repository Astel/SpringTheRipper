package quater;

import lombok.Setter;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quater {

    @InjectRandomInt(min = 1, max = 4)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @Override
    public void sayQuote() {
        for( int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @Setter
    private String message;
}
