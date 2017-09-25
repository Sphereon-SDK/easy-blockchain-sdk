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


package com.sphereon.sdk.blockchain.easy.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sphereon.sdk.blockchain.easy.model.CommittedChain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Committed Chain response
 */
@ApiModel(description = "Committed Chain response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T14:31:31.661+02:00")
public class CommittedChainResponse {
  @SerializedName("chain")
  private CommittedChain chain = null;

  @SerializedName("commitTime")
  private OffsetDateTime commitTime = null;

  @SerializedName("creationRequestTime")
  private OffsetDateTime creationRequestTime = null;

  public CommittedChainResponse chain(CommittedChain chain) {
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @ApiModelProperty(required = true, value = "")
  public CommittedChain getChain() {
    return chain;
  }

  public void setChain(CommittedChain chain) {
    this.chain = chain;
  }

   /**
   * The time at which the chain was first committed in ISO 8601 format
   * @return commitTime
  **/
  @ApiModelProperty(value = "The time at which the chain was first committed in ISO 8601 format")
  public OffsetDateTime getCommitTime() {
    return commitTime;
  }

   /**
   * The time at which the chain creation was first requested in ISO 8601 format
   * @return creationRequestTime
  **/
  @ApiModelProperty(value = "The time at which the chain creation was first requested in ISO 8601 format")
  public OffsetDateTime getCreationRequestTime() {
    return creationRequestTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedChainResponse committedChainResponse = (CommittedChainResponse) o;
    return Objects.equals(this.chain, committedChainResponse.chain) &&
        Objects.equals(this.commitTime, committedChainResponse.commitTime) &&
        Objects.equals(this.creationRequestTime, committedChainResponse.creationRequestTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain, commitTime, creationRequestTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedChainResponse {\n");
    
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    creationRequestTime: ").append(toIndentedString(creationRequestTime)).append("\n");
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

