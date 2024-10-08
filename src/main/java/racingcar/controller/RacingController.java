package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private RacingGame racingGame;

    public RacingController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void start() {
        List<String> carNames = List.of(inputView.inputCarName());
        int raceCount = inputView.inputRaceCount();
        racingGame = new RacingGame(carNames);

        racingGame.race(raceCount);
        outputView.printResult(racingGame.getCars());
        outputView.printWinner(racingGame.getWinners());
    }
}
