package sixth.Homework.src.model.data.comparator;

import java.util.Comparator;

public class ComparatorByDateTime<T extends NotesComparator<T>>  implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getDate().compareTo(o2.getDate());
    }      
}
