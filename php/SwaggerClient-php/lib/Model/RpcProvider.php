<?php
/**
 * RpcProvider
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
 * Do not edit the class manually.
 */

namespace Sphereon\SDK\Blockchain\Easy\Model;

use \ArrayAccess;

/**
 * RpcProvider Class Doc Comment
 *
 * @category    Class
 * @description RpcProvider
 * @package     Sphereon\SDK\Blockchain\Easy
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class RpcProvider implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'RpcProvider';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'owner_type' => 'string',
        'password' => 'string',
        'access' => '\Sphereon\SDK\Blockchain\Easy\Model\Access',
        'resource_files' => 'map[string,string]',
        'host' => 'string',
        'id' => 'string',
        'type' => 'string',
        'username' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'owner_type' => null,
        'password' => null,
        'access' => null,
        'resource_files' => null,
        'host' => null,
        'id' => null,
        'type' => null,
        'username' => null
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
        'owner_type' => 'ownerType',
        'password' => 'password',
        'access' => 'access',
        'resource_files' => 'resourceFiles',
        'host' => 'host',
        'id' => 'id',
        'type' => 'type',
        'username' => 'username'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'owner_type' => 'setOwnerType',
        'password' => 'setPassword',
        'access' => 'setAccess',
        'resource_files' => 'setResourceFiles',
        'host' => 'setHost',
        'id' => 'setId',
        'type' => 'setType',
        'username' => 'setUsername'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'owner_type' => 'getOwnerType',
        'password' => 'getPassword',
        'access' => 'getAccess',
        'resource_files' => 'getResourceFiles',
        'host' => 'getHost',
        'id' => 'getId',
        'type' => 'getType',
        'username' => 'getUsername'
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

    const OWNER_TYPE_PROVIDER = 'PROVIDER';
    const OWNER_TYPE_CUSTOMER = 'CUSTOMER';
    const TYPE_API = 'API';
    const TYPE_WALLET = 'WALLET';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getOwnerTypeAllowableValues()
    {
        return [
            self::OWNER_TYPE_PROVIDER,
            self::OWNER_TYPE_CUSTOMER,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_API,
            self::TYPE_WALLET,
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
        $this->container['owner_type'] = isset($data['owner_type']) ? $data['owner_type'] : null;
        $this->container['password'] = isset($data['password']) ? $data['password'] : null;
        $this->container['access'] = isset($data['access']) ? $data['access'] : null;
        $this->container['resource_files'] = isset($data['resource_files']) ? $data['resource_files'] : null;
        $this->container['host'] = isset($data['host']) ? $data['host'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
        $this->container['username'] = isset($data['username']) ? $data['username'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        $allowed_values = $this->getOwnerTypeAllowableValues();
        if (!in_array($this->container['owner_type'], $allowed_values)) {
            $invalid_properties[] = sprintf(
                "invalid value for 'owner_type', must be one of '%s'",
                implode("', '", $allowed_values)
            );
        }

        $allowed_values = $this->getTypeAllowableValues();
        if (!in_array($this->container['type'], $allowed_values)) {
            $invalid_properties[] = sprintf(
                "invalid value for 'type', must be one of '%s'",
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

        $allowed_values = $this->getOwnerTypeAllowableValues();
        if (!in_array($this->container['owner_type'], $allowed_values)) {
            return false;
        }
        $allowed_values = $this->getTypeAllowableValues();
        if (!in_array($this->container['type'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets owner_type
     * @return string
     */
    public function getOwnerType()
    {
        return $this->container['owner_type'];
    }

    /**
     * Sets owner_type
     * @param string $owner_type
     * @return $this
     */
    public function setOwnerType($owner_type)
    {
        $allowed_values = $this->getOwnerTypeAllowableValues();
        if (!is_null($owner_type) && !in_array($owner_type, $allowed_values)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'owner_type', must be one of '%s'",
                    implode("', '", $allowed_values)
                )
            );
        }
        $this->container['owner_type'] = $owner_type;

        return $this;
    }

    /**
     * Gets password
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     * @param string $password
     * @return $this
     */
    public function setPassword($password)
    {
        $this->container['password'] = $password;

        return $this;
    }

    /**
     * Gets access
     * @return \Sphereon\SDK\Blockchain\Easy\Model\Access
     */
    public function getAccess()
    {
        return $this->container['access'];
    }

    /**
     * Sets access
     * @param \Sphereon\SDK\Blockchain\Easy\Model\Access $access
     * @return $this
     */
    public function setAccess($access)
    {
        $this->container['access'] = $access;

        return $this;
    }

    /**
     * Gets resource_files
     * @return map[string,string]
     */
    public function getResourceFiles()
    {
        return $this->container['resource_files'];
    }

    /**
     * Sets resource_files
     * @param map[string,string] $resource_files
     * @return $this
     */
    public function setResourceFiles($resource_files)
    {
        $this->container['resource_files'] = $resource_files;

        return $this;
    }

    /**
     * Gets host
     * @return string
     */
    public function getHost()
    {
        return $this->container['host'];
    }

    /**
     * Sets host
     * @param string $host
     * @return $this
     */
    public function setHost($host)
    {
        $this->container['host'] = $host;

        return $this;
    }

    /**
     * Gets id
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param string $id
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets type
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     * @param string $type
     * @return $this
     */
    public function setType($type)
    {
        $allowed_values = $this->getTypeAllowableValues();
        if (!is_null($type) && !in_array($type, $allowed_values)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'type', must be one of '%s'",
                    implode("', '", $allowed_values)
                )
            );
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets username
     * @return string
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     * @param string $username
     * @return $this
     */
    public function setUsername($username)
    {
        $this->container['username'] = $username;

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


