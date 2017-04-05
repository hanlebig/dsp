package com.taiyear.dsp.simple.repoDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taiyear.dsp.simple.entity.SendMarketing;

public interface SendMarketingRepository extends
		JpaRepository<SendMarketing, Long> {
	/**
	 * 消费金额
	 * 
	 * @param planId
	 * @return
	 */
	@Query(value = "select send_count from t_simple_send_marketing where plan_id = ?1", nativeQuery = true)
	double queryConsume(String planId);
}
