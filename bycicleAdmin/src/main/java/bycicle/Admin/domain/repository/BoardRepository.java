package bycicle.Admin.domain.repository;

import bycicle.Admin.domain.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}