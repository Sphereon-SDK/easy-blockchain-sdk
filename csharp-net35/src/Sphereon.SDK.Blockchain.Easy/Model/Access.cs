/* 
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Sphereon.SDK.Blockchain.Easy.Client.SwaggerDateConverter;

namespace Sphereon.SDK.Blockchain.Easy.Model
{
    /// <summary>
    /// Access
    /// </summary>
    [DataContract]
    public partial class Access :  IEquatable<Access>
    {

        /// <summary>
        /// Gets or Sets Modes
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ModesEnum
        {
            
            /// <summary>
            /// Enum NONE for "NONE"
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE,
            
            /// <summary>
            /// Enum READ for "READ"
            /// </summary>
            [EnumMember(Value = "READ")]
            READ,
            
            /// <summary>
            /// Enum WRITE for "WRITE"
            /// </summary>
            [EnumMember(Value = "WRITE")]
            WRITE
        }

        /// <summary>
        /// Gets or Sets Modes
        /// </summary>
        [DataMember(Name="modes", EmitDefaultValue=false)]
        public List<ModesEnum> Modes { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Access" /> class.
        /// </summary>
        /// <param name="Modes">Modes.</param>
        /// <param name="_Public">_Public.</param>
        /// <param name="BlackList">BlackList.</param>
        /// <param name="WhiteList">WhiteList.</param>
        public Access(List<ModesEnum> Modes = default(List<ModesEnum>), bool? _Public = default(bool?), List<string> BlackList = default(List<string>), List<string> WhiteList = default(List<string>))
        {
            this.Modes = Modes;
            this._Public = _Public;
            this.BlackList = BlackList;
            this.WhiteList = WhiteList;
        }
        

        /// <summary>
        /// Gets or Sets _Public
        /// </summary>
        [DataMember(Name="public", EmitDefaultValue=false)]
        public bool? _Public { get; set; }

        /// <summary>
        /// Gets or Sets BlackList
        /// </summary>
        [DataMember(Name="blackList", EmitDefaultValue=false)]
        public List<string> BlackList { get; set; }

        /// <summary>
        /// Gets or Sets WhiteList
        /// </summary>
        [DataMember(Name="whiteList", EmitDefaultValue=false)]
        public List<string> WhiteList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Access {\n");
            sb.Append("  Modes: ").Append(Modes).Append("\n");
            sb.Append("  _Public: ").Append(_Public).Append("\n");
            sb.Append("  BlackList: ").Append(BlackList).Append("\n");
            sb.Append("  WhiteList: ").Append(WhiteList).Append("\n");
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
            return this.Equals(obj as Access);
        }

        /// <summary>
        /// Returns true if Access instances are equal
        /// </summary>
        /// <param name="other">Instance of Access to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Access other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Modes == other.Modes ||
                    this.Modes != null &&
                    this.Modes.SequenceEqual(other.Modes)
                ) && 
                (
                    this._Public == other._Public ||
                    this._Public != null &&
                    this._Public.Equals(other._Public)
                ) && 
                (
                    this.BlackList == other.BlackList ||
                    this.BlackList != null &&
                    this.BlackList.SequenceEqual(other.BlackList)
                ) && 
                (
                    this.WhiteList == other.WhiteList ||
                    this.WhiteList != null &&
                    this.WhiteList.SequenceEqual(other.WhiteList)
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
                if (this.Modes != null)
                    hash = hash * 59 + this.Modes.GetHashCode();
                if (this._Public != null)
                    hash = hash * 59 + this._Public.GetHashCode();
                if (this.BlackList != null)
                    hash = hash * 59 + this.BlackList.GetHashCode();
                if (this.WhiteList != null)
                    hash = hash * 59 + this.WhiteList.GetHashCode();
                return hash;
            }
        }

    }

}
