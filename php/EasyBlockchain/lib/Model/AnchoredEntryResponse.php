<?php
/**
 * AnchoredEntryResponse
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
 * AnchoredEntryResponse Class Doc Comment
 *
 * @category    Class
 * @description Anchored Entry response
 * @package     Sphereon\SDK\Blockchain\Easy
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class AnchoredEntryResponse implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'AnchoredEntryResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'anchored_entry' => '\Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry',
        'anchor_times' => '\DateTime[]',
        'current_anchor_time' => '\DateTime',
        'anchor_state' => 'string',
        'last_anchor_time' => '\DateTime',
        'first_anchor_time' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'anchored_entry' => null,
        'anchor_times' => 'date-time',
        'current_anchor_time' => 'date-time',
        'anchor_state' => null,
        'last_anchor_time' => 'date-time',
        'first_anchor_time' => 'date-time'
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
        'anchored_entry' => 'anchoredEntry',
        'anchor_times' => 'anchorTimes',
        'current_anchor_time' => 'currentAnchorTime',
        'anchor_state' => 'anchorState',
        'last_anchor_time' => 'lastAnchorTime',
        'first_anchor_time' => 'firstAnchorTime'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'anchored_entry' => 'setAnchoredEntry',
        'anchor_times' => 'setAnchorTimes',
        'current_anchor_time' => 'setCurrentAnchorTime',
        'anchor_state' => 'setAnchorState',
        'last_anchor_time' => 'setLastAnchorTime',
        'first_anchor_time' => 'setFirstAnchorTime'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'anchored_entry' => 'getAnchoredEntry',
        'anchor_times' => 'getAnchorTimes',
        'current_anchor_time' => 'getCurrentAnchorTime',
        'anchor_state' => 'getAnchorState',
        'last_anchor_time' => 'getLastAnchorTime',
        'first_anchor_time' => 'getFirstAnchorTime'
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

    const ANCHOR_STATE_REQUESTED = 'REQUESTED';
    const ANCHOR_STATE_COMMITTED = 'COMMITTED';
    const ANCHOR_STATE_NOT_FOUND = 'NOT_FOUND';
    const ANCHOR_STATE_ANCHORED = 'ANCHORED';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getAnchorStateAllowableValues()
    {
        return [
            self::ANCHOR_STATE_REQUESTED,
            self::ANCHOR_STATE_COMMITTED,
            self::ANCHOR_STATE_NOT_FOUND,
            self::ANCHOR_STATE_ANCHORED,
        ];
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
        $this->container['anchored_entry'] = isset($data['anchored_entry']) ? $data['anchored_entry'] : null;
        $this->container['anchor_times'] = isset($data['anchor_times']) ? $data['anchor_times'] : null;
        $this->container['current_anchor_time'] = isset($data['current_anchor_time']) ? $data['current_anchor_time'] : null;
        $this->container['anchor_state'] = isset($data['anchor_state']) ? $data['anchor_state'] : null;
        $this->container['last_anchor_time'] = isset($data['last_anchor_time']) ? $data['last_anchor_time'] : null;
        $this->container['first_anchor_time'] = isset($data['first_anchor_time']) ? $data['first_anchor_time'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        if ($this->container['anchored_entry'] === null) {
            $invalid_properties[] = "'anchored_entry' can't be null";
        }
        if ($this->container['anchor_state'] === null) {
            $invalid_properties[] = "'anchor_state' can't be null";
        }
        $allowed_values = $this->getAnchorStateAllowableValues();
        if (!in_array($this->container['anchor_state'], $allowed_values)) {
            $invalid_properties[] = sprintf(
                "invalid value for 'anchor_state', must be one of '%s'",
                implode("', '", $allowed_values)
            );
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

        if ($this->container['anchored_entry'] === null) {
            return false;
        }
        if ($this->container['anchor_state'] === null) {
            return false;
        }
        $allowed_values = $this->getAnchorStateAllowableValues();
        if (!in_array($this->container['anchor_state'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets anchored_entry
     * @return \Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry
     */
    public function getAnchoredEntry()
    {
        return $this->container['anchored_entry'];
    }

    /**
     * Sets anchored_entry
     * @param \Sphereon\SDK\Blockchain\Easy\Model\CommittedEntry $anchored_entry
     * @return $this
     */
    public function setAnchoredEntry($anchored_entry)
    {
        $this->container['anchored_entry'] = $anchored_entry;

        return $this;
    }

    /**
     * Gets anchor_times
     * @return \DateTime[]
     */
    public function getAnchorTimes()
    {
        return $this->container['anchor_times'];
    }

    /**
     * Sets anchor_times
     * @param \DateTime[] $anchor_times All the times at which the Entry with the same Id was anchored in the blockchain in ISO 8601 format. The first, current and last Anchor Times will also be in this list
     * @return $this
     */
    public function setAnchorTimes($anchor_times)
    {
        $this->container['anchor_times'] = $anchor_times;

        return $this;
    }

    /**
     * Gets current_anchor_time
     * @return \DateTime
     */
    public function getCurrentAnchorTime()
    {
        return $this->container['current_anchor_time'];
    }

    /**
     * Sets current_anchor_time
     * @param \DateTime $current_anchor_time The current anchor time (this is not necessarely the last anchor time!) of the entry (if any) in the blockchain in ISO 8601 format
     * @return $this
     */
    public function setCurrentAnchorTime($current_anchor_time)
    {
        $this->container['current_anchor_time'] = $current_anchor_time;

        return $this;
    }

    /**
     * Gets anchor_state
     * @return string
     */
    public function getAnchorState()
    {
        return $this->container['anchor_state'];
    }

    /**
     * Sets anchor_state
     * @param string $anchor_state
     * @return $this
     */
    public function setAnchorState($anchor_state)
    {
        $allowed_values = $this->getAnchorStateAllowableValues();
        if (!in_array($anchor_state, $allowed_values)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'anchor_state', must be one of '%s'",
                    implode("', '", $allowed_values)
                )
            );
        }
        $this->container['anchor_state'] = $anchor_state;

        return $this;
    }

    /**
     * Gets last_anchor_time
     * @return \DateTime
     */
    public function getLastAnchorTime()
    {
        return $this->container['last_anchor_time'];
    }

    /**
     * Sets last_anchor_time
     * @param \DateTime $last_anchor_time The last anchor time of the entry (if any) in the blockchain in ISO 8601 format
     * @return $this
     */
    public function setLastAnchorTime($last_anchor_time)
    {
        $this->container['last_anchor_time'] = $last_anchor_time;

        return $this;
    }

    /**
     * Gets first_anchor_time
     * @return \DateTime
     */
    public function getFirstAnchorTime()
    {
        return $this->container['first_anchor_time'];
    }

    /**
     * Sets first_anchor_time
     * @param \DateTime $first_anchor_time The first anchor time of the entry (if any) in the blockchain in ISO 8601 format
     * @return $this
     */
    public function setFirstAnchorTime($first_anchor_time)
    {
        $this->container['first_anchor_time'] = $first_anchor_time;

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


