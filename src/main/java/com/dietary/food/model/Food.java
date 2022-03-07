package com.dietary.food.model;

import java.util.Objects;

public class Food {

  private int id;
  private String name;
  private int energyInKcal;
  private double totalFat;
  private double saturatedFat;
  private double totalCarbohydrate;
  private double sugar;
  private double protein;
  private double salt;

  public int getId() {
    return id;
  }

  public Food setId(int id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Food setName(String name) {
    this.name = name;
    return this;
  }

  public int getEnergyInKcal() {
    return energyInKcal;
  }

  public Food setEnergyInKcal(int energyInKcal) {
    this.energyInKcal = energyInKcal;
    return this;
  }

  public double getTotalFat() {
    return totalFat;
  }

  public Food setTotalFat(double totalFat) {
    this.totalFat = totalFat;
    return this;
  }

  public double getSaturatedFat() {
    return saturatedFat;
  }

  public Food setSaturatedFat(double saturatedFat) {
    this.saturatedFat = saturatedFat;
    return this;
  }

  public double getTotalCarbohydrate() {
    return totalCarbohydrate;
  }

  public Food setTotalCarbohydrate(double totalCarbohydrate) {
    this.totalCarbohydrate = totalCarbohydrate;
    return this;
  }

  public double getSugar() {
    return sugar;
  }

  public Food setSugar(double sugar) {
    this.sugar = sugar;
    return this;
  }

  public double getProtein() {
    return protein;
  }

  public Food setProtein(double protein) {
    this.protein = protein;
    return this;
  }

  public double getSalt() {
    return salt;
  }

  public Food setSalt(double salt) {
    this.salt = salt;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Food food)) return false;
    return getId() == food.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }

  @Override
  public String toString() {
    return "Food{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", energyInKcal="
        + energyInKcal
        + ", totalFat="
        + totalFat
        + ", saturatedFat="
        + saturatedFat
        + ", totalCarbohydrate="
        + totalCarbohydrate
        + ", sugar="
        + sugar
        + ", protein="
        + protein
        + ", salt="
        + salt
        + '}';
  }
}
