package com.albo.prefactura.repositories;

import com.albo.prefactura.entities.SearchLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISearchLogRepository extends JpaRepository<SearchLog, Long> {
}
