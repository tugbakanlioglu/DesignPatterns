package com.company.BehavioralDP.CommandDesignPattern;

public class TvKapatCommand implements Command {
    private Televizyon televizyon = null;

    public TvKapatCommand(Televizyon televizyon) {
        this.televizyon = televizyon;
    }

    @Override
    public void execute() {
        televizyon.kapat();
    }
}
