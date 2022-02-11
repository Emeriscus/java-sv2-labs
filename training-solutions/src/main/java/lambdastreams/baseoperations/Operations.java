package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {

    private List<Integer> nums = new ArrayList<>();

    public Operations(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public Optional<Integer> min() {
        return nums.stream()
                .min(Comparator.naturalOrder());

    }

    public Integer sum() {
        return nums.stream()
                .mapToInt(n -> n)
                .sum();
    }

    public boolean isAllPositive() {
        return nums.stream()
                .allMatch(n -> n >= 0);
    }

    public Set<Integer> getDistinctElements() {
        return new HashSet<>(nums.stream().distinct().toList());
    }

    public Set<Integer> getDistinctElements2() {
        return nums.stream().collect(Collectors.toSet());
    }
}
