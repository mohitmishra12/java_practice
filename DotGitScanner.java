import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class DotGitScanner {

    private static final List<String> baseUrls = Arrays.asList(
            "https://mylyca-ie-pre-prod.ldsvcplatform.com/en/",
            "https://dt-website-us-pre-prod.ldsvcplatform.com/en/",
            "https://mylyca-ie-dev.ldsvcplatform.com/en/",
            "https://dt-website-us-pre-prod.ldsvcplatform.com/en/",
            "https://mylyca-mk-dev.ldsvcplatform.com/en/",
            "https://dt-website-us-pre-prod.ldsvcplatform.com/en/",
            "https://uat-lycachat.ldsvcplatform.com/en/",
            "https://dt-website-us-pre-prod.ldsvcplatform.com/",
            "https://lycamobileapp.ldsvcplatform.com/",
            "https://lm-upgraded-ug2.ldsvcplatform.com/en/",
            "https://mylyca-be-hotfix.ldsvcplatform.com/",
            "https://dt-website-us-pre-prod.ldsvcplatform.com/",
            "https://lmde-postpaid-platform-prod.ldsvcplatform.com/"

            );

    private static final List<String> gitPaths = Arrays.asList(
            ".git/config",
            ".git/HEAD",
            ".git/index",
            ".git/logs/HEAD",
            ".git/objects/pack/pack-*.pack"  // Wildcard handling would need improvement
    );

    public static void main(String[] args) {
        checkDotGitExposure();
    }

    public static void checkDotGitExposure() {
        for (String baseUrl : baseUrls) {
            System.out.println("\n🔍 Checking: " + baseUrl);

            for (String path : gitPaths) {
                String fullUrl = baseUrl + path;

                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(fullUrl).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);

                    int responseCode = connection.getResponseCode();

                    if (responseCode == 200 || responseCode == 403) {
                        System.out.println("🛑 " + fullUrl + " ➜ Status: " + responseCode);
                    }

                } catch (Exception e) {
                    System.out.println("⚠️  " + fullUrl + " ➜ Error: " + e.getMessage());
                }
            }
        }
    }
}
