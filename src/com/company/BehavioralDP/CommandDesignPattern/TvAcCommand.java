package com.company.BehavioralDP.CommandDesignPattern;

public class TvAcCommand implements Command{
    private Televizyon televizyon = null;

    public TvAcCommand(Televizyon televizyon) {
        this.televizyon = televizyon;
    }

    @Override
    public void execute() {
        televizyon.ac();
    }
}
