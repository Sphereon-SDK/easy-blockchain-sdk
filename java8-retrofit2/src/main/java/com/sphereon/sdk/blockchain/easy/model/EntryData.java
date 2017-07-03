/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.blockchain.easy.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.sphereon.sdk.blockchain.easy.model.ExternalId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry Data
 */
@ApiModel(description = "Entry Data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-03T11:20:12.030+02:00")
public class EntryData {
  @SerializedName("externalIds")
  private List<ExternalId> externalIds = new ArrayList<ExternalId>();

  @SerializedName("content")
  private byte[] content = null;

  public EntryData externalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public EntryData addExternalIdsItem(ExternalId externalIdsItem) {
    this.externalIds.add(externalIdsItem);
    return this;
  }

   /**
   * External IDs
   * @return externalIds
  **/
  @ApiModelProperty(example = "null", value = "External IDs")
  public List<ExternalId> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
  }

  public EntryData content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Content
   * @return content
  **/
  @ApiModelProperty(example = "null", required = true, value = "Content")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryData entryData = (EntryData) o;
    return Objects.equals(this.externalIds, entryData.externalIds) &&
        Objects.equals(this.content, entryData.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryData {\n");
    
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

