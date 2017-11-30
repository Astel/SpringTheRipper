import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import quoter.Quoter;

public class TerminatorQuoterTest {

    ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void test1() {
        context.getBean(Quoter.class);
    }

}
