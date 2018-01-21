package si.silogwatch.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import si.silogwatch.model.LogWatch;

import javax.inject.Named;
import java.util.List;
import java.util.UUID;


public interface ILogWatchRepository /* extends JpaRepository<LogWatch, UUID>, JpaSpecificationExecutor<LogWatch>*/{
    List<LogWatch> findAll();

    void/*Maybe<LogWatch>*/ create(LogWatch logWatch);
}
