package com.codegym.services;

import com.codegym.models.Record;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecordService {
    Iterable<Record> findAllByRecord();
    Optional<Record> findByRecordId(Long id);
    void saveRecord(Record record);
    void removeRecord(Long id);
}
