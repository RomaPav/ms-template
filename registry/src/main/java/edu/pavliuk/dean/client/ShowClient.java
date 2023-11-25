package edu.pavliuk.dean.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "show-client",url="${application.config.show-url}")
public interface ShowClient {
    @RequestMapping(value ="/getLongShows/{duration}/{acts}",method = RequestMethod.GET)
    List<String> getLongShowForOlga(@PathVariable Long duration,@PathVariable Integer acts);
    @RequestMapping(value = "/getLongShowsPhilarmonia/{duration}/{acts}",method = RequestMethod.GET)
    List<String> getLongShowForPhilarmonia(@PathVariable Long duration,@PathVariable Integer acts);
    @RequestMapping(value ="/getLongShowsDram/{duration}/{acts}",method = RequestMethod.GET)
    List<String> getLongShowForDram(@PathVariable Long duration,@PathVariable Integer acts);
}
