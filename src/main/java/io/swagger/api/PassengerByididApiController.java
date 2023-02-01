package io.swagger.api;

import io.swagger.model.Passenger;
import io.swagger.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-30T23:32:22.538Z[GMT]")
@RestController
public class PassengerByididApiController implements PassengerByididApi {

    private static final Logger log = LoggerFactory.getLogger(PassengerByididApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PassengerByididApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Passenger> getPassengerById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Passenger>(objectMapper.readValue("{\n  \"premium\" : true,\n  \"busSet\" : [ {\n    \"code\" : \"E-11\",\n    \"buydate\" : \"2015-01-01T00:00:00.000+00:00\",\n    \"line\" : {\n      \"size\" : 6.0274563,\n      \"color\" : \"rojo\",\n      \"name\" : \"Jarazmín - El Palo\",\n      \"active\" : true,\n      \"id\" : 25,\n      \"creation\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"consumption\" : 0.8008282,\n    \"id\" : 542,\n    \"doublebus\" : true,\n    \"capacity\" : 80,\n    \"passengerSet\" : [ null, null ]\n  }, {\n    \"code\" : \"E-11\",\n    \"buydate\" : \"2015-01-01T00:00:00.000+00:00\",\n    \"line\" : {\n      \"size\" : 6.0274563,\n      \"color\" : \"rojo\",\n      \"name\" : \"Jarazmín - El Palo\",\n      \"active\" : true,\n      \"id\" : 25,\n      \"creation\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"consumption\" : 0.8008282,\n    \"id\" : 542,\n    \"doublebus\" : true,\n    \"capacity\" : 80,\n    \"passengerSet\" : [ null, null ]\n  } ],\n  \"distancebetweenhomestopbus\" : 25.4,\n  \"name\" : \"Francisco Jesus Moya Olivares\",\n  \"inscriptiondate\" : \"2015-01-01T00:00:00.000+00:00\",\n  \"id\" : 15,\n  \"age\" : 26\n}", Passenger.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Passenger>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Passenger>(HttpStatus.NOT_IMPLEMENTED);
    }

}
