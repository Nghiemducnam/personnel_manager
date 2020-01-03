package com.codegym.services.Impl;

import com.codegym.models.Record;
import com.codegym.repositories.RecordRepository;
import com.codegym.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Iterable<Record> findAllByRecord() {
        return recordRepository.findAll();
    }

    @Override
    public Optional<Record> findByRecordId(Long id) {
        return recordRepository.findById(id);
    }

    @Override
    public void saveRecord(Record record) {
        recordRepository.save(record);
    }

    @Override
    public void removeRecord(Long id) {
        recordRepository.deleteById(id);
    }
}