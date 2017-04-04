/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is an expensive operation.  2. Store entries on the chain from step 1. The entries will contain the content and metadata you want to store forever on the specified chain.  3. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
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
    /// Committed EntryData response
    /// </summary>
    [DataContract]
    public partial class CommittedEntryResponse :  IEquatable<CommittedEntryResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CommittedEntryResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CommittedEntryResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CommittedEntryResponse" /> class.
        /// </summary>
        /// <param name="Entry">Entry (required).</param>
        public CommittedEntryResponse(CommittedEntry Entry = null)
        {
            // to ensure "Entry" is required (not null)
            if (Entry == null)
            {
                throw new InvalidDataException("Entry is a required property for CommittedEntryResponse and cannot be null");
            }
            else
            {
                this.Entry = Entry;
            }
        }
        
        /// <summary>
        /// Gets or Sets Entry
        /// </summary>
        [DataMember(Name="entry", EmitDefaultValue=false)]
        public CommittedEntry Entry { get; set; }
        /// <summary>
        /// The time at which the entry creation was first requested in ISO 8601 format
        /// </summary>
        /// <value>The time at which the entry creation was first requested in ISO 8601 format</value>
        [DataMember(Name="commitTime", EmitDefaultValue=false)]
        public DateTime? CommitTime { get; private set; }
        /// <summary>
        /// The time at which the entry creation was first requested in ISO 8601 format
        /// </summary>
        /// <value>The time at which the entry creation was first requested in ISO 8601 format</value>
        [DataMember(Name="creationRequestTime", EmitDefaultValue=false)]
        public DateTime? CreationRequestTime { get; private set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CommittedEntryResponse {\n");
            sb.Append("  Entry: ").Append(Entry).Append("\n");
            sb.Append("  CommitTime: ").Append(CommitTime).Append("\n");
            sb.Append("  CreationRequestTime: ").Append(CreationRequestTime).Append("\n");
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
            return this.Equals(obj as CommittedEntryResponse);
        }

        /// <summary>
        /// Returns true if CommittedEntryResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of CommittedEntryResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CommittedEntryResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Entry == other.Entry ||
                    this.Entry != null &&
                    this.Entry.Equals(other.Entry)
                ) && 
                (
                    this.CommitTime == other.CommitTime ||
                    this.CommitTime != null &&
                    this.CommitTime.Equals(other.CommitTime)
                ) && 
                (
                    this.CreationRequestTime == other.CreationRequestTime ||
                    this.CreationRequestTime != null &&
                    this.CreationRequestTime.Equals(other.CreationRequestTime)
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
                if (this.Entry != null)
                    hash = hash * 59 + this.Entry.GetHashCode();
                if (this.CommitTime != null)
                    hash = hash * 59 + this.CommitTime.GetHashCode();
                if (this.CreationRequestTime != null)
                    hash = hash * 59 + this.CreationRequestTime.GetHashCode();
                return hash;
            }
        }
    }

}
