package de.uni_hamburg.informatik.swt.se2.kino.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstrakte Basisklasse für beobachtbare Objekte.
 * Diese Klasse implementiert das Observer-Pattern und erlaubt es,
 * dass sich andere Objekte als Beobachter registrieren können.
 * 
 * @author SE2-Team
 * @version SoSe 2024
 */
public abstract class Beobachtbar
{
    // Liste der Beobachter
    private List<Beobachter> _beobachter;

    /**
     * Initialisiert ein neues beobachtbares Objekt.
     */
    public Beobachtbar()
    {
        _beobachter = new ArrayList<>();
    }

    /**
     * Fügt einen Beobachter hinzu.
     * 
     * @param beobachter der Beobachter
     * @require beobachter != null
     */
    public void registriereBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(beobachter);
    }

    /**
     * Entfernt einen Beobachter.
     * 
     * @param beobachter der Beobachter
     * @require beobachter != null
     */
    public void entferneBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.remove(beobachter);
    }

    /**
     * Informiert alle Beobachter, dass eine Änderung stattgefunden hat.
     */
    protected void informiereAlleBeobachter()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung();
        }
    }
}