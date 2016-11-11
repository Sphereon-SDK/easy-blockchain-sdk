/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normaly you only need one or a handfull of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.Blockchain.Easy.Model
{
    /// <summary>
    /// Entry
    /// </summary>
    [DataContract]
    public partial class Entry :  IEquatable<Entry>
    {
        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataStructureEnum
        {
            
            /// <summary>
            /// Enum Factom for "Factom"
            /// </summary>
            [EnumMember(Value = "Factom")]
            Factom
        }

        /// <summary>
        /// Gets or Sets BlockchainImplementation
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum BlockchainImplementationEnum
        {
            
            /// <summary>
            /// Enum Bitcoin for "Bitcoin"
            /// </summary>
            [EnumMember(Value = "Bitcoin")]
            Bitcoin
        }

        /// <summary>
        /// Gets or Sets DataStructure
        /// </summary>
        [DataMember(Name="dataStructure", EmitDefaultValue=false)]
        public DataStructureEnum? DataStructure { get; set; }
        /// <summary>
        /// Gets or Sets BlockchainImplementation
        /// </summary>
        [DataMember(Name="blockchainImplementation", EmitDefaultValue=false)]
        public BlockchainImplementationEnum? BlockchainImplementation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Entry" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Entry() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Entry" /> class.
        /// </summary>
        /// <param name="EntryData">EntryData (required).</param>
        /// <param name="DataStructure">DataStructure.</param>
        /// <param name="BlockchainImplementation">BlockchainImplementation.</param>
        public Entry(EntryData EntryData = null, DataStructureEnum? DataStructure = null, BlockchainImplementationEnum? BlockchainImplementation = null)
        {
            // to ensure "EntryData" is required (not null)
            if (EntryData == null)
            {
                throw new InvalidDataException("EntryData is a required property for Entry and cannot be null");
            }
            else
            {
                this.EntryData = EntryData;
            }
            this.DataStructure = DataStructure;
            this.BlockchainImplementation = BlockchainImplementation;
        }
        
        /// <summary>
        /// Gets or Sets EntryData
        /// </summary>
        [DataMember(Name="entryData", EmitDefaultValue=false)]
        public EntryData EntryData { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Entry {\n");
            sb.Append("  EntryData: ").Append(EntryData).Append("\n");
            sb.Append("  DataStructure: ").Append(DataStructure).Append("\n");
            sb.Append("  BlockchainImplementation: ").Append(BlockchainImplementation).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as Entry);
        }

        /// <summary>
        /// Returns true if Entry instances are equal
        /// </summary>
        /// <param name="other">Instance of Entry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Entry other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.EntryData == other.EntryData ||
                    this.EntryData != null &&
                    this.EntryData.Equals(other.EntryData)
                ) && 
                (
                    this.DataStructure == other.DataStructure ||
                    this.DataStructure != null &&
                    this.DataStructure.Equals(other.DataStructure)
                ) && 
                (
                    this.BlockchainImplementation == other.BlockchainImplementation ||
                    this.BlockchainImplementation != null &&
                    this.BlockchainImplementation.Equals(other.BlockchainImplementation)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.EntryData != null)
                    hash = hash * 59 + this.EntryData.GetHashCode();
                if (this.DataStructure != null)
                    hash = hash * 59 + this.DataStructure.GetHashCode();
                if (this.BlockchainImplementation != null)
                    hash = hash * 59 + this.BlockchainImplementation.GetHashCode();
                return hash;
            }
        }
    }

}
