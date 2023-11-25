package edu.pavliuk.show;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowRestController {
    private final ShowService showService;
    @Autowired
    public ShowRestController(ShowService showService) {
        this.showService = showService;
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Show> getAll(){
        return showService.getAll();
    }

    @RequestMapping(value = "/getLongShows/{duration}/{acts}", method = RequestMethod.GET)
    public  List<String> getLongShows(@PathVariable Long duration, @PathVariable Integer acts){
        List<String> result=new ArrayList<>();
        List<Show> shows=showService.getLongShow(duration, acts);
        for (Show s:shows){
            result.add(s.toString());
        }
        return result;
    }
    @RequestMapping(value = "/getLongShowsPhilarmonia/{duration}/{acts}", method = RequestMethod.GET)
    public  List<String> getLongShowsPhilarmonia(@PathVariable Long duration, @PathVariable Integer acts){
        List<String> result=new ArrayList<>();
        List<Show> shows=showService.getLongShowForPhilarmonia(duration, acts);
        for (Show s:shows){
            result.add(s.toString());
        }
        return result;
    }
    @RequestMapping(value = "/getLongShowsDram/{duration}/{acts}", method = RequestMethod.GET)
    public  List<String> getLongShowsDram(@PathVariable Long duration, @PathVariable Integer acts){
        List<String> result=new ArrayList<>();
        List<Show> shows=showService.getLongShowDram(duration, acts);
        for (Show s:shows){
            result.add(s.toString());
        }
        return result;
    }
}
