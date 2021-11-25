package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author David Wandratsch
 * @version 1.0, 25.11.2021, class AutomatedText
 * @link https://github.com/WandratschDavid/4201_simpleBinding
 */
public class AutomatedText
{
    private final StringProperty text = new SimpleStringProperty();

    public String getText()
    {
        return text.get();
    }

    public StringProperty textProperty()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text.set(text);
    }
}