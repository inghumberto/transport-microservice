package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BusStop
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")


public class BusStop   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seat")
  private Integer seat = null;

  @JsonProperty("size")
  private Float size = null;

  @JsonProperty("creation")
  private LocalDate creation = null;

  @JsonProperty("covering")
  private Boolean covering = null;

  public BusStop id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * numero de identificacion unico en la base de datos
   * @return id
   **/
  @Schema(example = "25", required = true, description = "numero de identificacion unico en la base de datos")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BusStop name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la parada
   * @return name
   **/
  @Schema(example = "Atocha", required = true, description = "Nombre de la parada")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BusStop seat(Integer seat) {
    this.seat = seat;
    return this;
  }

  /**
   * cantidad de asientos de la parada
   * @return seat
   **/
  @Schema(example = "5", required = true, description = "cantidad de asientos de la parada")
      @NotNull

    public Integer getSeat() {
    return seat;
  }

  public void setSeat(Integer seat) {
    this.seat = seat;
  }

  public BusStop size(Float size) {
    this.size = size;
    return this;
  }

  /**
   * area des area de la paradaen metros
   * @return size
   **/
  @Schema(required = true, description = "area des area de la paradaen metros")
      @NotNull

    public Float getSize() {
    return size;
  }

  public void setSize(Float size) {
    this.size = size;
  }

  public BusStop creation(LocalDate creation) {
    this.creation = creation;
    return this;
  }

  /**
   * fecha de la construccion de la parada
   * @return creation
   **/
  @Schema(example = "Thu Jan 01 00:00:00 GMT 2015", required = true, description = "fecha de la construccion de la parada")
      @NotNull

    @Valid
    public LocalDate getCreation() {
    return creation;
  }

  public void setCreation(LocalDate creation) {
    this.creation = creation;
  }

  public BusStop covering(Boolean covering) {
    this.covering = covering;
    return this;
  }

  /**
   * especifica si la parada tiene techado o no
   * @return covering
   **/
  @Schema(example = "true", required = true, description = "especifica si la parada tiene techado o no")
      @NotNull

    public Boolean isCovering() {
    return covering;
  }

  public void setCovering(Boolean covering) {
    this.covering = covering;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusStop busStop = (BusStop) o;
    return Objects.equals(this.id, busStop.id) &&
        Objects.equals(this.name, busStop.name) &&
        Objects.equals(this.seat, busStop.seat) &&
        Objects.equals(this.size, busStop.size) &&
        Objects.equals(this.creation, busStop.creation) &&
        Objects.equals(this.covering, busStop.covering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, seat, size, creation, covering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusStop {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    covering: ").append(toIndentedString(covering)).append("\n");
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
