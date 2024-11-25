package d4_RecordToModel.d2_AdditionalDeclarations;

import java.util.List;

public record State(String name, String capitalCity, List<String> cities) {

    public State {
        // List.copyOf returns an unmodifiable copy,
        // so the list assigned to `cities` can't change anymore
        cities = List.copyOf(cities);
    }

    public State(String name, String capitalCity) {
        this(name, capitalCity, List.of());
    }

    public State(String name, String capitalCity, String... cities) {
        this(name, capitalCity, List.of(cities));
    }

}
