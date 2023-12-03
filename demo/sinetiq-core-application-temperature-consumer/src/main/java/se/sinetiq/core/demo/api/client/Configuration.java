/*
 * Temperature Sensor API HTTP(S)-JSON
 * This is a simple API for accessing temperature sensor data.   Producer: The producer in this context is the temperature sensor along with its hosting system.  - GET /units: This endpoint returns a list of supported temperature units.  - GET /temperature: This endpoint provides the current temperature reading and associated metadata.  - GET /temperature/history: This endpoint provides historical temperature readings.  Consumer: The consumer is any application or system that needs to retrieve temperature data from the producer.   - GET /units: A consumer would make a GET request to this endpoint to find out what units of temperature the producer supports.  - GET /temperature: The consumer retrieves the current temperature reading and metadata by making a GET request to this endpoint.  - GET /temperature/history: The consumer retrieves historical temperature readings by making a GET request to this endpoint.  Procedure: Here is a typical interaction between a producer and a consumer:  - The consumer system sends a GET request to the /units endpoint. The producer system receives the request and responds with a list of supported temperature units. - The consumer system sends a GET request to the /temperature endpoint. The producer system receives the request and responds with the current temperature reading and related metadata. - The consumer system sends a GET request to the /temperature/history endpoint. The producer system receives the request and responds with the historical temperature readings. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package se.sinetiq.core.demo.api.client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T08:33:46.970762+02:00[Europe/Stockholm]")
public class Configuration {
    public static final String VERSION = "1.0.0";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
