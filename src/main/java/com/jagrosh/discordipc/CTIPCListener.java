package com.jagrosh.discordipc;

import com.google.gson.JsonObject;

public interface CTIPCListener extends IPCListener {

    @Override
    default void onReady(IPCClient client) {
        this.onReady(client);
    }

    @Override
    default void onClose(IPCClient client, JsonObject json) {
        this.onClose(client, json);
    }

    @Override
    default void onDisconnect(IPCClient client, Throwable t) {
        this.onDisconnect(client, t);
    }

    default Object onReady(Object client) {
        return null;
    }

    default Object onClose(Object client, Object json) {
        return null;
    }

    default Object onDisconnect(Object client, Object t) {
        return null;
    }
}
