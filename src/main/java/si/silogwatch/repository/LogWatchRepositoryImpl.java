package si.silogwatch.repository;

import org.springframework.stereotype.Repository;
import si.silogwatch.model.LogWatch;
import si.silogwatch.persistence.LogMemory;

import java.util.List;

@Repository
public class LogWatchRepositoryImpl implements ILogWatchRepository {
    @Override
    public List<LogWatch> findAll() {
        return LogMemory.getInstance().getAllLogs();
    }

    @Override
    public void create(LogWatch logWatch) {
        LogMemory.getInstance().put(logWatch);
    }
}
