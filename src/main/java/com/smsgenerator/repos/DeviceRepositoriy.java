package com.smsgenerator.repos;

import com.smsgenerator.domen.Device;
import com.smsgenerator.domen.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepositoriy extends JpaRepository<Quote, Integer> {
}
