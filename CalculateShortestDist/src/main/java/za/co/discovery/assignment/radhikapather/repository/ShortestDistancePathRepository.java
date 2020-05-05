package za.co.discovery.assignment.radhikapather.repository;

import za.co.discovery.assignment.radhikapather.entity.ShortestPath;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShortestDistancePathRepository extends JpaRepository<ShortestPath, Long> {
}
