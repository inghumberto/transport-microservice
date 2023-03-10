/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.39).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Line;
import io.swagger.model.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")
@Validated
public interface LinesApi {

    @Operation(summary = "Almacena una linea", description = "", tags={ "Lineas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "linea almacenada", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Line.class))),
        
        @ApiResponse(responseCode = "409", description = "esta linea ya existe en la base de datos", content = @Content(mediaType = "*/*", schema = @Schema(implementation = Response.class))) })
    @RequestMapping(value = "/lines",
        produces = { "*/*" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Line> addLine(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Line body);


    @Operation(summary = "Elimina una linea", description = "", tags={ "Lineas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Se elimina la linea", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))),
        
        @ApiResponse(responseCode = "404", description = "La linea no existe", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))) })
    @RequestMapping(value = "/lines/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Response> deleteLine(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Obtiene el listado de Lineas", description = "", tags={ "Lineas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Listado de Lineas", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Line.class)))) })
    @RequestMapping(value = "/lines",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Line>> getLines();


    @Operation(summary = "actualiza una linea", description = "", tags={ "Lineas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Se actualizo la linea", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Line.class))),
        
        @ApiResponse(responseCode = "404", description = "La linea no existe", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))) })
    @RequestMapping(value = "/lines",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Line> modifyLine(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Line body);


    @Operation(summary = "actualiza el nombre una linea", description = "", tags={ "Lineas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Se actualizo el nombre de la linea", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Line.class))),
        
        @ApiResponse(responseCode = "404", description = "La linea no existe", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))) })
    @RequestMapping(value = "/lines/{id}/change-name",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Line> modifyLineName(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody String body);

}

