package quoter;

import lombok.Setter;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 1, max = 4)
    @Setter
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for( int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

    //Why is it work?
    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @Setter
    private String message;
}
