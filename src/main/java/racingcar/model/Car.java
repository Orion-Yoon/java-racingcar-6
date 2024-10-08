package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move() {
        if (shouldMove()) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String displayPosition() {
        return name + ":" + "-".repeat(position);
    }

    public boolean isWinner(int maxPosition) {
        return position == maxPosition;
    }

    private boolean shouldMove() {
        return Randoms.pickNumberInRange(1,9) > 3;
    }
}
