package com.lzo.usermanagement.client.fallback;

import com.lzo.usermanagement.client.AuthClient;

public class AuthClientFallback implements AuthClient {
    public String getAuthKey() {
        return "autu server is not available";
    }
}
