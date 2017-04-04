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


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Blockchain.Easy.Api;
using Sphereon.SDK.Blockchain.Easy.Model;
using Sphereon.SDK.Blockchain.Easy.Client;
using System.Reflection;

namespace Sphereon.SDK.Blockchain.Easy.Test
{
    /// <summary>
    ///  Class for testing CommittedChainResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class CommittedChainResponseTests
    {
        // TODO uncomment below to declare an instance variable for CommittedChainResponse
        //private CommittedChainResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of CommittedChainResponse
            //instance = new CommittedChainResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CommittedChainResponse
        /// </summary>
        [Test]
        public void CommittedChainResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" CommittedChainResponse
            //Assert.IsInstanceOfType<CommittedChainResponse> (instance, "variable 'instance' is a CommittedChainResponse");
        }

        /// <summary>
        /// Test the property 'Chain'
        /// </summary>
        [Test]
        public void ChainTest()
        {
            // TODO unit test for the property 'Chain'
        }
        /// <summary>
        /// Test the property 'CommitTime'
        /// </summary>
        [Test]
        public void CommitTimeTest()
        {
            // TODO unit test for the property 'CommitTime'
        }
        /// <summary>
        /// Test the property 'CreationRequestTime'
        /// </summary>
        [Test]
        public void CreationRequestTimeTest()
        {
            // TODO unit test for the property 'CreationRequestTime'
        }

    }

}
