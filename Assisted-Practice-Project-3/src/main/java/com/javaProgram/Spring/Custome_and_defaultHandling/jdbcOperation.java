package com.javaProgram.Spring.Custome_and_defaultHandling;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository("op")
public  class jdbcOperation implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;

	DataSource dataSource;
	
	NamedParameterJdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		template = new NamedParameterJdbcTemplate(dataSource);
	}
	
	void work() {
		WorkEvent_customHandling theEvent = new WorkEvent_customHandling(this);
		publisher.publishEvent(theEvent);
	}
	
	
	String getStudentLocation(int id, String name) {
		String qry = "select location from students where id = :uId and name = :uName";
		
		SqlParameterSource paramSource = new MapSqlParameterSource("uId", id)
										.addValue("uName", name);
		
		return template.queryForObject(qry, paramSource, String.class);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	


}
