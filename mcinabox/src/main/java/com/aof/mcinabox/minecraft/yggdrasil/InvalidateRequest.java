package com.aof.mcinabox.minecraft.yggdrasil;

public class InvalidateRequest {
    private String accessToken;
    private String clientToken;

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }
    public String getClientToken() { return clientToken; }
    public void setClientToken(String clientToken) { this.clientToken = clientToken;}
}
