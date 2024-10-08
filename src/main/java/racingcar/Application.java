package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        Racing racing = new Racing();
        View view = new View();

        view.start();
    }
}
