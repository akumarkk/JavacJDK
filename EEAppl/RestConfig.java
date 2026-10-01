
package com.craft;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestConfig extends Application {
    // Activates REST endpoints automatically
}