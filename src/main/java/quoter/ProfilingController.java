package quoter;

import lombok.Getter;
import lombok.Setter;
public class ProfilingController implements ProfilingControllerMBean{
    @Setter
    @Getter
    private boolean enabled = false;

}
