package racingcar;

import racingcar.controller.RacingController;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        racingController.start();
    }
}
