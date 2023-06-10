package kz.bitlab.techorda.springtasksecond.repository;

import kz.bitlab.techorda.springtasksecond.models.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AppReq extends JpaRepository<ApplicationRequest,Long> {
}
