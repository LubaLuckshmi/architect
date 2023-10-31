package seminar8.mvi.view;

import seminar8.mvi.model.ViewState;

/**
 * BaseView - базовый интерфейс для всех видов.
 */

public interface BaseView {
    void render(ViewState state);
}
