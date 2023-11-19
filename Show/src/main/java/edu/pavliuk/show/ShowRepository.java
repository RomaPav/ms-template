package edu.pavliuk.show;

import org.apache.catalina.LifecycleState;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends MongoRepository<Show, Integer> {
    List<Show> findByDurationGreaterThanEqualAndActGreaterThanEqual(Long duration,Integer act);
}
