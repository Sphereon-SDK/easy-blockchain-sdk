<?php
/**
 * ApiException
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
 * The Easy Blockchain API is an easy to use API to store related entries within chains. Currently it stores entries using a Factom, Ethereum or Multichain blockchain.   For full API documentation please visit: https://docs.sphereon.com/api/easy-blockchain/0.10/html   Interactive testing: A web based test console is available in the Sphereon API store at: https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Sphereon\SDK\Blockchain\Easy;

use \Exception;

/**
 * ApiException Class Doc Comment
 *
 * @category Class
 * @package  Sphereon\SDK\Blockchain\Easy
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class ApiException extends Exception
{

    /**
     * The HTTP body of the server response either as Json or string.
     *
     * @var mixed
     */
    protected $responseBody;

    /**
     * The HTTP header of the server response.
     *
     * @var string[]
     */
    protected $responseHeaders;

    /**
     * The deserialized response object
     *
     * @var $responseObject;
     */
    protected $responseObject;

    /**
     * Constructor
     *
     * @param string   $message         Error message
     * @param int      $code            HTTP status code
     * @param string[] $responseHeaders HTTP response header
     * @param mixed    $responseBody    HTTP decoded body of the server response either as \stdClass or string
     */
    public function __construct($message = "", $code = 0, $responseHeaders = [], $responseBody = null)
    {
        parent::__construct($message, $code);
        $this->responseHeaders = $responseHeaders;
        $this->responseBody = $responseBody;
    }

    /**
     * Gets the HTTP response header
     *
     * @return string[] HTTP response headers
     */
    public function getResponseHeaders()
    {
        return $this->responseHeaders;
    }

    /**
     * Gets the HTTP body of the server response either as Json or string
     *
     * @return mixed HTTP body of the server response either as \stdClass or string
     */
    public function getResponseBody()
    {
        return $this->responseBody;
    }

    /**
     * Sets the deseralized response object (during deserialization)
     *
     * @param mixed $obj Deserialized response object
     *
     * @return void
     */
    public function setResponseObject($obj)
    {
        $this->responseObject = $obj;
    }

    /**
     * Gets the deseralized response object (during deserialization)
     *
     * @return mixed the deserialized response object
     */
    public function getResponseObject()
    {
        return $this->responseObject;
    }
}
