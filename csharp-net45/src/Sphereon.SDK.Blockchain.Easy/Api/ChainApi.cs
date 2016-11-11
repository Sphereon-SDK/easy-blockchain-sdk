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
    public interface IChainApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Create a new chain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>CommittedChainResponse</returns>
        CommittedChainResponse CreateChainUsingPOST (Chain chain);

        /// <summary>
        /// Create a new chain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>ApiResponse of CommittedChainResponse</returns>
        ApiResponse<CommittedChainResponse> CreateChainUsingPOSTWithHttpInfo (Chain chain);
        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>IdResponse</returns>
        IdResponse DetermineChainId (Chain chain);

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>ApiResponse of IdResponse</returns>
        ApiResponse<IdResponse> DetermineChainIdWithHttpInfo (Chain chain);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Create a new chain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of CommittedChainResponse</returns>
        System.Threading.Tasks.Task<CommittedChainResponse> CreateChainUsingPOSTAsync (Chain chain);

        /// <summary>
        /// Create a new chain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of ApiResponse (CommittedChainResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CommittedChainResponse>> CreateChainUsingPOSTAsyncWithHttpInfo (Chain chain);
        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of IdResponse</returns>
        System.Threading.Tasks.Task<IdResponse> DetermineChainIdAsync (Chain chain);

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of ApiResponse (IdResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<IdResponse>> DetermineChainIdAsyncWithHttpInfo (Chain chain);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ChainApi : IChainApi
    {
        private Sphereon.SDK.Blockchain.Easy.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ChainApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ChainApi(String basePath)
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
        /// Initializes a new instance of the <see cref="ChainApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ChainApi(Configuration configuration = null)
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
        /// Create a new chain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>CommittedChainResponse</returns>
        public CommittedChainResponse CreateChainUsingPOST (Chain chain)
        {
             ApiResponse<CommittedChainResponse> localVarResponse = CreateChainUsingPOSTWithHttpInfo(chain);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Create a new chain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>ApiResponse of CommittedChainResponse</returns>
        public ApiResponse< CommittedChainResponse > CreateChainUsingPOSTWithHttpInfo (Chain chain)
        {
            // verify the required parameter 'chain' is set
            if (chain == null)
                throw new ApiException(400, "Missing required parameter 'chain' when calling ChainApi->CreateChainUsingPOST");

            var localVarPath = "/blockchain/easy/0.1.0/chains";
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
            if (chain != null && chain.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(chain); // http body (model) parameter
            }
            else
            {
                localVarPostBody = chain; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateChainUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CommittedChainResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CommittedChainResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(CommittedChainResponse)));
            
        }

        /// <summary>
        /// Create a new chain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of CommittedChainResponse</returns>
        public async System.Threading.Tasks.Task<CommittedChainResponse> CreateChainUsingPOSTAsync (Chain chain)
        {
             ApiResponse<CommittedChainResponse> localVarResponse = await CreateChainUsingPOSTAsyncWithHttpInfo(chain);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Create a new chain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Create a chain using the first entry supplied. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of ApiResponse (CommittedChainResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<CommittedChainResponse>> CreateChainUsingPOSTAsyncWithHttpInfo (Chain chain)
        {
            // verify the required parameter 'chain' is set
            if (chain == null)
                throw new ApiException(400, "Missing required parameter 'chain' when calling ChainApi->CreateChainUsingPOST");

            var localVarPath = "/blockchain/easy/0.1.0/chains";
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
            if (chain != null && chain.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(chain); // http body (model) parameter
            }
            else
            {
                localVarPostBody = chain; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateChainUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CommittedChainResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CommittedChainResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(CommittedChainResponse)));
            
        }

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>IdResponse</returns>
        public IdResponse DetermineChainId (Chain chain)
        {
             ApiResponse<IdResponse> localVarResponse = DetermineChainIdWithHttpInfo(chain);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>ApiResponse of IdResponse</returns>
        public ApiResponse< IdResponse > DetermineChainIdWithHttpInfo (Chain chain)
        {
            // verify the required parameter 'chain' is set
            if (chain == null)
                throw new ApiException(400, "Missing required parameter 'chain' when calling ChainApi->DetermineChainId");

            var localVarPath = "/blockchain/easy/0.1.0/chains/id";
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
            if (chain != null && chain.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(chain); // http body (model) parameter
            }
            else
            {
                localVarPostBody = chain; // byte array
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
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of IdResponse</returns>
        public async System.Threading.Tasks.Task<IdResponse> DetermineChainIdAsync (Chain chain)
        {
             ApiResponse<IdResponse> localVarResponse = await DetermineChainIdAsyncWithHttpInfo(chain);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Pre determine the Id of a chain request without anchoring it in the blockchain 
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Easy.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="chain">Determine a chain hash. The entry needs at least a (combination of) globaly unique external Id in the complete Blockchain network!</param>
        /// <returns>Task of ApiResponse (IdResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<IdResponse>> DetermineChainIdAsyncWithHttpInfo (Chain chain)
        {
            // verify the required parameter 'chain' is set
            if (chain == null)
                throw new ApiException(400, "Missing required parameter 'chain' when calling ChainApi->DetermineChainId");

            var localVarPath = "/blockchain/easy/0.1.0/chains/id";
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
            if (chain != null && chain.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(chain); // http body (model) parameter
            }
            else
            {
                localVarPostBody = chain; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
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

    }
}
