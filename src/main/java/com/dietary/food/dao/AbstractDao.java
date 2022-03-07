package com.dietary.food.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class AbstractDao {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public AbstractDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public NamedParameterJdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }
}
