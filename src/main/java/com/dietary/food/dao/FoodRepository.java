package com.dietary.food.dao;

import com.dietary.food.model.Food;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FoodRepository extends AbstractDao {

  private static final String ID = "id";
  private static final String NAME = "name";
  private static final String ENERGY_KCAL = "energy_kcal";
  private static final String TOTAL_FAT = "total_fat";
  private static final String SATURATED_FAT = "saturated_fat";
  private static final String TOTAL_CARBOHYDRATE = "total_carbohydrate";
  private static final String SUGAR = "sugar";
  private static final String PROTEIN = "protein";
  private static final String SALT = "salt";

  public FoodRepository(NamedParameterJdbcTemplate jdbcTemplate) {
    super(jdbcTemplate);
  }

  public List<Food> getAll() {
    String sql =
        "SELECT id, name, energy_kcal, total_fat, saturated_fat, total_carbohydrate, sugar, protein, salt "
            + "FROM food_nutrition_facts ORDER BY name";

    return super.getJdbcTemplate().query(sql, new HashMap<>(), getRowMapper());
  }

  public Food create(Food food) {
    String sql =
        "INSERT INTO food_nutrition_facts (name, energy_kcal, total_fat, saturated_fat, total_carbohydrate, sugar, protein, salt)"
            + "VALUES (:name, :energy_kcal, :total_fat, :saturated_fat, :total_carbohydrate, :sugar, :protein, :salt)";

    int result = super.getJdbcTemplate().update(sql, this.getParams(food));

    System.out.println("result = " + result);

    return food;
  }

  private RowMapper<Food> getRowMapper() {
    return (rs, rowNum) ->
        new Food()
            .setId(rs.getInt(ID))
            .setName(rs.getString(NAME))
            .setEnergyInKcal(rs.getInt(ENERGY_KCAL))
            .setTotalFat(rs.getDouble(TOTAL_FAT))
            .setSaturatedFat(rs.getDouble(SATURATED_FAT))
            .setTotalCarbohydrate(rs.getDouble(TOTAL_CARBOHYDRATE))
            .setSugar(rs.getDouble(SUGAR))
            .setProtein(rs.getDouble(PROTEIN))
            .setSalt(rs.getDouble(SALT));
  }

  private Map<String, Object> getParams(Food food) {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put(ID, food.getId());
    params.put(NAME, food.getName());
    params.put(ENERGY_KCAL, food.getEnergyInKcal());
    params.put(TOTAL_FAT, food.getTotalFat());
    params.put(SATURATED_FAT, food.getSaturatedFat());
    params.put(TOTAL_CARBOHYDRATE, food.getTotalCarbohydrate());
    params.put(SUGAR, food.getSugar());
    params.put(PROTEIN, food.getProtein());
    params.put(SALT, food.getSalt());

    return params;
  }
}
