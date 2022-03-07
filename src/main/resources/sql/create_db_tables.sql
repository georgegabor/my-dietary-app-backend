create table IF NOT EXISTS food_nutrition_facts
(
    id                 SERIAL PRIMARY KEY,
    name               varchar(40)   NOT null,
    energy_kcal        integer       NOT NULL,
    total_fat          decimal(5, 2) NOT NULL,
    saturated_fat      decimal(5, 2) NOT null,
    total_carbohydrate decimal(5, 2) NOT NULL,
    sugar              decimal(5, 2) NOT NULL,
    protein            decimal(5, 2) NOT NULL,
    salt               decimal(5, 2) NOT NULL
);