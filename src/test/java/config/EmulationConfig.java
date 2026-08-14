package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:emulationemulation.properties"})

public interface EmulationConfig extends Config {
    @Key("os_version")
    String getPlatformVersion();

    @Key("platformName")
    String getPlatformName();

    @Key("deviceName")
    String getDeviceName();

}