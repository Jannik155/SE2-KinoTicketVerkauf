package de.uni_hamburg.informatik.swt.se2.kino.observer;

/**
 * Interface für Beobachter von Submodulen.
 * 
 * @author SE2-Team
 * @version SoSe 2024
 */
public interface SubmodulBeobachter
{
    /**
     * Diese Methode wird aufgerufen, wenn das beobachtete Submodul
     * eine Änderung mitteilt.
     */
    void reagiereAufAenderung();
}