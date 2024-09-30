package com.playerdata.server.exception;

public class PlayersFetchException extends RuntimeException {
    public PlayersFetchException(String message) {
        super(message);
    }
}