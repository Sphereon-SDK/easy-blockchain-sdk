/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
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
    /// RpcProvider
    /// </summary>
    [DataContract]
    public partial class RpcProvider :  IEquatable<RpcProvider>
    {
        /// <summary>
        /// Gets or Sets OwnerType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OwnerTypeEnum
        {
            
            /// <summary>
            /// Enum PROVIDER for "PROVIDER"
            /// </summary>
            [EnumMember(Value = "PROVIDER")]
            PROVIDER,
            
            /// <summary>
            /// Enum CUSTOMER for "CUSTOMER"
            /// </summary>
            [EnumMember(Value = "CUSTOMER")]
            CUSTOMER
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum API for "API"
            /// </summary>
            [EnumMember(Value = "API")]
            API,
            
            /// <summary>
            /// Enum WALLET for "WALLET"
            /// </summary>
            [EnumMember(Value = "WALLET")]
            WALLET
        }

        /// <summary>
        /// Gets or Sets OwnerType
        /// </summary>
        [DataMember(Name="ownerType", EmitDefaultValue=false)]
        public OwnerTypeEnum? OwnerType { get; set; }
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RpcProvider" /> class.
        /// </summary>
        /// <param name="OwnerType">OwnerType.</param>
        /// <param name="Password">Password.</param>
        /// <param name="Access">Access.</param>
        /// <param name="ResourceFiles">ResourceFiles.</param>
        /// <param name="Host">Host.</param>
        /// <param name="Id">Id.</param>
        /// <param name="Type">Type.</param>
        /// <param name="Username">Username.</param>
        public RpcProvider(OwnerTypeEnum? OwnerType = null, string Password = null, Access Access = null, Dictionary<string, string> ResourceFiles = null, string Host = null, string Id = null, TypeEnum? Type = null, string Username = null)
        {
            this.OwnerType = OwnerType;
            this.Password = Password;
            this.Access = Access;
            this.ResourceFiles = ResourceFiles;
            this.Host = Host;
            this.Id = Id;
            this.Type = Type;
            this.Username = Username;
        }
        
        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string Password { get; set; }
        /// <summary>
        /// Gets or Sets Access
        /// </summary>
        [DataMember(Name="access", EmitDefaultValue=false)]
        public Access Access { get; set; }
        /// <summary>
        /// Gets or Sets ResourceFiles
        /// </summary>
        [DataMember(Name="resourceFiles", EmitDefaultValue=false)]
        public Dictionary<string, string> ResourceFiles { get; set; }
        /// <summary>
        /// Gets or Sets Host
        /// </summary>
        [DataMember(Name="host", EmitDefaultValue=false)]
        public string Host { get; set; }
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }
        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RpcProvider {\n");
            sb.Append("  OwnerType: ").Append(OwnerType).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Access: ").Append(Access).Append("\n");
            sb.Append("  ResourceFiles: ").Append(ResourceFiles).Append("\n");
            sb.Append("  Host: ").Append(Host).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
            return this.Equals(obj as RpcProvider);
        }

        /// <summary>
        /// Returns true if RpcProvider instances are equal
        /// </summary>
        /// <param name="other">Instance of RpcProvider to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RpcProvider other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.OwnerType == other.OwnerType ||
                    this.OwnerType != null &&
                    this.OwnerType.Equals(other.OwnerType)
                ) && 
                (
                    this.Password == other.Password ||
                    this.Password != null &&
                    this.Password.Equals(other.Password)
                ) && 
                (
                    this.Access == other.Access ||
                    this.Access != null &&
                    this.Access.Equals(other.Access)
                ) && 
                (
                    this.ResourceFiles == other.ResourceFiles ||
                    this.ResourceFiles != null &&
                    this.ResourceFiles.SequenceEqual(other.ResourceFiles)
                ) && 
                (
                    this.Host == other.Host ||
                    this.Host != null &&
                    this.Host.Equals(other.Host)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                ) && 
                (
                    this.Username == other.Username ||
                    this.Username != null &&
                    this.Username.Equals(other.Username)
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
                if (this.OwnerType != null)
                    hash = hash * 59 + this.OwnerType.GetHashCode();
                if (this.Password != null)
                    hash = hash * 59 + this.Password.GetHashCode();
                if (this.Access != null)
                    hash = hash * 59 + this.Access.GetHashCode();
                if (this.ResourceFiles != null)
                    hash = hash * 59 + this.ResourceFiles.GetHashCode();
                if (this.Host != null)
                    hash = hash * 59 + this.Host.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.Username != null)
                    hash = hash * 59 + this.Username.GetHashCode();
                return hash;
            }
        }
    }

}
