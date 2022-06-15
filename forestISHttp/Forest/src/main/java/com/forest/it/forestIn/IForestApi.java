package com.forest.it.forestIn;
import com.dtflys.forest.annotation.Get;
import java.util.Map;
@SuppressWarnings("all")
public interface IForestApi {

    @Get("http://ditu.amap.com/service/regeo?longitude={0}&latitude={1}")
    Map getLocation(String longitude, String latitude);
}
