package mhuck.springFramework.spring5TestSite.repositories;

import mhuck.springFramework.spring5TestSite.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
