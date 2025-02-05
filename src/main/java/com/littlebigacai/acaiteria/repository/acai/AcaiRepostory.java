package com.littlebigacai.acaiteria.repository.acai;

import com.littlebigacai.acaiteria.model.acai.Acai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcaiRepostory extends JpaRepository<Acai, Long> {
}
