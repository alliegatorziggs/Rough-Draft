package com.author.roughdraft.projectfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectFileRepository extends JpaRepository<ProjectFile, Long> {

}
