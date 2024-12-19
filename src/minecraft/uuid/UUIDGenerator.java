package minecraft.uuid;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

public class UUIDGenerator {
    private static final URL url;

    static {
        try {
            url = new URI("https://www.uuidtools.com/api/generate/v4").toURL();
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getUUIDByUrl() {
        if (!isNetworkAvailable()) {
            return getUUIDByLocal();
        }

        String data = Request.get(url);

        if (data != null) {
            return convertUUIDToCustomFormat(data.substring(2, data.length() - 2));
        }

        return null;
    }

    public static String getUUIDByLocal() {
        return convertUUIDToCustomFormat(UUID.randomUUID().toString());
    }

    private static boolean isNetworkAvailable() {
        try {
            InetAddress address = InetAddress.getByName("8.8.8.8");
            return address.isReachable(2000);
        } catch (Exception e) {
            return false;
        }
    }

    private static String convertUUIDToCustomFormat(String uuidFromString) {
        UUID uuid = UUID.fromString(uuidFromString);

        // 获取 UUID 的高64位和低64位
        long high64 = uuid.getMostSignificantBits(); // 高64位
        long low64 = uuid.getLeastSignificantBits(); // 低64位

        // 将高64位分成两个 32 位整数
        int high64High32 = (int) (high64 >> 32); // 高64位的高32位
        int high64Low32 = (int) (high64 & 0xFFFFFFFFL); // 高64位的低32位

        // 将低64位分成两个 32 位整数
        int low64High32 = (int) (low64 >> 32); // 低64位的高32位
        int low64Low32 = (int) (low64 & 0xFFFFFFFFL); // 低64位的低32位

        return String.format("[I;%d,%d,%d,%d]", high64High32, high64Low32, low64High32, low64Low32);
    }
}
