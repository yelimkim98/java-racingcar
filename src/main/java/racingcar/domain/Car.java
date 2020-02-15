package racingcar.domain;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int INITIAL_POSITION = 0;

    private final String name;
    private int position;

    public Car(final String name) {
        checkValidName(name);
        this.name = name;
        this.position = INITIAL_POSITION;
    }

    public static void checkValidName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move(RandomNumberWhetherMove random) {
        if (random.canMove()) {
            this.position++;
        }
    }

    public boolean isWinner(int maxDistance) {
        return this.position == maxDistance;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
