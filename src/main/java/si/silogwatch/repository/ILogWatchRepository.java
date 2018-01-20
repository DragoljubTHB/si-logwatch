package si.silogwatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import si.silogwatch.model.LogWatch;

import javax.inject.Named;
import java.util.UUID;

@Named
public interface ILogWatchRepository extends JpaRepository<LogWatch, UUID>, JpaSpecificationExecutor<LogWatch>{
}
