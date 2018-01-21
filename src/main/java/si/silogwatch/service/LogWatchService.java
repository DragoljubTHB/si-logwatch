package si.silogwatch.service;

//import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import si.silogwatch.model.LogWatch;
import si.silogwatch.repository.ILogWatchRepository;

import javax.inject.Named;
import java.util.List;

// @Named
//@Transactional(rollbackFor = Exception.class)
@Service
public class LogWatchService implements ILogWatchService{

    @Autowired
    private ILogWatchRepository logWatchRepository;

    @Override
    public List<LogWatch> findAll() {
        return logWatchRepository.findAll();
    }

    @Override
    public void create(LogWatch logWatch) {
        logWatchRepository.create(logWatch);
    }
}
