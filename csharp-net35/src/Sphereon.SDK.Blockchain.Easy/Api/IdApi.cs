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
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Sphereon.SDK.Blockchain.Easy.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IIdApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Determine whether the Id of a chain exists in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <returns>IdResponse</returns>
        IdResponse ChainIdExists (string context, string chainId);

        /// <summary>
        /// Determine whether the Id of a chain exists in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <returns>ApiResponse of IdResponse</returns>
        ApiResponse<IdResponse> ChainIdExistsWithHttpInfo (string context, string chainId);
        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>IdResponse</returns>
        IdResponse DetermineChainId (string context, Chain chain, bool? checkExistence = null);

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>ApiResponse of IdResponse</returns>
        ApiResponse<IdResponse> DetermineChainIdWithHttpInfo (string context, Chain chain, bool? checkExistence = null);
        /// <summary>
        /// Pre determine the Id of an entry request without anchoring the entry
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entry">The entry to determine the hash for on the specified chain</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>IdResponse</returns>
        IdResponse DetermineEntryId (string context, string chainId, Entry entry, bool? checkExistence = null);

        /// <summary>
        /// Pre determine the Id of an entry request without anchoring the entry
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entry">The entry to determine the hash for on the specified chain</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>ApiResponse of IdResponse</returns>
        ApiResponse<IdResponse> DetermineEntryIdWithHttpInfo (string context, string chainId, Entry entry, bool? checkExistence = null);
        /// <summary>
        /// Determine whether the Id of an entry exists in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entryId">entryId</param>
        /// <returns>IdResponse</returns>
        IdResponse EntryIdExists (string context, string chainId, string entryId);

        /// <summary>
        /// Determine whether the Id of an entry exists in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entryId">entryId</param>
        /// <returns>ApiResponse of IdResponse</returns>
        ApiResponse<IdResponse> EntryIdExistsWithHttpInfo (string context, string chainId, string entryId);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class IdApi : IIdApi
    {
        private Sphereon.SDK.Blockchain.Easy.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="IdApi"/> class.
        /// </summary>
        /// <returns></returns>
        public IdApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = Sphereon.SDK.Blockchain.Easy.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="IdApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public IdApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Sphereon.SDK.Blockchain.Easy.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Sphereon.SDK.Blockchain.Easy.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Determine whether the Id of a chain exists in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <returns>IdResponse</returns>
        public IdResponse ChainIdExists (string context, string chainId)
        {
             ApiResponse<IdResponse> localVarResponse = ChainIdExistsWithHttpInfo(context, chainId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Determine whether the Id of a chain exists in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <returns>ApiResponse of IdResponse</returns>
        public ApiResponse< IdResponse > ChainIdExistsWithHttpInfo (string context, string chainId)
        {
            // verify the required parameter 'context' is set
            if (context == null)
                throw new ApiException(400, "Missing required parameter 'context' when calling IdApi->ChainIdExists");
            // verify the required parameter 'chainId' is set
            if (chainId == null)
                throw new ApiException(400, "Missing required parameter 'chainId' when calling IdApi->ChainIdExists");

            var localVarPath = "/blockchain/easy/0.9/{context}/chains/id/{chainId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (context != null) localVarPathParams.Add("context", Configuration.ApiClient.ParameterToString(context)); // path parameter
            if (chainId != null) localVarPathParams.Add("chainId", Configuration.ApiClient.ParameterToString(chainId)); // path parameter

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ChainIdExists", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<IdResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (IdResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(IdResponse)));
            
        }

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>IdResponse</returns>
        public IdResponse DetermineChainId (string context, Chain chain, bool? checkExistence = null)
        {
             ApiResponse<IdResponse> localVarResponse = DetermineChainIdWithHttpInfo(context, chain, checkExistence);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>ApiResponse of IdResponse</returns>
        public ApiResponse< IdResponse > DetermineChainIdWithHttpInfo (string context, Chain chain, bool? checkExistence = null)
        {
            // verify the required parameter 'context' is set
            if (context == null)
                throw new ApiException(400, "Missing required parameter 'context' when calling IdApi->DetermineChainId");
            // verify the required parameter 'chain' is set
            if (chain == null)
                throw new ApiException(400, "Missing required parameter 'chain' when calling IdApi->DetermineChainId");

            var localVarPath = "/blockchain/easy/0.9/{context}/chains/id";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (context != null) localVarPathParams.Add("context", Configuration.ApiClient.ParameterToString(context)); // path parameter
            if (checkExistence != null) localVarQueryParams.Add("checkExistence", Configuration.ApiClient.ParameterToString(checkExistence)); // query parameter
            if (chain != null && chain.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(chain); // http body (model) parameter
            }
            else
            {
                localVarPostBody = chain; // byte array
            }

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DetermineChainId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<IdResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (IdResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(IdResponse)));
            
        }

        /// <summary>
        /// Pre determine the Id of an entry request without anchoring the entry 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entry">The entry to determine the hash for on the specified chain</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>IdResponse</returns>
        public IdResponse DetermineEntryId (string context, string chainId, Entry entry, bool? checkExistence = null)
        {
             ApiResponse<IdResponse> localVarResponse = DetermineEntryIdWithHttpInfo(context, chainId, entry, checkExistence);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Pre determine the Id of an entry request without anchoring the entry 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entry">The entry to determine the hash for on the specified chain</param>
        /// <param name="checkExistence">Check whether the id exists (optional, default to false)</param>
        /// <returns>ApiResponse of IdResponse</returns>
        public ApiResponse< IdResponse > DetermineEntryIdWithHttpInfo (string context, string chainId, Entry entry, bool? checkExistence = null)
        {
            // verify the required parameter 'context' is set
            if (context == null)
                throw new ApiException(400, "Missing required parameter 'context' when calling IdApi->DetermineEntryId");
            // verify the required parameter 'chainId' is set
            if (chainId == null)
                throw new ApiException(400, "Missing required parameter 'chainId' when calling IdApi->DetermineEntryId");
            // verify the required parameter 'entry' is set
            if (entry == null)
                throw new ApiException(400, "Missing required parameter 'entry' when calling IdApi->DetermineEntryId");

            var localVarPath = "/blockchain/easy/0.9/{context}/chains/id/{chainId}/entries";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (context != null) localVarPathParams.Add("context", Configuration.ApiClient.ParameterToString(context)); // path parameter
            if (chainId != null) localVarPathParams.Add("chainId", Configuration.ApiClient.ParameterToString(chainId)); // path parameter
            if (checkExistence != null) localVarQueryParams.Add("checkExistence", Configuration.ApiClient.ParameterToString(checkExistence)); // query parameter
            if (entry != null && entry.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(entry); // http body (model) parameter
            }
            else
            {
                localVarPostBody = entry; // byte array
            }

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DetermineEntryId", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<IdResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (IdResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(IdResponse)));
            
        }

        /// <summary>
        /// Determine whether the Id of an entry exists in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entryId">entryId</param>
        /// <returns>IdResponse</returns>
        public IdResponse EntryIdExists (string context, string chainId, string entryId)
        {
             ApiResponse<IdResponse> localVarResponse = EntryIdExistsWithHttpInfo(context, chainId, entryId);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Determine whether the Id of an entry exists in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="context">context</param>
        /// <param name="chainId">chainId</param>
        /// <param name="entryId">entryId</param>
        /// <returns>ApiResponse of IdResponse</returns>
        public ApiResponse< IdResponse > EntryIdExistsWithHttpInfo (string context, string chainId, string entryId)
        {
            // verify the required parameter 'context' is set
            if (context == null)
                throw new ApiException(400, "Missing required parameter 'context' when calling IdApi->EntryIdExists");
            // verify the required parameter 'chainId' is set
            if (chainId == null)
                throw new ApiException(400, "Missing required parameter 'chainId' when calling IdApi->EntryIdExists");
            // verify the required parameter 'entryId' is set
            if (entryId == null)
                throw new ApiException(400, "Missing required parameter 'entryId' when calling IdApi->EntryIdExists");

            var localVarPath = "/blockchain/easy/0.9/{context}/chains/id/{chainId}/entries/{entryId}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (context != null) localVarPathParams.Add("context", Configuration.ApiClient.ParameterToString(context)); // path parameter
            if (chainId != null) localVarPathParams.Add("chainId", Configuration.ApiClient.ParameterToString(chainId)); // path parameter
            if (entryId != null) localVarPathParams.Add("entryId", Configuration.ApiClient.ParameterToString(entryId)); // path parameter

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("EntryIdExists", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<IdResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (IdResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(IdResponse)));
            
        }

    }
}
