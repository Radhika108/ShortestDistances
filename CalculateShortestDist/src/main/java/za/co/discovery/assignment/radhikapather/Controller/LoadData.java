package za.co.discovery.assignment.radhikapather.Controller;
import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import za.co.discovery.assignment.radhikapather.repository.PlanetNameRepository;
import za.co.discovery.assignment.radhikapather.repository.PlanetRouteRepository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController

public class LoadData {

    @Autowired
    private PlanetNameRepository PlanetNames;
    private PlanetRouteRepository PlanetRoutes;

    @GetMapping("/planet/{planet_name}")
    public Field getAllPlanet(@PathVariable int planet_id, @PathVariable String planet_name, @PathVariable String planet_node) {
        return getAllPlanet(planet_id, planet_name, planet_node) ;
    }

    @GetMapping("/planetroutes/{planet_routeid}")
    public Field getAllRoutes(@PathVariable int planet_routeid, @PathVariable String planet_source, @PathVariable String planet_dest, @PathVariable String dest) {
        return  getAllRoutes(planet_routeid, planet_source, planet_dest, dest);
    }


}