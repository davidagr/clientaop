package home.work.agr.cli.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("asassas");
    }
}
