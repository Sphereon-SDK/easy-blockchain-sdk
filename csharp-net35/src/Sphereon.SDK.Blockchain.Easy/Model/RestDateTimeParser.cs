using System;
using System.Runtime.CompilerServices;

namespace Sphereon.SDK.Blockchain.Easy.Model
{
    internal class RestDateTimeParser
    {
        public static DateTime? Parse(string dateTimeString)
        {
            if (string.IsNullOrEmpty(dateTimeString))
                return null;
            DateTime result;
            if (!DateTime.TryParse(dateTimeString, out result))
            {
                string withoutDot = dateTimeString.Replace(".", "");
                if (withoutDot.Length > 13)
                    withoutDot = withoutDot.Substring(0, 13);
                long epochTime;
                if(long.TryParse(withoutDot, out epochTime))
                {
                    result = new DateTime(epochTime * TimeSpan.TicksPerMillisecond, DateTimeKind.Utc);
                }
            }
            return result;
        }
    }
}