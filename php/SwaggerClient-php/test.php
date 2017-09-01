<?php
require_once(__DIR__ . '/autoload.php');

// Configure OAuth2 access token for authorization: oauth2schema
\Sphereon\SDK\Blockchain\Easy\Configuration::getDefaultConfiguration()->setAccessToken('8206cc62-9cbb-3dd0-bb4b-81abf75ca968');

$api_instance = new Sphereon\SDK\Blockchain\Easy\Api\AllApi();
//$api_instance->getApiClient()->getConfig()->setAccessToken("8206cc62-9cbb-3dd0-bb4b-81abf75ca968");
$context = "multichain"; // string | context
$chain_id = "5a9dfb9a8607021606eb6c09fb889315b9865d94a852bc03f40617911204eb98"; // string | chainId

try {
    $result = $api_instance->chainIdExists($context, $chain_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AllApi->chainIdExists: ', $e->getMessage(), PHP_EOL;
}

?>