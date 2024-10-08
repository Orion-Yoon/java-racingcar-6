package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;

    public RacingGame(List<String> carNames) {
        this.cars = createCars(carNames);
    }

    private List<Car> createCars(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(new Car(name));
        }
        return carList;
    }

    public void race(int raceCount) {
        for (int i = 0; i < raceCount; i++) {
            moveCars();
        }
    }

    private void moveCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getWinners() {
        int maxPosition = findMaxPosition();
        return determineWinners(maxPosition);
    }

    private int findMaxPosition() {
        return cars.stream()
                .mapToInt(car -> car.getPosition())
                .max()
                .orElse(0);
    }

    private List<Car> determineWinners(int maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

}
