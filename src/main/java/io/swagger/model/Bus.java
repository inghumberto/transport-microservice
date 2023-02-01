package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Line;
import io.swagger.model.Passenger;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")


public class Bus   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("doublebus")
  private Boolean doublebus = null;

  @JsonProperty("buydate")
  private LocalDate buydate = null;

  @JsonProperty("consumption")
  private Float consumption = null;

  @JsonProperty("capacity")
  private Integer capacity = null;

  @JsonProperty("line")
  private Line line = null;

  @JsonProperty("passengerSet")
  @Valid
  private List<Passenger> passengerSet = null;

  public Bus id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * numero de identificacion unico en la base de datos
   * @return id
   **/
  @Schema(example = "542", required = true, description = "numero de identificacion unico en la base de datos")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Bus code(String code) {
    this.code = code;
    return this;
  }

  /**
   * ccodigo de identificacion del autobus
   * @return code
   **/
  @Schema(example = "E-11", required = true, description = "ccodigo de identificacion del autobus")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Bus doublebus(Boolean doublebus) {
    this.doublebus = doublebus;
    return this;
  }

  /**
   * identifica el autobus como uno de cuerpo simple o cuerpo doble, sera tru si es doble false si es simple
   * @return doublebus
   **/
  @Schema(example = "true", required = true, description = "identifica el autobus como uno de cuerpo simple o cuerpo doble, sera tru si es doble false si es simple")
      @NotNull

    public Boolean isDoublebus() {
    return doublebus;
  }

  public void setDoublebus(Boolean doublebus) {
    this.doublebus = doublebus;
  }

  public Bus buydate(LocalDate buydate) {
    this.buydate = buydate;
    return this;
  }

  /**
   * fecha de adquisicion de autobus
   * @return buydate
   **/
  @Schema(example = "Thu Jan 01 00:00:00 GMT 2015", required = true, description = "fecha de adquisicion de autobus")
      @NotNull

    @Valid
    public LocalDate getBuydate() {
    return buydate;
  }

  public void setBuydate(LocalDate buydate) {
    this.buydate = buydate;
  }

  public Bus consumption(Float consumption) {
    this.consumption = consumption;
    return this;
  }

  /**
   * litros de consumo de combustible cada 100 km
   * @return consumption
   **/
  @Schema(required = true, description = "litros de consumo de combustible cada 100 km")
      @NotNull

    public Float getConsumption() {
    return consumption;
  }

  public void setConsumption(Float consumption) {
    this.consumption = consumption;
  }

  public Bus capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * cantidad de pasajeros maxima que puede transporta el autobus
   * @return capacity
   **/
  @Schema(example = "80", required = true, description = "cantidad de pasajeros maxima que puede transporta el autobus")
      @NotNull

    public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Bus line(Line line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
   **/
  @Schema(description = "")
  
    @Valid
    public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public Bus passengerSet(List<Passenger> passengerSet) {
    this.passengerSet = passengerSet;
    return this;
  }

  public Bus addPassengerSetItem(Passenger passengerSetItem) {
    if (this.passengerSet == null) {
      this.passengerSet = new ArrayList<Passenger>();
    }
    this.passengerSet.add(passengerSetItem);
    return this;
  }

  /**
   * Get passengerSet
   * @return passengerSet
   **/
  @Schema(description = "")
      @Valid
    public List<Passenger> getPassengerSet() {
    return passengerSet;
  }

  public void setPassengerSet(List<Passenger> passengerSet) {
    this.passengerSet = passengerSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bus bus = (Bus) o;
    return Objects.equals(this.id, bus.id) &&
        Objects.equals(this.code, bus.code) &&
        Objects.equals(this.doublebus, bus.doublebus) &&
        Objects.equals(this.buydate, bus.buydate) &&
        Objects.equals(this.consumption, bus.consumption) &&
        Objects.equals(this.capacity, bus.capacity) &&
        Objects.equals(this.line, bus.line) &&
        Objects.equals(this.passengerSet, bus.passengerSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, doublebus, buydate, consumption, capacity, line, passengerSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    doublebus: ").append(toIndentedString(doublebus)).append("\n");
    sb.append("    buydate: ").append(toIndentedString(buydate)).append("\n");
    sb.append("    consumption: ").append(toIndentedString(consumption)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    passengerSet: ").append(toIndentedString(passengerSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
