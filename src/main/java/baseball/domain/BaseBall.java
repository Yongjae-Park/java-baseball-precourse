package baseball.domain;

import baseball.console.Input;
import baseball.console.Output;

public class BaseBall {
    private final Referee referee;
    private final Computer computer;

    public BaseBall() {
        this.computer = new Computer();
        this.referee = new Referee();
    }

    public void playGame() {
        String generatedNumber = computer.generateNumber();
        int[] scores = {0, 0};
        while (scores[ScoreOption.STRIKE.getOption()] != InputCondition.NUMBER_LENGTH.getValue()) {
            String inputNumber = Input.getNumber();
            scores = referee.scoreRater(inputNumber, generatedNumber);
            Output.printMessage(Output.generateMessage(scores));
        }
        Output.printMessage(Message.WIN_MESSAGE.getMessage());
        endGame();
    }

    private void endGame() {
        String restartOption = Input.getRestartOption();
        boolean isRestart = computer.isRestart(restartOption);
        if (isRestart)
            playGame();
        endMessage(isRestart);
    }

    private void endMessage(boolean isRestart) {
        if(!isRestart)
            Output.printMessage(Message.END_MESSAGE.getMessage());
    }
}
