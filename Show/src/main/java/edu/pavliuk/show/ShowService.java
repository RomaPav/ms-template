package edu.pavliuk.show;

import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {
    private final ShowRepository showRepository;
//    private List<Show> list;

//    @PostConstruct
//    void init() throws CsvValidationException, IOException {
//        list=MyUtil.extractDataFromCsv("F:\\MicroserviceTemp\\ms-template\\Show\\MOCK_DATA.csv");
//        showRepository.saveAll(list);
//    }

    public List<Show> getAll(){
        return showRepository.findAll();
    }
    public List<Show> getLongShow(Long duration, Integer act){
        return showRepository.findByDurationGreaterThanEqualAndActGreaterThanEqual(duration,act);
    }
    public List<Show> getLongShowForPhilarmonia(Long duration, Integer act){
        return showRepository.findByDurationLessThanAndAct(duration,act);
    }
    public List<Show> getLongShowDram(Long duration, Integer act){
        return showRepository.findByDurationGreaterThanEqualAndAct(duration,act);
    }
}
