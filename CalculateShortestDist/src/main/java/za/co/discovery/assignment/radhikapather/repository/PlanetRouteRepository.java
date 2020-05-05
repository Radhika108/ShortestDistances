package za.co.discovery.assignment.radhikapather.repository;

import za.co.discovery.assignment.radhikapather.entity.PlanetRoutes;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface PlanetRouteRepository extends JpaRepository<PlanetRoutes, Long> {
    <string> List<PlanetRoutes> findAllBy(string DestinationPlanetNameAndPlanetNode);

}
