package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:device.properties"})
public interface RealDeviceConfig extends Config {
    @Key("deviceName")
    String getDeviceName();

    @Key("platformName")
    String getPlatformName();
}