<?php
/**
 * Entry
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
 * Entry Class Doc Comment
 *
 * @category    Class
 * @description Entry
 * @package     Sphereon\SDK\Blockchain\Easy
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Entry implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Entry';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'entry_data' => '\Sphereon\SDK\Blockchain\Easy\Model\EntryData'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'entry_data' => null
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
        'entry_data' => 'entryData'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'entry_data' => 'setEntryData'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'entry_data' => 'getEntryData'
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
        $this->container['entry_data'] = isset($data['entry_data']) ? $data['entry_data'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        if ($this->container['entry_data'] === null) {
            $invalid_properties[] = "'entry_data' can't be null";
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

        if ($this->container['entry_data'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets entry_data
     * @return \Sphereon\SDK\Blockchain\Easy\Model\EntryData
     */
    public function getEntryData()
    {
        return $this->container['entry_data'];
    }

    /**
     * Sets entry_data
     * @param \Sphereon\SDK\Blockchain\Easy\Model\EntryData $entry_data The Entry Data
     * @return $this
     */
    public function setEntryData($entry_data)
    {
        $this->container['entry_data'] = $entry_data;

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


