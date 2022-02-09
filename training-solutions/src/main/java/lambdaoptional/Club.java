package lambdaoptional;

import lambdaintro.Flat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    private List<Member> members = new ArrayList<>();

    public Club(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member actual : members) {
            if (predicate.test(actual)) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if (members.size() == 0) {
            return Optional.empty();
        }
        double sumOfSkills = members.stream()
                .mapToInt(m -> m.getSkills().size())
                .sum();
        return Optional.of(sumOfSkills / members.size());
    }
}
