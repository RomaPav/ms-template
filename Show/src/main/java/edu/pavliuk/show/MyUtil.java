package edu.pavliuk.show;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyUtil {
    public static List<Show> extractDataFromCsv(String file)
            throws IOException, CsvValidationException {
        Random random=new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<List<String>> records=new ArrayList<>();
        List<Show> shows =new ArrayList<>();
        try(CSVReader csvReader=new CSVReader(new FileReader(file))) {
            String[] values=null;
            while ((values=csvReader.readNext())!=null){
                records.add(Arrays.asList(values));
            }
        }
        records.stream()
                .forEach(el->{
                    Show show = Show.builder()
                            .id(Integer.valueOf( el.get(0)))
                            .name(el.get(1))
                            .description(el.get(2))
                            .duration((long) (random.nextInt(130)+50))
                            .act((random.nextInt(3)+1))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now().plusDays(12L))
                            .build();
                    shows.add(show);
                });
        return shows;
    }
}
