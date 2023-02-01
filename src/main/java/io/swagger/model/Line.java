package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Line
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")


public class Line   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Float size = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("creation")
  private OffsetDateTime creation = null;

  @JsonProperty("color")
  private String color = null;

  public Line id(Integer id) {
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

  public Line name(String name) {
    this.name = name;
    return this;
  }

  /**
   * nombre de la linea
   * @return name
   **/
  @Schema(example = "Jarazmín - El Palo", required = true, description = "nombre de la linea")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Line size(Float size) {
    this.size = size;
    return this;
  }

  /**
   * largo del recorrido de la linea en km
   * @return size
   **/
  @Schema(required = true, description = "largo del recorrido de la linea en km")
      @NotNull

    public Float getSize() {
    return size;
  }

  public void setSize(Float size) {
    this.size = size;
  }

  public Line active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * estado de la linea
   * @return active
   **/
  @Schema(example = "true", required = true, description = "estado de la linea")
      @NotNull

    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Line creation(OffsetDateTime creation) {
    this.creation = creation;
    return this;
  }

  /**
   * Get creation
   * @return creation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getCreation() {
    return creation;
  }

  public void setCreation(OffsetDateTime creation) {
    this.creation = creation;
  }

  public Line color(String color) {
    this.color = color;
    return this;
  }

  /**
   * color representatibo de la linea en los mapas
   * @return color
   **/
  @Schema(example = "rojo", required = true, description = "color representatibo de la linea en los mapas")
      @NotNull

    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Line line = (Line) o;
    return Objects.equals(this.id, line.id) &&
        Objects.equals(this.name, line.name) &&
        Objects.equals(this.size, line.size) &&
        Objects.equals(this.active, line.active) &&
        Objects.equals(this.creation, line.creation) &&
        Objects.equals(this.color, line.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, active, creation, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
