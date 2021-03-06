package pl.bestsoft.snake.view.main_frame;

import pl.bestsoft.snake.util.Const;

import javax.swing.*;
import java.awt.*;

/**
 * Informacjie o liczbie zdobytych punktów przez gracza.
 */
class PlayerScorePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    /**
     * Label na której wyświetlane są informacje o liczbie zdobytych punktów przez graczy
     */
    private final JLabel score;

    PlayerScorePanel(final Color color) {
        setSize(40, 40);
        setBackground(color);
        setLayout(null);
        score = new JLabel();
        score.setFont(Const.Fonts.BTN_FONT_BOLD);
        score.setBounds(35, 20, 50, 30);
        score.setText("0");
        add(score);
    }

    /**
     * Aktualizacja liczby zdobytych punktw.
     *
     * @param newScore nowa liczba zdobytych punktw
     */
    void actScore(final Integer newScore) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                score.setText(newScore.toString());
            }
        });
    }

}
