package mhuck.springFramework.spring5TestSite.bootstrap;

import mhuck.springFramework.spring5TestSite.domain.Publisher;
import mhuck.springFramework.spring5TestSite.repositories.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrapData implements CommandLineRunner {

    private final PublisherRepo publisherRepo;

    public bootstrapData(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher penguin = new Publisher("Penguin", "121 Demo St.", "98144", "Wa.", "Seattle");
        publisherRepo.save(penguin);

        System.out.println("Started in bootstrap");
        System.out.println("Publisher count = " + publisherRepo.count());
    }
}
