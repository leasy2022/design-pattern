import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LogParser {


    public static void main(String[] args) throws Exception {
        String[] dirs = new String[]{"event", "cardshow", "pageshow"};
//        String filePath = "/Users/wushang/Downloads/2018101_.log";
        String filePath = "/Users/wushang/Downloads/2018102_.log";
        List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        lines.stream().filter(line -> line.startsWith("drwxr-xr-x")).map(line -> line.split("\\s+")[7]);

        Map<String, Set<String>> map = new HashMap<>();

        for (String line : lines) {
            if (!line.startsWith("drwxr-xr-x"))
                continue;
            if(line.contains("za-log-server") ||line.contains("za-streaming-etl.data.zhihudaily.entry")|| line.contains("desktopweb") ||line.contains("ipad") || line.contains("desktopweb")||line.contains("wechatapp")
                ||line.contains("za-streaming-etl.msg.search-query")
            ) {
                continue;
            }
            String pathDetail = line.split("\\s+")[7];

            int pos = pathDetail.lastIndexOf("/");

            String parentDir = pathDetail.substring(0, pos);
            String subDir = pathDetail.substring(pos + 1);

            if (!map.containsKey(parentDir)) {
                map.put(parentDir, new HashSet<>());
            }
            map.get(parentDir).add(subDir);
        }

        FileWriter writer = new FileWriter(filePath+"_filter", true);

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> set = entry.getValue();

            for (String d : dirs) {
                if (!set.contains(d)) {
                    String s = key + "/" + d;
                    System.out.println(s);
                    writer.write(s+"\n");
                }
            }

        }
        writer.close();
    }
}
