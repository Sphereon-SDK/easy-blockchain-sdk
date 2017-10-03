/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.easy.handler;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;

public class JSON {
    private ApiClient apiClient;
    private Gson gson;


    /**
     * JSON constructor.
     *
     * @param apiClient An instance of ApiClient
     */
    public JSON(ApiClient apiClient) {
        this.apiClient = apiClient;
        gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter(apiClient))
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeTypeAdapter())
                .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                .registerTypeAdapter(byte[].class, new Base64Adapter())
                .create();
    }


    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }


    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public void setGson(Gson gson) {
        this.gson = gson;
    }


    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }


    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (apiClient.isLenientOnJson()) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            //   return the response body string directly for the String return type;
            //   parse response body into date or datetime for the Date return type.
            if (returnType.equals(String.class)) {
                return (T) body;
            } else if (returnType.equals(Date.class)) {
                return (T) apiClient.parseDateOrDatetime(body);
            } else {
                throw (e);
            }
        }
    }


}

class Base64Adapter implements JsonDeserializer<byte[]> {

    @Override
    public byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return Base64.getDecoder().decode(jsonElement.getAsString());
    }
}


class DateAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {
    private final ApiClient apiClient;


    /**
     * Constructor for DateAdapter
     *
     * @param apiClient Api client
     */
    public DateAdapter(ApiClient apiClient) {
        super();
        this.apiClient = apiClient;
    }


    /**
     * Serialize
     *
     * @param src       Date
     * @param typeOfSrc Type
     * @param context   Json Serialization Context
     * @return Json Element
     */
    @Override
    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
        if (src == null) {
            return JsonNull.INSTANCE;
        } else {
            return new JsonPrimitive(apiClient.formatDatetime(src));
        }
    }


    /**
     * Deserialize
     *
     * @param json    Json element
     * @param date    Type
     * @param context Json Serialization Context
     * @return Date
     * @throws JsonParseException if fail to parse
     */
    @Override
    public Date deserialize(JsonElement json, Type date, JsonDeserializationContext context) throws JsonParseException {
        String str = json.getAsJsonPrimitive().getAsString();
        try {
            return apiClient.parseDateOrDatetime(str);
        } catch (RuntimeException e) {
            throw new JsonParseException(e);
        }
    }
}

/**
 * Gson TypeAdapter for jsr310 OffsetDateTime type
 */
class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;


    @Override
    public void write(JsonWriter out, OffsetDateTime date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(formatter.format(date));
        }
    }


    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                if (date.endsWith("+0000")) {
                    date = date.substring(0, date.length() - 5) + "Z";
                } else if (date.endsWith(".000000000")) {
                    double epochTime = Double.parseDouble(date) * 1000;
                    return Instant.ofEpochMilli((long) epochTime).atOffset(ZoneOffset.UTC);
                }

                return OffsetDateTime.parse(date, formatter);
        }
    }
}

/**
 * Gson TypeAdapter for jsr310 LocalDate type
 */
class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;


    @Override
    public void write(JsonWriter out, LocalDate date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(formatter.format(date));
        }
    }


    @Override
    public LocalDate read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                return LocalDate.parse(date, formatter);
        }
    }
}
