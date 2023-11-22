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


package se.sinetiq.core.demo.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import se.sinetiq.core.demo.api.client.model.TemperatureData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import se.sinetiq.core.demo.api.client.JSON;

/**
 * HistoricalTemperatureData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T08:33:46.970762+02:00[Europe/Stockholm]")
public class HistoricalTemperatureData {
  public static final String SERIALIZED_NAME_READINGS = "readings";
  @SerializedName(SERIALIZED_NAME_READINGS)
  private List<TemperatureData> readings;

  public HistoricalTemperatureData() {
  }

  public HistoricalTemperatureData readings(List<TemperatureData> readings) {
    
    this.readings = readings;
    return this;
  }

  public HistoricalTemperatureData addReadingsItem(TemperatureData readingsItem) {
    if (this.readings == null) {
      this.readings = new ArrayList<>();
    }
    this.readings.add(readingsItem);
    return this;
  }

   /**
   * Get readings
   * @return readings
  **/
  @javax.annotation.Nullable
  public List<TemperatureData> getReadings() {
    return readings;
  }


  public void setReadings(List<TemperatureData> readings) {
    this.readings = readings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalTemperatureData historicalTemperatureData = (HistoricalTemperatureData) o;
    return Objects.equals(this.readings, historicalTemperatureData.readings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalTemperatureData {\n");
    sb.append("    readings: ").append(toIndentedString(readings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("readings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HistoricalTemperatureData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HistoricalTemperatureData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HistoricalTemperatureData is not found in the empty JSON string", HistoricalTemperatureData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HistoricalTemperatureData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HistoricalTemperatureData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("readings") != null && !jsonObj.get("readings").isJsonNull()) {
        JsonArray jsonArrayreadings = jsonObj.getAsJsonArray("readings");
        if (jsonArrayreadings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("readings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `readings` to be an array in the JSON string but got `%s`", jsonObj.get("readings").toString()));
          }

          // validate the optional field `readings` (array)
          for (int i = 0; i < jsonArrayreadings.size(); i++) {
            TemperatureData.validateJsonObject(jsonArrayreadings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HistoricalTemperatureData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HistoricalTemperatureData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HistoricalTemperatureData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HistoricalTemperatureData.class));

       return (TypeAdapter<T>) new TypeAdapter<HistoricalTemperatureData>() {
           @Override
           public void write(JsonWriter out, HistoricalTemperatureData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HistoricalTemperatureData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HistoricalTemperatureData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HistoricalTemperatureData
  * @throws IOException if the JSON string is invalid with respect to HistoricalTemperatureData
  */
  public static HistoricalTemperatureData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HistoricalTemperatureData.class);
  }

 /**
  * Convert an instance of HistoricalTemperatureData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

