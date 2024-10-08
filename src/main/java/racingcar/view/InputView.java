package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final int MAX_NAME_LENGTH = 5;
    public String[] inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputName = Console.readLine();
        String[] carNames = inputName.split(",");

        validateCarNames(carNames);

        return carNames;
    }

    public int inputRaceCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        String inputNumber = Console.readLine();

        int raceCount = Integer.parseInt(inputNumber);
        validateRaceCount(raceCount);

        return raceCount;
    }


    // 입력받은 차량 이름 유효성 검사

    private void validateCarNames(String[] carNames) {
        for (String name : carNames) {
            validateCarName(name.trim());
        }
    }

    // 자동차 이름 글자수 제한
    private void validateCarName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자를 넘길 수 없습니다.");
        }
    }

    // 입력받은 게임 횟수 유효성 검사
    private void validateRaceCount(int raceCount) {
        if (raceCount < 1) {
            throw new IllegalArgumentException("게임 횟수는 1회 이상이어야 합니다.");
        }
    }
}
