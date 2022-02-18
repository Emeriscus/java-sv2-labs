package activity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Activities {

    List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(a -> a.getClass() == ActivityWithoutTrack.class)
                .count();
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getClass() == ActivityWithTrack.class)
                .count();
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        for (ActivityType actual : ActivityType.values()) {
            result.add(new Report(actual, getDistanceByActivityType(actual)));
        }
        return result;
    }

    private double getDistanceByActivityType(ActivityType activityType) {
        double result = 0;
        for (Activity actual : activities) {
            if (activityType.equals(actual.getType())) {
                result += actual.getDistance();
            }
        }
        return result;
    }
}
