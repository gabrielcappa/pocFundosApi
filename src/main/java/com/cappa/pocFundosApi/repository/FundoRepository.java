package com.cappa.pocFundosApi.repository;

import com.cappa.pocFundosApi.model.FundoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundoRepository extends JpaRepository<FundoEntity,Long>{
}
