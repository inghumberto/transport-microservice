package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Bus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Passenger
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")


public class Passenger   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("premium")
  private Boolean premium = null;

  @JsonProperty("inscriptiondate")
  private LocalDate inscriptiondate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private Integer age = null;

  @JsonProperty("distancebetweenhomestopbus")
  private Float distancebetweenhomestopbus = null;

  @JsonProperty("busSet")
  @Valid
  private List<Bus> busSet = null;

  public Passenger id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * numero de identificacion unico en la base de datos
   * @return id
   **/
  @Schema(example = "15", required = true, description = "numero de identificacion unico en la base de datos")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Passenger premium(Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * identifica a los clientes que han obtenido un bono premium de los que usan el transporte de forma anonima
   * @return premium
   **/
  @Schema(example = "true", required = true, description = "identifica a los clientes que han obtenido un bono premium de los que usan el transporte de forma anonima")
      @NotNull

    public Boolean isPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public Passenger inscriptiondate(LocalDate inscriptiondate) {
    this.inscriptiondate = inscriptiondate;
    return this;
  }

  /**
   * fecha en la que el cliente obtubo el bono premium
   * @return inscriptiondate
   **/
  @Schema(example = "Thu Jan 01 00:00:00 GMT 2015", required = true, description = "fecha en la que el cliente obtubo el bono premium")
      @NotNull

    @Valid
    public LocalDate getInscriptiondate() {
    return inscriptiondate;
  }

  public void setInscriptiondate(LocalDate inscriptiondate) {
    this.inscriptiondate = inscriptiondate;
  }

  public Passenger name(String name) {
    this.name = name;
    return this;
  }

  /**
   * nombre del cliente
   * @return name
   **/
  @Schema(example = "Francisco Jesus Moya Olivares", required = true, description = "nombre del cliente")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Passenger age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * edad del cliente a fecha de obtencion del bono premium
   * @return age
   **/
  @Schema(example = "26", required = true, description = "edad del cliente a fecha de obtencion del bono premium")
      @NotNull

    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Passenger distancebetweenhomestopbus(Float distancebetweenhomestopbus) {
    this.distancebetweenhomestopbus = distancebetweenhomestopbus;
    return this;
  }

  /**
   * distancia entre la casa del cliente y la parada mas cercana
   * @return distancebetweenhomestopbus
   **/
  @Schema(example = "25.4", required = true, description = "distancia entre la casa del cliente y la parada mas cercana")
      @NotNull

    public Float getDistancebetweenhomestopbus() {
    return distancebetweenhomestopbus;
  }

  public void setDistancebetweenhomestopbus(Float distancebetweenhomestopbus) {
    this.distancebetweenhomestopbus = distancebetweenhomestopbus;
  }

  public Passenger busSet(List<Bus> busSet) {
    this.busSet = busSet;
    return this;
  }

  public Passenger addBusSetItem(Bus busSetItem) {
    if (this.busSet == null) {
      this.busSet = new ArrayList<Bus>();
    }
    this.busSet.add(busSetItem);
    return this;
  }

  /**
   * Get busSet
   * @return busSet
   **/
  @Schema(description = "")
      @Valid
    public List<Bus> getBusSet() {
    return busSet;
  }

  public void setBusSet(List<Bus> busSet) {
    this.busSet = busSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passenger passenger = (Passenger) o;
    return Objects.equals(this.id, passenger.id) &&
        Objects.equals(this.premium, passenger.premium) &&
        Objects.equals(this.inscriptiondate, passenger.inscriptiondate) &&
        Objects.equals(this.name, passenger.name) &&
        Objects.equals(this.age, passenger.age) &&
        Objects.equals(this.distancebetweenhomestopbus, passenger.distancebetweenhomestopbus) &&
        Objects.equals(this.busSet, passenger.busSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, premium, inscriptiondate, name, age, distancebetweenhomestopbus, busSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passenger {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    inscriptiondate: ").append(toIndentedString(inscriptiondate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    distancebetweenhomestopbus: ").append(toIndentedString(distancebetweenhomestopbus)).append("\n");
    sb.append("    busSet: ").append(toIndentedString(busSet)).append("\n");
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
