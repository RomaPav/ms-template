package edu.pavliuk.show;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public  List<Show> getLongShows(@PathVariable Long duration, @PathVariable Integer acts){
        return showService.getLongShow(duration, acts);
    }

}
