package com.example.chamthi.enumcation;

public enum EQTypeCode {
    TF("TF"), MC("MC"), MS("MS");
    private final String type;

    private EQTypeCode(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}
