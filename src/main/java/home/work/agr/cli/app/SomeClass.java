package home.work.agr.cli.app;

import home.work.agr.app.SendException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@SendException
public class SomeClass {
    Logger log = LoggerFactory.getLogger(this.getClass());

    public void someMethod(int someInt) {
        if (someInt == 1) {
            log.info("Ugadal cifru, molodec!");
        } else {
            log.error("ups");
            throw new RuntimeException("Ne poluchilos,looser");
        }
    }
}
