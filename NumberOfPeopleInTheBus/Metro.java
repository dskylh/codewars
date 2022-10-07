package NumberOfPeopleInTheBus;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        // Code here!
        int peopleOnBus = 0;
        for (int[] people : stops) {
            peopleOnBus += people[0];
            peopleOnBus -= people[1];
        }
        return peopleOnBus;
    }
}