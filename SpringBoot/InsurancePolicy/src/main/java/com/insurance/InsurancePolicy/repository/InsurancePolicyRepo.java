package com.insurance.InsurancePolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.InsurancePolicy.entity.InsurancePolicy;

public interface InsurancePolicyRepo extends JpaRepository<InsurancePolicy, Long>    {

}
