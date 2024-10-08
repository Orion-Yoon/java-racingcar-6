package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public void printResult(List<Car> cars) {
        System.out.println("실행 결과");
        for (Car car : cars) {
            printCarPosition(car);
        }
        System.out.println();
    }

    private void printCarPosition(Car car) {
        System.out.println(car.displayPosition());
    }

    public void printWinner(List<Car> winners) {
        System.out.println("최종 우승자 : ");
        printWinners(winners);
        System.out.println();
    }

    private void printWinners(List<Car> winners) {
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if (i < winners.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
