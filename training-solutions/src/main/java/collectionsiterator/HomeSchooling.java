package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        lessons.add(lesson);
        lessons.sort(new Comparator<OnlineLesson>() {
            @Override
            public int compare(OnlineLesson o1, OnlineLesson o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {

        List<OnlineLesson> result = new ArrayList<>();
        for (OnlineLesson actual : lessons) {
            if (actual.getLessonTitle().equals(title)) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {

        for (Iterator<OnlineLesson> actual = lessons.iterator(); actual.hasNext(); ) {
            LocalDateTime result = actual.next().getStartTime();
            if (result.equals(startTime)) {
                actual.remove();
            }
        }
    }
}
