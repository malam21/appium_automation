package listeners;


//import org.apache.logging.log4j.ThreadContext;

import org.slf4j.MDC;
import org.testng.annotations.BeforeClass;


public class LoggerForParallelTests {

    @BeforeClass
    public void LoggerForParallelTests(){
        //ThreadContext.put("threadName", this.getClass().getName());
        MDC.put("threadName", this.getClass().getName());

    }

}
