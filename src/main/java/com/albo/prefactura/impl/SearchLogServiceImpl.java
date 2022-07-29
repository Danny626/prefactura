package com.albo.prefactura.impl;

import com.albo.prefactura.entities.SearchLog;
import com.albo.prefactura.repositories.ISearchLogRepository;
import com.albo.prefactura.services.ISearchLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SearchLogServiceImpl implements ISearchLogService {

    @Autowired
    private ISearchLogRepository searchLogRepo;

    @Override
    @Transactional(readOnly = true)
    public List<SearchLog> findAll() {
        return searchLogRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<SearchLog> findById(Long id) {
        return searchLogRepo.findById(id);
    }

    @Override
    @Transactional
    public SearchLog saveOrUpdate(SearchLog searchLog) {
        return searchLogRepo.save(searchLog);
    }

    @Override
    @Transactional
    public Boolean deleteById(Long id) {
        if (!searchLogRepo.existsById(id)) {
            return false;
        }
        searchLogRepo.deleteById(id);
        return true;
    }
}
