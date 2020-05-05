package za.co.discovery.assignment.radhikapather.repository;

import za.co.discovery.assignment.radhikapather.entity.PlanetNames;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PlanetNameRepository extends JpaRepository<PlanetNames, Long> {
    List<PlanetNames> findAllBy( );
}
