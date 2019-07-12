package com.smsgenerator.repos;

import com.smsgenerator.domen.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepos extends JpaRepository<City, Integer> {
    City findByName(String name);

    @Query(value="select c from City c where c.name=:name and not c.idCity=:id")
    City findByNameAndNotId(@Param("name") String name, @Param("id") Integer id);

    @Override
    @Query(value="select c from City c ORDER BY name")
    List<City> findAll();
}
