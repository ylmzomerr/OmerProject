package MapStream;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        strings=strings.stream().filter(str->!str.contains("z") || !str.contains("Z")).collect(Collectors.toList());

        return strings;
    }
    public List<String> noYY(List<String> strings) {
        strings=strings.stream().filter(str->!str.endsWith("y")||!str.startsWith("yy")).collect(Collectors.toList());
        strings=strings.stream().map(str->str+"y" ).collect(Collectors.toList());

        return strings;
    }

}
