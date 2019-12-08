package MapStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
      nums=nums.stream().map(x->x*2).collect(Collectors.toList());
      nums=nums.stream().filter(x->x%10!=2).collect(Collectors.toList());
        return nums;

    }


}
