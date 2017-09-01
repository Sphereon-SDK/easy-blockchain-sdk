<?php
/**
 * AllApiTest
 * PHP version 5
 *
 * @category Class
 * @package  Sphereon\SDK\Blockchain\Easy
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Easy Blockchain API
 *
 * <b>The Easy Blockchain API is an easy to use API to store entries within chains. Currently it stores entries using the bitcoin blockchain by means of Factom or Multichain. The latter also allows for a private blockchain. In the future other solutions will be made available</b>    The flow is generally as follows:  1. Make sure a context is available using the / POST endpoint. Normally you only need one context. This is the place where backend providers and blockchain implementations are being specified.  2. Make sure a chain has been created using the /chain POST endpoint. Normally you only need one or a handful of chains. This is a relative expensive operation.  3. Store entries on the chain from step 2. The entries will contain the content and metadata you want to store forever on the specified chain.  4. Retrieve an existing entry from the chain to verify or retrieve data      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the endpoint.
 */

namespace Sphereon\SDK\Blockchain\Easy;

use \Sphereon\SDK\Blockchain\Easy\Configuration;
use \Sphereon\SDK\Blockchain\Easy\ApiClient;
use \Sphereon\SDK\Blockchain\Easy\ApiException;
use \Sphereon\SDK\Blockchain\Easy\ObjectSerializer;

/**
 * AllApiTest Class Doc Comment
 *
 * @category Class
 * @package  Sphereon\SDK\Blockchain\Easy
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AllApiTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for chainIdExists
     *
     * Determine whether the Id of a chain exists in the blockchain.
     *
     */
    public function testChainIdExists()
    {
    }

    /**
     * Test case for createBackend
     *
     * Create a new backend.
     *
     */
    public function testCreateBackend()
    {
    }

    /**
     * Test case for createChain
     *
     * Create a new chain.
     *
     */
    public function testCreateChain()
    {
    }

    /**
     * Test case for createContext
     *
     * Create a new context.
     *
     */
    public function testCreateContext()
    {
    }

    /**
     * Test case for createEntry
     *
     * Create a new entry in the provided chain.
     *
     */
    public function testCreateEntry()
    {
    }

    /**
     * Test case for deleteBackend
     *
     * Delete backend by id (not by ledgername).
     *
     */
    public function testDeleteBackend()
    {
    }

    /**
     * Test case for determineChainId
     *
     * Pre determine the Id of a chain request without anchoring it in the blockchain.
     *
     */
    public function testDetermineChainId()
    {
    }

    /**
     * Test case for determineEntryId
     *
     * Pre determine the Id of an entry request without anchoring the entry.
     *
     */
    public function testDetermineEntryId()
    {
    }

    /**
     * Test case for entryById
     *
     * Get an existing entry in the provided chain.
     *
     */
    public function testEntryById()
    {
    }

    /**
     * Test case for entryByRequest
     *
     * Get an existing entry in the provided chain.
     *
     */
    public function testEntryByRequest()
    {
    }

    /**
     * Test case for entryIdExists
     *
     * Determine whether the Id of an entry exists in the blockchain.
     *
     */
    public function testEntryIdExists()
    {
    }

    /**
     * Test case for findBackends
     *
     * Find existing backend(s) by id (single result) and/or ledgername (multiple results). Optionally including public backends of others.
     *
     */
    public function testFindBackends()
    {
    }

    /**
     * Test case for firstEntry
     *
     * Get the first entry in the provided chain. This is the oldest entry also called the chain tail.  Please note that the achorTimes will only contain the first anchor time. Call getEntry to retrieve all times.
     *
     */
    public function testFirstEntry()
    {
    }

    /**
     * Test case for getBackend
     *
     * Get existing backend by id (not by ledgername). Optionally including public backend of others.
     *
     */
    public function testGetBackend()
    {
    }

    /**
     * Test case for getContext
     *
     * Get an existing context.
     *
     */
    public function testGetContext()
    {
    }

    /**
     * Test case for lastEntry
     *
     * Get the last entry in the provided chain. This is the most recent entry also called the chain head. Please note that the achorTimes will only contain the latest anchor time. Call getEntry to retrieve all times.
     *
     */
    public function testLastEntry()
    {
    }

    /**
     * Test case for listBackends
     *
     * List existing backends..
     *
     */
    public function testListBackends()
    {
    }

    /**
     * Test case for nextEntryById
     *
     * Get the entry after the supplied entry Id (the next) in the provided chain.
     *
     */
    public function testNextEntryById()
    {
    }

    /**
     * Test case for nextEntryByRequest
     *
     * Get the entry after the supplied entry Id (the next) in the provided chain.
     *
     */
    public function testNextEntryByRequest()
    {
    }

    /**
     * Test case for previousEntryById
     *
     * Get the entry before the supplied entry Id (the previous) in the provided chain.
     *
     */
    public function testPreviousEntryById()
    {
    }

    /**
     * Test case for previousEntryByRequest
     *
     * Get the entry before the supplied entry Id (the previous) in the provided chain.
     *
     */
    public function testPreviousEntryByRequest()
    {
    }
}
