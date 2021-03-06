<?php
/**
 * CommittedEntryResponse
 *
 * PHP version 5
 *
 * @category Class
 * @package  Sphereon\SDK\Blockchain\Easy
 * @author   Swaagger Codegen team
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

namespace Sphereon\SDK\Blockchain\Easy\Model;

use \ArrayAccess;

/**
 * CommittedEntryResponse Class Doc Comment
 *
 * @category    Class
 * @description Committed EntryData response
 * @package     Sphereon\SDK\Blockchain\Easy
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class CommittedEntryResponse implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'CommittedEntryResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'entry' => '\Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry',
        'commit_time' => '\DateTime',
        'creation_request_time' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'entry' => null,
        'commit_time' => 'date-time',
        'creation_request_time' => 'date-time'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'entry' => 'entry',
        'commit_time' => 'commitTime',
        'creation_request_time' => 'creationRequestTime'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'entry' => 'setEntry',
        'commit_time' => 'setCommitTime',
        'creation_request_time' => 'setCreationRequestTime'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'entry' => 'getEntry',
        'commit_time' => 'getCommitTime',
        'creation_request_time' => 'getCreationRequestTime'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['entry'] = isset($data['entry']) ? $data['entry'] : null;
        $this->container['commit_time'] = isset($data['commit_time']) ? $data['commit_time'] : null;
        $this->container['creation_request_time'] = isset($data['creation_request_time']) ? $data['creation_request_time'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        if ($this->container['entry'] === null) {
            $invalid_properties[] = "'entry' can't be null";
        }
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        if ($this->container['entry'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets entry
     * @return \Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry
     */
    public function getEntry()
    {
        return $this->container['entry'];
    }

    /**
     * Sets entry
     * @param \Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry $entry
     * @return $this
     */
    public function setEntry($entry)
    {
        $this->container['entry'] = $entry;

        return $this;
    }

    /**
     * Gets commit_time
     * @return \DateTime
     */
    public function getCommitTime()
    {
        return $this->container['commit_time'];
    }

    /**
     * Sets commit_time
     * @param \DateTime $commit_time The time at which the entry creation was first requested in ISO 8601 format
     * @return $this
     */
    public function setCommitTime($commit_time)
    {
        $this->container['commit_time'] = $commit_time;

        return $this;
    }

    /**
     * Gets creation_request_time
     * @return \DateTime
     */
    public function getCreationRequestTime()
    {
        return $this->container['creation_request_time'];
    }

    /**
     * Sets creation_request_time
     * @param \DateTime $creation_request_time The time at which the entry creation was first requested in ISO 8601 format
     * @return $this
     */
    public function setCreationRequestTime($creation_request_time)
    {
        $this->container['creation_request_time'] = $creation_request_time;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Sphereon\SDK\Blockchain\Easy\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Sphereon\SDK\Blockchain\Easy\ObjectSerializer::sanitizeForSerialization($this));
    }
}


