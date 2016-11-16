/*
 * Easy Blockchain API
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sphereon.sdk.blockchain.easy.model.EntryData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entry
 */
@ApiModel(description = "Entry")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-14T02:45:39.206+01:00")
public class Entry {
  @JsonProperty("entryData")
  private EntryData entryData = null;

  /**
   * Gets or Sets dataStructure
   */
  public enum DataStructureEnum {
    FACTOM("Factom");

    private String value;

    DataStructureEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataStructureEnum fromValue(String text) {
      for (DataStructureEnum b : DataStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataStructure")
  private DataStructureEnum dataStructure = null;

  /**
   * Gets or Sets blockchainImplementation
   */
  public enum BlockchainImplementationEnum {
    BITCOIN("Bitcoin");

    private String value;

    BlockchainImplementationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BlockchainImplementationEnum fromValue(String text) {
      for (BlockchainImplementationEnum b : BlockchainImplementationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("blockchainImplementation")
  private BlockchainImplementationEnum blockchainImplementation = null;

  public Entry entryData(EntryData entryData) {
    this.entryData = entryData;
    return this;
  }

   /**
   * Get entryData
   * @return entryData
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EntryData getEntryData() {
    return entryData;
  }

  public void setEntryData(EntryData entryData) {
    this.entryData = entryData;
  }

  public Entry dataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
    return this;
  }

   /**
   * Get dataStructure
   * @return dataStructure
  **/
  @ApiModelProperty(example = "null", value = "")
  public DataStructureEnum getDataStructure() {
    return dataStructure;
  }

  public void setDataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
  }

  public Entry blockchainImplementation(BlockchainImplementationEnum blockchainImplementation) {
    this.blockchainImplementation = blockchainImplementation;
    return this;
  }

   /**
   * Get blockchainImplementation
   * @return blockchainImplementation
  **/
  @ApiModelProperty(example = "null", value = "")
  public BlockchainImplementationEnum getBlockchainImplementation() {
    return blockchainImplementation;
  }

  public void setBlockchainImplementation(BlockchainImplementationEnum blockchainImplementation) {
    this.blockchainImplementation = blockchainImplementation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entry entry = (Entry) o;
    return Objects.equals(this.entryData, entry.entryData) &&
        Objects.equals(this.dataStructure, entry.dataStructure) &&
        Objects.equals(this.blockchainImplementation, entry.blockchainImplementation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryData, dataStructure, blockchainImplementation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entry {\n");
    
    sb.append("    entryData: ").append(toIndentedString(entryData)).append("\n");
    sb.append("    dataStructure: ").append(toIndentedString(dataStructure)).append("\n");
    sb.append("    blockchainImplementation: ").append(toIndentedString(blockchainImplementation)).append("\n");
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

