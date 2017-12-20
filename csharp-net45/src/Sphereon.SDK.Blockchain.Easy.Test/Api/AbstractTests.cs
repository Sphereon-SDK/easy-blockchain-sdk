using System;
using System.Linq;
using System.Text;
using Sphereon.SDK.Blockchain.Easy.Client;
using Sphereon.SDK.Blockchain.Easy.Model;

namespace Sphereon.SDK.Blockchain.Easy.Test.Api
{
    public abstract class AbstractTests
    {
        protected static string FixedAccessToken =
            Environment.GetEnvironmentVariable("tests.dotnet.easy-blockchain.accesstoken");

        public const string ContextMultchain = "multichain";
        public const string ContextFactom = "factom";
        public const String TestEntryContent = "Test Entry Content";
        public const String FirstEntryExternalId = "first entry external id";
        public const String SecondEntryExternalId = "second entry external id";
        public const String TestChainId = "502b99271ff6a3f8509ba2764e1e1c1482ad800140c17b25e165837ab5320501";


        protected void ConfigureApi(Configuration configuration)
        {
            configuration.AccessToken = FixedAccessToken;
            configuration.Timeout = 40000;
            var gatewayUrl = Environment.GetEnvironmentVariable("tests.dotnet.easy-blockchain.gateway-url");
            if (!string.IsNullOrEmpty(gatewayUrl))
            {
                configuration.ApiClient.RestClient.BaseUrl = new Uri(gatewayUrl);
            }
        }


        protected Chain CreateChainRequest(string content, params string[] externalIdValues)
        {
            var firstEntry = CreateEntry(content, externalIdValues);
            return new Chain(firstEntry);
        }

        protected Entry CreateEntry(string content, params string[] externalIdValues)
        {
            var externalIds = externalIdValues.Select(externalIdValue =>
                    new ExternalId(Encoding.UTF8.GetBytes(externalIdValue)))
                .ToList();
            var entryData = new EntryData(externalIds, Encoding.UTF8.GetBytes(content));
            return new Entry(entryData);
        }
    }
}