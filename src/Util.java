import java.util.ArrayList;
import java.util.List;

class Util {
    public static List<State> buildStateList() {
        State state = new State();
        state.setCode("STU");
        state.setName("STUTTGART");
        List<State> stateList = new ArrayList<>();
        stateList.add(state);
        return stateList;
    }
}
