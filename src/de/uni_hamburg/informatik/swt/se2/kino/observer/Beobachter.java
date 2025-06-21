package de.uni_hamburg.informatik.swt.se2.kino.observer;

/**
 * Das Interface für Beobachter, die an Änderungen eines
 * beobachtbaren Objekts interessiert sind.
 * 
 * @author SE2-Team
 * @version SoSe 2024
 */
public interface Beobachter
{
    /**
     * Diese Methode wird aufgerufen, wenn das beobachtete Objekt
     * eine Änderung mitteilt.
     */
    void reagiereAufAenderung();
}