package com.lzo.user.client.fallback;

import com.lzo.user.client.AuthClient;

public class AuthClientFallback implements AuthClient {
    public String getAuthKey() {
        return "autu server is not available";
    }
}
