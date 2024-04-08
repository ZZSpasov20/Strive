package org.project.Strive.dal.repositories;

import org.project.Strive.dal.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository  extends JpaRepository<Record, Integer> {
}
