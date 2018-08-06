package com.author.roughdraft.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query("SElECT p FROM Project p WHERE author_id = :authorId")
    Iterable<Project> findProjectsByAuthorId(@Param("authorId") Long authorId);

    @Query("SELECT p FROM Project p WHERE author_id = :authorId AND id = :id")
    Project findProjectByAuthorIdAndProjectId(@Param("authorId") Long authorId, @Param("id") Long projectId);

}
