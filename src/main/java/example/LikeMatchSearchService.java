package example;

import java.util.Collections;
import java.util.List;

public class LikeMatchSearchService implements SearchService {

    public List<Integer> find(String searchObjectName, String searchInput) {
        // implements searching by like matches only
        // empty list is returned for the sake of brevity
        return Collections.emptyList();
    }
}
