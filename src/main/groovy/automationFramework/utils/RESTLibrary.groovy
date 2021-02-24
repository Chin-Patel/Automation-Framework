package automationFramework.utils

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import io.restassured.RestAssured
import io.restassured.http.Headers
import io.restassured.http.Method
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

class RESTLibrary{


    JsonNode makeRestCall(String endPoint, String methodType, Headers headers = null, boolean urlEncoding = true){

        println("Calling ${endPoint}${methodType}")
        RestAssured.baseURI = endPoint
        RequestSpecification httpRequest = RestAssured.given().urlEncodingEnabled(urlEncoding)
        if(headers != null){
            httpRequest.headers(headers)
        }
        Response response = httpRequest.request(Method.GET, methodType)
        println(response.getStatusCode())
        return (JsonNode) new ObjectMapper().readTree(response.getBody().asString())
    }


}