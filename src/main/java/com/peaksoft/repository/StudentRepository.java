package com.peaksoft.repository;

import com.peaksoft.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s from Student s where upper(s.studentName) like concat('%',:text,'%') " +
            "or upper(s.surname)like concat('%',:text,'%') ")
    List<Student> searchStudentsAndPagination(@Param("text") String text, Pageable pageable);
}
