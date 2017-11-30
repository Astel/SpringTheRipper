import org.junit.Before;
import org.junit.Test;
import quoter.PropertyFileApplicationContext;
import quoter.Quoter;

public class PropertyFileApplicationContextTest {
    @Test
    public void test(){
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }

}
